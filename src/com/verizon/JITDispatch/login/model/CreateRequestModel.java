package com.verizon.JITDispatch.login.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.verizon.JITDispatch.utilities.DBHandler;

public class CreateRequestModel {

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

				System.out.println("userid: " + userid + ", password: " + password + ", type: " + type);
			}

			dbHandler.closeConnection();

		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}

	public String[] getUserLatLong(String userName) {
		String[] userLatLong = new String[2];

		DBHandler dbHandler = new DBHandler();
		String query = "SELECT LATITUDE, LONGITUDE FROM CUSTOMER WHERE NAME='" + userName + "'";
		System.out.println("query: " + query);
		
		String lattitude;
		String longitude;
		
		try {
			ResultSet rs = dbHandler.execSelectQuery(query);
			while (rs.next()) {
				lattitude = rs.getString(1);
				longitude = rs.getString(2);
				userLatLong[0] = lattitude;
				userLatLong[1] = longitude;
				System.out.println("lattitude: " + lattitude + ", longitude: " + longitude);
			}

			dbHandler.closeConnection();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return userLatLong;
	}
	
/*	public ArrayList<String[]> getTechnicianLatLongList(String skill, String[] userLatLong) {
		ArrayList<String[]> technicianLatLongList = new ArrayList<String[]>(0);
		
		
		String lattitude = userLatLong[0];
		String longitude = userLatLong[1];
		
		DBHandler dbHandler = new DBHandler();
		
		String query = "select NAME, LATITUDE, LONGITUDE, " +
				"((6387.7 * ACOS((sin(LATITUDE / 57.29577951) * SIN(" + lattitude + " / 57.29577951)) + " +
						"(COS(LATITUDE / 57.29577951) * COS(" + lattitude + " / 57.29577951) * " +
						"COS(" + longitude + " / 57.29577951 - LONGITUDE/ 57.29577951)))) * 1000) distance " +
				" from tech_person " +
				"where ((6387.7 * ACOS((sin(LATITUDE / 57.29577951) * SIN(" + lattitude + " / 57.29577951)) + " +
						"(COS(LATITUDE / 57.29577951) * COS(" + lattitude + " / 57.29577951) * " +
						"COS(" + longitude + " / 57.29577951 - LONGITUDE/ 57.29577951)))) * 1000) < 10000 and STATUS = 'ACTIVE' AND SKILL='" + skill + "'" + 
						" order by distance";
		System.out.println("query: " + query);
		
		String name;
		String lattitudeTemp;
		String longitudeTemp;
		String distanceTemp;
		
		try {
			ResultSet rs = dbHandler.execSelectQuery(query);
			while (rs.next()) {
				String[] techLatLong = new String[4];
				name = rs.getString(1);
				lattitudeTemp = rs.getString(2);
				longitudeTemp = rs.getString(3);
				distanceTemp = rs.getString(4);
				
				techLatLong[0] = name;
				techLatLong[1] = lattitudeTemp;
				techLatLong[2] = longitudeTemp;
				techLatLong[3] = distanceTemp;
				
				System.out.println("Name: " + name + ", lattitudeTemp: " + lattitudeTemp + ", longitudeTemp: " + longitudeTemp + ", distanceTemp: " + distanceTemp);
				
				technicianLatLongList.add(techLatLong);
			}

			dbHandler.closeConnection();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return technicianLatLongList;
	}
*/	
	public ArrayList<String[]> getTechnicianLatLongList(String skill, String[] userLatLong, String flag, String userName) {
		ArrayList<String[]> technicianLatLongList = new ArrayList<String[]>(0);
		
		
		String lattitude = userLatLong[0];
		String longitude = userLatLong[1];
		
		DBHandler dbHandler = new DBHandler();
		
		String query = "select NAME, LATITUDE, LONGITUDE, " +
				"((6387.7 * ACOS((sin(LATITUDE / 57.29577951) * SIN(" + lattitude + " / 57.29577951)) + " +
						"(COS(LATITUDE / 57.29577951) * COS(" + lattitude + " / 57.29577951) * " +
						"COS(" + longitude + " / 57.29577951 - LONGITUDE/ 57.29577951)))) * 1000) distance " +
				" from tech_person " +
				"where ((6387.7 * ACOS((sin(LATITUDE / 57.29577951) * SIN(" + lattitude + " / 57.29577951)) + " +
						"(COS(LATITUDE / 57.29577951) * COS(" + lattitude + " / 57.29577951) * " +
						"COS(" + longitude + " / 57.29577951 - LONGITUDE/ 57.29577951)))) * 1000) < 10000 ";
		
			if(flag.equalsIgnoreCase("ASSIGNED") || flag.equalsIgnoreCase("ACCEPTED")
					|| flag.equalsIgnoreCase("REACHED") || flag.equalsIgnoreCase("PROGRESS")){
				query += " AND STATUS in ('ASSIGNED','ACCEPTED','REACHED','PROGRESS') AND USER_NAME='"+userName+"'";
			} else {
				query += " AND STATUS = 'ACTIVE'  AND SKILL='" + skill + "'"; 
			}
				
			query +=" order by distance";
		
		
		System.out.println("query: " + query);
		
		String name;
		String lattitudeTemp;
		String longitudeTemp;
		String distanceTemp;
		
		try {
			ResultSet rs = dbHandler.execSelectQuery(query);
			while (rs.next()) {
				String[] techLatLong = new String[4];
				name = rs.getString(1);
				lattitudeTemp = rs.getString(2);
				longitudeTemp = rs.getString(3);
				distanceTemp = rs.getString(4);
				
				techLatLong[0] = name;
				techLatLong[1] = lattitudeTemp;
				techLatLong[2] = longitudeTemp;
				techLatLong[3] = distanceTemp;
				
				System.out.println("Name: " + name + ", lattitudeTemp: " + lattitudeTemp + ", longitudeTemp: " + longitudeTemp + ", distanceTemp: " + distanceTemp);
				
				technicianLatLongList.add(techLatLong);
			}

			dbHandler.closeConnection();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return technicianLatLongList;
	}
	
	public ArrayList<String[]> checkMyJob(String userName)
	{
		DBHandler dbHandler = new DBHandler();
		String query = "SELECT TECH_NAME, tp.latitude, tp.longitude, tp.status FROM CUSTOMER CU, TECH_PERSON TP WHERE cu.tech_name=tp.name AND " +
				"CU.NAME = '" + userName + "' AND JOBREQUEST = 'Y' AND TP.STATUS IN ('ASSIGNED','ACCEPTED','REACHED','PROGRESS')";
		System.out.println("query: " + query);
		
		String name;
		String lattitudeTemp;
		String longitudeTemp;
		String status;
		ArrayList<String[]> technicianJobList = new ArrayList<String[]>(0);
		
		try {
			ResultSet rs = dbHandler.execSelectQuery(query);
			
			while (rs.next()) {
				String[] techLatLong = new String[4];
				name = rs.getString(1);
				lattitudeTemp = rs.getString(2);
				longitudeTemp = rs.getString(3);
				status = rs.getString(4);
				
				techLatLong[0] = name;
				techLatLong[1] = lattitudeTemp;
				techLatLong[2] = longitudeTemp;
				techLatLong[3] = status;
				
				System.out.println("Name: " + name + ", lattitudeTemp: " + lattitudeTemp + ", longitudeTemp: " + longitudeTemp+ ", status: " + status);
				
				technicianJobList.add(techLatLong);
			}
			
			dbHandler.closeConnection();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return technicianJobList;
	}
	
	public String assignRequest(String userName, String techName, String issueName)
	{
		String status = "Success";
		
		assignRequestToUser(userName, techName, issueName);
		
		assignRequestToTechnican(userName, techName);
		
		return status;
	}
	
	public void assignRequestToUser(String userName, String techName, String issueName)
	{
		DBHandler dbHandler = new DBHandler();
		String query = "UPDATE CUSTOMER SET JOBREQUEST = 'Y', TECH_NAME = '" + techName + "', JOBTYPE = '" + issueName + 
				"' WHERE NAME = '" + userName + "'";
		System.out.println("query: " + query);
		
		try {
			dbHandler.execDMLQuery(query);

			dbHandler.closeConnection();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void assignRequestToTechnican(String userName, String techName)
	{
		DBHandler dbHandler = new DBHandler();
		String query = "UPDATE TECH_PERSON SET STATUS = 'ASSIGNED', USER_NAME = '" + userName + "' WHERE NAME = '" + techName + "'";
		System.out.println("query: " + query);
		
		try {
			dbHandler.execDMLQuery(query);

			dbHandler.closeConnection();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void cancelRequest(String userName)
	{
		String techName=null;
		DBHandler dbHandler = new DBHandler();
		String query = "SELECT CU.TECH_NAME FROM CUSTOMER CU " +
				 " where CU.NAME ='" + userName + "'";
		System.out.println("query: " + query);
		
		try {
			ResultSet rs = dbHandler.execSelectQuery(query);
			while (rs.next()) {
				techName=rs.getString(1);
			}

			String query1 = "UPDATE TECH_PERSON SET STATUS = 'ACTIVE', USER_NAME=NULL " +
					" WHERE NAME = '" + techName + "'";
					System.out.println("query: " + query1);
					

					try {
						dbHandler.execDMLQuery(query1);
					
					} catch (Exception e) {
						e.printStackTrace();
					}

					String query2 = "UPDATE CUSTOMER SET TECH_NAME = NULL,JOBTYPE=NULL,JOBREQUEST='N' " +
							" WHERE NAME = '" + userName + "'";
							System.out.println("query: " + query2);
							

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
