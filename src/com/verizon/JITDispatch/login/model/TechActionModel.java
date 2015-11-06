package com.verizon.JITDispatch.login.model;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.verizon.JITDispatch.tech.action.TechThread;
import com.verizon.JITDispatch.utilities.DBHandler;

public class TechActionModel{
	private static Logger logger = Logger.getLogger("JITDispatch");
	Thread t1=new Thread();
	public void testDBConnection() {
		DBHandler dbHandler = new DBHandler();
		String query = "Select * from login";
		String userid;
		String password;
		int type;

		try {
			ResultSet rs = dbHandler.execSelectQuery(query);
			while (rs.next()) {
				userid = rs.getString(1);
				password = rs.getString(2);
				type = rs.getInt(3);

				logger.debug("userid: " + userid + ", password: " + password + ", type: " + type);
			}

			dbHandler.closeConnection();

		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}

	public String getTechStatus(String techName)
	{
		String Status=null;
		DBHandler dbHandler = new DBHandler();
		String query = "SELECT TP.STATUS FROM TECH_PERSON TP " +
				 " where TP.NAME ='" + techName + "'";
		logger.debug("query: " + query);
		
		try {
			ResultSet rs = dbHandler.execSelectQuery(query);
			while (rs.next()) {
				Status=rs.getString(1);
			}

			dbHandler.closeConnection();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return Status;
	}

	public void setTechStatus(String techName,String status)
	{
		DBHandler dbHandler = new DBHandler();
		
		String query = "UPDATE TECH_PERSON SET STATUS = '" + status +"'" +
		" WHERE NAME = '" + techName + "'";
		logger.debug("query: " + query);
		

		try {
			dbHandler.execDMLQuery(query);
			dbHandler.closeConnection();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String[] getTechUserLatLong(String techName)
	{
		String[] userLatLong = new String[4];
		
		DBHandler dbHandler = new DBHandler();
		String query = "SELECT TP.LATITUDE, TP.LONGITUDE, CU.LATITUDE, CU.LONGITUDE FROM TECH_PERSON TP, CUSTOMER CU "
				+ " where TP.USER_NAME = CU.NAME and TP.NAME='" + techName + "'";
		logger.debug("query: " + query);
		
		try {
			ResultSet rs = dbHandler.execSelectQuery(query);
			while (rs.next()) {
				userLatLong[0] = rs.getString(1);
				userLatLong[1] = rs.getString(2);
				userLatLong[2] = rs.getString(3);
				userLatLong[3] = rs.getString(4);
			}

			dbHandler.closeConnection();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return userLatLong;
	}
	
	public String[] getPendingResuests(String techName) {
		String[] userLatLong = new String[4];

		DBHandler dbHandler = new DBHandler();
		String query = "SELECT TP.LATITUDE, TP.LONGITUDE, CU.LATITUDE, CU.LONGITUDE FROM TECH_PERSON TP, CUSTOMER CU "
				+ " where TP.USER_NAME = CU.NAME and TP.STATUS='ASSIGNED'";
		logger.debug("query: " + query);
		
		try {
			ResultSet rs = dbHandler.execSelectQuery(query);
			while (rs.next()) {
				userLatLong[0] = rs.getString(1);
				userLatLong[1] = rs.getString(2);
				userLatLong[2] = rs.getString(3);
				userLatLong[3] = rs.getString(4);
				logger.debug("slattitude: " + userLatLong[0] + ", slongitude: " + userLatLong[1]);
				logger.debug("tlattitude: " + userLatLong[2] + ", tlongitude: " + userLatLong[3]);
			}

			dbHandler.closeConnection();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return userLatLong;
	}
	
	
	public String acceptRequest(String techName)
	{
		String[] userLatLong = new String[4];
		String status="Success";
		DBHandler dbHandler = new DBHandler();
		String query = "UPDATE TECH_PERSON SET STATUS = 'ACCEPTED'" + 
				" WHERE NAME = '" + techName + "'";
		logger.debug("query: " + query);
		
		try {
			dbHandler.execDMLQuery(query);

			dbHandler.closeConnection();
			userLatLong = getTechUserLatLong(techName);
			String url="https://maps.googleapis.com/maps/api/directions/json?origin="+userLatLong[0]+","+userLatLong[1]+
					"&destination=" + userLatLong[2] + "," + userLatLong[3];
			
			String urljson = callURL(url);
			status = parsePolyline(urljson,techName);



		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	public String callURL(String myURL)
	{
		logger.debug("Requeted URL:" + myURL);
		String response;
		HttpURLConnection urlConn = null;
		
		
		try {
			URL url = new URL(myURL);
			logger.debug("1");
			Proxy proxy = new Proxy(Proxy.Type.HTTP,new InetSocketAddress("proxy.ebiz.verizon.com", 80));
			urlConn = (HttpURLConnection)url.openConnection(proxy);
			logger.debug("2");
			urlConn.setRequestMethod("GET");
			logger.debug("3");
			InputStream is = urlConn.getInputStream();
			BufferedReader in = new BufferedReader(new InputStreamReader(is));
			StringBuilder sb = new StringBuilder();
			int cp;
			while((cp=in.read())!=-1)
			{
				sb.append((char)cp);
			}
			response = sb.toString();
			
		} catch (Exception e) {
			throw new RuntimeException("Exception while calling URL:"+ myURL, e);
		} 
 
		return response;
	
	}
	
	public ArrayList  decodeLatlongs(String encoded)
	{
		  ArrayList poly = new ArrayList();
		  int index = 0, len = encoded.length();
		  int lat = 0, lng = 0;
		  while (index < len) {
		   int b, shift = 0, result = 0;
		   do {
		    b = encoded.charAt(index++) - 63;
		    result |= (b & 0x1f) << shift;
		    shift += 5;
		   } while (b >= 0x20);
		   int dlat = ((result & 1) != 0 ? ~(result >> 1) : (result >> 1));
		   lat += dlat;
		   shift = 0;
		   result = 0;
		   do {
		    b = encoded.charAt(index++) - 63;
		    result |= (b & 0x1f) << shift;
		    shift += 5;
		   } while (b >= 0x20);
		   int dlng = ((result & 1) != 0 ? ~(result >> 1) : (result >> 1));
		   lng += dlng;
		   String Latlongs;
		   Latlongs = ((double) lat / 1E5) + "," + ((double) lng / 1E5);
		   poly.add(Latlongs);
		  }
		  return poly;
	}

	
	
	public String parsePolyline(String jsonobj,String techName)
	{
		
		try {
			//logger.debug(jsonobj);
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonobj);
			JSONArray routesObj = (JSONArray) jsonObject.get("routes");
			boolean found = false;
			String encondedlatlongs = null;
			Iterator ite = routesObj.iterator();
			while(ite.hasNext())
			{
				JSONObject innerObj = (JSONObject)ite.next();
				if (innerObj.containsKey("overview_polyline"))
				{
				//	logger.debug("POLY" + innerObj.toString());
					JSONObject temp = (JSONObject)innerObj.get("overview_polyline");
					encondedlatlongs = (String) temp.get("points");
					found = true;
				}
			}
			if (found)
			{
			
				ArrayList coords = decodeLatlongs(encondedlatlongs);
				SimulateGPS(coords,techName);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
	}
	
	public void SimulateGPS(ArrayList coords,String techName)
	{
		try {
				TechThread tt = new TechThread(techName,coords);
				Thread t1= new Thread(tt);
				t1.start();				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setJobCompleted(String techName)
	{
		String username=null;
		DBHandler dbHandler = new DBHandler();
		String query = "SELECT TP.USER_NAME FROM TECH_PERSON TP " +
				 " where TP.NAME ='" + techName + "'";
		logger.debug("query: " + query);
		
		try {
			ResultSet rs = dbHandler.execSelectQuery(query);
			while (rs.next()) {
				username=rs.getString(1);
			}

			String query1 = "UPDATE TECH_PERSON SET STATUS = 'ACTIVE', USER_NAME=NULL " +
					" WHERE NAME = '" + techName + "'";
					logger.debug("query: " + query1);
					

					try {
						dbHandler.execDMLQuery(query1);
					
					} catch (Exception e) {
						e.printStackTrace();
					}

					String query2 = "UPDATE CUSTOMER SET TECH_NAME = NULL,JOBTYPE=NULL,JOBREQUEST='N' " +
							" WHERE NAME = '" + username + "'";
							logger.debug("query: " + query2);
							

							try {
								dbHandler.execDMLQuery(query2);
							
							} catch (Exception e) {
								e.printStackTrace();
							}
		
					
			dbHandler.closeConnection();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}
