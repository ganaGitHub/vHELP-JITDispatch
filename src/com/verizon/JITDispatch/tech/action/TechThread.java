package com.verizon.JITDispatch.tech.action;

import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import com.verizon.JITDispatch.login.model.TechActionModel;
import com.verizon.JITDispatch.utilities.DBHandler;

public class TechThread implements Runnable {
	private static Logger logger = Logger.getLogger("JITDispatch");
	String gtechName;
	ArrayList gcoords;
	public TechThread(String techName,ArrayList coords)
	{
		gtechName = techName;
		gcoords =coords;		
	}
	public void run()
	{			
		TechActionModel tam = new TechActionModel();
		for (int i = 0;i<gcoords.size();i++)
		{
			if (tam.getTechStatus(gtechName).equals("ACCEPTED"))
			{
				DBHandler dbHandler = new DBHandler();
				String[] latlong = ((String)gcoords.get(i)).split(",");
				String query = "UPDATE TECH_PERSON SET LATITUDE = " + latlong[0] + ", LONGITUDE = " + latlong[1] +
				" WHERE NAME = '" + gtechName + "'";
				logger.debug("query: " + query);
				logger.debug("Adithya "+latlong[0] +latlong[1] );
		
				try {
					dbHandler.execDMLQuery(query);
					dbHandler.closeConnection();
					Thread.sleep(3000);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			else
			{
						break;
			}
		}
		DBHandler dbHandler = new DBHandler();
		
		String query = "UPDATE TECH_PERSON SET STATUS = 'REACHED'" +
		" WHERE NAME = '" + gtechName + "'";
		logger.debug("query: " + query);
		

		try {
			dbHandler.execDMLQuery(query);
			dbHandler.closeConnection();
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
}
