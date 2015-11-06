package com.verizon.JITDispatch.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class DBHandler {
	private static Logger logger = Logger.getLogger("JITDispatch");
	private static DBHandler dbObj = null;
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	private String driver;
	private String url;
	private String user;
	private String pwd;

	/** Creates a new instance of DBHandler. Make it private */
	public DBHandler() {
		driver = "oracle.jdbc.driver.OracleDriver";
		url = "jdbc:oracle:thin:@ipisacgda01.ebiz.verizon.com:1313:sacgda01";
		user = "scrubit1";
		pwd = "scrubit1";
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(url, user, pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//logger.debug("oracle.jdbc.drivers: " + driver);
		//logger.debug("oracle.jdbc.url: " + url);
		//logger.debug("oracle.jdbc.userid: " + user);
		//logger.debug("oracle.jdbc.password: " + pwd);
	}

	/**
	 * Returns DBHandler object.
	 */
	public static DBHandler getInstance() {
		if (dbObj == null) {
			dbObj = new DBHandler();
			//logger.debug("Creating the instance of DBHandler");
			if (dbObj.createConnection() != true) {
				//logger.debug("Failed to create data base connection");
				dbObj = null;
			}
			else
			{
				//logger.debug("Successfully created data base connection");
			}
		}
		return dbObj;
	}

	/**
	 * Create a database connection to Oracle
	 */
	private boolean createConnection() {
		try {
			//logger.debug("Creating the Oracle data base connection");
			// System.setProperty("jdbc.drivers", driver);
			// DriverManager.registerDriver(new
			// oracle.jdbc.driver.OracleDriver());
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pwd);
			//conn.setTransactionIsolation(conn.TRANSACTION_READ_UNCOMMITTED);
			return true;
		} catch (Exception exe) {
			logger.debug("Exception caught: " + exe.getMessage());
			return false;
		}
	}

	/**
	 * Return connection
	 */
	public Connection getConnection() {
		return conn;
	}

	/**
	 * Executes a DML Query. Internally, it calls a execQuery(). This is for
	 * SELECT Query.
	 */
	public ResultSet execSelectQuery(String query) throws SQLException {
		try {
			if (conn == null)
				createConnection();
			stmt = conn.prepareStatement(query);
			rs = stmt.executeQuery();
		} catch (SQLException se) {
			logger.debug("SQLException: " + se.getMessage());
			throw se;
		}
		return rs;
	}

	/**
	 * Executes a DML Query. Internally, it calls a execUpdate(). This is for
	 * INSERT, UPDATE, DELETE and a DDL Queries.
	 */
	public int execDMLQuery(String query) throws SQLException {
		int status = 0;
		try {
			if (conn == null)
				createConnection();
			stmt = conn.prepareStatement(query);
			status = stmt.executeUpdate();
		} catch (SQLException se) {
			logger.debug("SQLException: " + se.getMessage());
			throw se;
		}
		return status;
	}

	/** Close the prepareStatement */
	public void closeStatement() throws SQLException {
		try {
			stmt.close();
		} catch (SQLException se) {
			logger.debug("SQLException: " + se.getMessage());
			throw se;
		}
	}

	/** Close the Connection */
	public void closeConnection() throws SQLException {
		try {
			conn.close();
			dbObj = null;			
		} catch (SQLException se) {
			logger.debug("SQLException: " + se.getMessage());
			throw se;
		}
	}
}
