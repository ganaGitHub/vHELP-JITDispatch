package com.verizon.JITDispatch.utilities;

import java.sql.Connection;
import java.sql.ResultSet;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DBHandlerTest</code> contains tests for the class <code>{@link DBHandler}</code>.
 *
 * @generatedBy CodePro at 11/17/15 5:18 AM
 * @author Administrator
 * @version $Revision: 1.0 $
 */
public class DBHandlerTest {
	/**
	 * Run the DBHandler() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/17/15 5:18 AM
	 */
	@Test
	public void testDBHandler_1()
		throws Exception {

		DBHandler result = new DBHandler();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at oracle.net.nt.TcpNTAdapter.getOutputStream(Unknown Source)
		//       at oracle.net.ns.NSProtocol.establishConnection(Unknown Source)
		//       at oracle.net.ns.NSProtocol.connect(Unknown Source)
		//       at oracle.jdbc.driver.T4CConnection.connect(T4CConnection.java:856)
		//       at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:268)
		//       at oracle.jdbc.driver.PhysicalConnection.<init>(PhysicalConnection.java:439)
		//       at oracle.jdbc.driver.T4CConnection.<init>(T4CConnection.java:165)
		//       at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:35)
		//       at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:801)
		//       at java.sql.DriverManager.getConnection(Unknown Source)
		//       at java.sql.DriverManager.getConnection(Unknown Source)
		//       at com.verizon.JITDispatch.utilities.DBHandler.<init>(DBHandler.java:35)
		assertNotNull(result);
	}

	/**
	 * Run the DBHandler() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/17/15 5:18 AM
	 */
	@Test
	public void testDBHandler_2()
		throws Exception {

		DBHandler result = new DBHandler();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at oracle.net.nt.TcpNTAdapter.getOutputStream(Unknown Source)
		//       at oracle.net.ns.NSProtocol.establishConnection(Unknown Source)
		//       at oracle.net.ns.NSProtocol.connect(Unknown Source)
		//       at oracle.jdbc.driver.T4CConnection.connect(T4CConnection.java:856)
		//       at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:268)
		//       at oracle.jdbc.driver.PhysicalConnection.<init>(PhysicalConnection.java:439)
		//       at oracle.jdbc.driver.T4CConnection.<init>(T4CConnection.java:165)
		//       at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:35)
		//       at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:801)
		//       at java.sql.DriverManager.getConnection(Unknown Source)
		//       at java.sql.DriverManager.getConnection(Unknown Source)
		//       at com.verizon.JITDispatch.utilities.DBHandler.<init>(DBHandler.java:35)
		assertNotNull(result);
	}

	/**
	 * Run the DBHandler() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/17/15 5:18 AM
	 */
	@Test
	public void testDBHandler_3()
		throws Exception {

		DBHandler result = new DBHandler();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at oracle.net.nt.TcpNTAdapter.getOutputStream(Unknown Source)
		//       at oracle.net.ns.NSProtocol.establishConnection(Unknown Source)
		//       at oracle.net.ns.NSProtocol.connect(Unknown Source)
		//       at oracle.jdbc.driver.T4CConnection.connect(T4CConnection.java:856)
		//       at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:268)
		//       at oracle.jdbc.driver.PhysicalConnection.<init>(PhysicalConnection.java:439)
		//       at oracle.jdbc.driver.T4CConnection.<init>(T4CConnection.java:165)
		//       at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:35)
		//       at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:801)
		//       at java.sql.DriverManager.getConnection(Unknown Source)
		//       at java.sql.DriverManager.getConnection(Unknown Source)
		//       at com.verizon.JITDispatch.utilities.DBHandler.<init>(DBHandler.java:35)
		assertNotNull(result);
	}

	/**
	 * Run the DBHandler() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/17/15 5:18 AM
	 */
	@Test
	public void testDBHandler_4()
		throws Exception {

		DBHandler result = new DBHandler();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at oracle.net.nt.TcpNTAdapter.getOutputStream(Unknown Source)
		//       at oracle.net.ns.NSProtocol.establishConnection(Unknown Source)
		//       at oracle.net.ns.NSProtocol.connect(Unknown Source)
		//       at oracle.jdbc.driver.T4CConnection.connect(T4CConnection.java:856)
		//       at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:268)
		//       at oracle.jdbc.driver.PhysicalConnection.<init>(PhysicalConnection.java:439)
		//       at oracle.jdbc.driver.T4CConnection.<init>(T4CConnection.java:165)
		//       at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:35)
		//       at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:801)
		//       at java.sql.DriverManager.getConnection(Unknown Source)
		//       at java.sql.DriverManager.getConnection(Unknown Source)
		//       at com.verizon.JITDispatch.utilities.DBHandler.<init>(DBHandler.java:35)
		assertNotNull(result);
	}

	/**
	 * Run the void closeConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/17/15 5:18 AM
	 */
	@Test
	public void testCloseConnection_1()
		throws Exception {
		DBHandler fixture = new DBHandler();

		fixture.closeConnection();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at oracle.net.nt.TcpNTAdapter.getOutputStream(Unknown Source)
		//       at oracle.net.ns.NSProtocol.establishConnection(Unknown Source)
		//       at oracle.net.ns.NSProtocol.connect(Unknown Source)
		//       at oracle.jdbc.driver.T4CConnection.connect(T4CConnection.java:856)
		//       at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:268)
		//       at oracle.jdbc.driver.PhysicalConnection.<init>(PhysicalConnection.java:439)
		//       at oracle.jdbc.driver.T4CConnection.<init>(T4CConnection.java:165)
		//       at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:35)
		//       at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:801)
		//       at java.sql.DriverManager.getConnection(Unknown Source)
		//       at java.sql.DriverManager.getConnection(Unknown Source)
		//       at com.verizon.JITDispatch.utilities.DBHandler.<init>(DBHandler.java:35)
	}

	/**
	 * Run the void closeStatement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/17/15 5:18 AM
	 */
	@Test
	public void testCloseStatement_1()
		throws Exception {
		DBHandler fixture = new DBHandler();

		fixture.closeStatement();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at oracle.net.nt.TcpNTAdapter.getOutputStream(Unknown Source)
		//       at oracle.net.ns.NSProtocol.establishConnection(Unknown Source)
		//       at oracle.net.ns.NSProtocol.connect(Unknown Source)
		//       at oracle.jdbc.driver.T4CConnection.connect(T4CConnection.java:856)
		//       at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:268)
		//       at oracle.jdbc.driver.PhysicalConnection.<init>(PhysicalConnection.java:439)
		//       at oracle.jdbc.driver.T4CConnection.<init>(T4CConnection.java:165)
		//       at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:35)
		//       at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:801)
		//       at java.sql.DriverManager.getConnection(Unknown Source)
		//       at java.sql.DriverManager.getConnection(Unknown Source)
		//       at com.verizon.JITDispatch.utilities.DBHandler.<init>(DBHandler.java:35)
	}

	/**
	 * Run the int execDMLQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/17/15 5:18 AM
	 */
	@Test
	public void testExecDMLQuery_1()
		throws Exception {
		DBHandler fixture = new DBHandler();
		String query = "";

		int result = fixture.execDMLQuery(query);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at oracle.net.nt.TcpNTAdapter.getOutputStream(Unknown Source)
		//       at oracle.net.ns.NSProtocol.establishConnection(Unknown Source)
		//       at oracle.net.ns.NSProtocol.connect(Unknown Source)
		//       at oracle.jdbc.driver.T4CConnection.connect(T4CConnection.java:856)
		//       at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:268)
		//       at oracle.jdbc.driver.PhysicalConnection.<init>(PhysicalConnection.java:439)
		//       at oracle.jdbc.driver.T4CConnection.<init>(T4CConnection.java:165)
		//       at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:35)
		//       at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:801)
		//       at java.sql.DriverManager.getConnection(Unknown Source)
		//       at java.sql.DriverManager.getConnection(Unknown Source)
		//       at com.verizon.JITDispatch.utilities.DBHandler.<init>(DBHandler.java:35)
		assertEquals(0, result);
	}

	/**
	 * Run the ResultSet execSelectQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/17/15 5:18 AM
	 */
	@Test
	public void testExecSelectQuery_1()
		throws Exception {
		DBHandler fixture = new DBHandler();
		String query = "";

		ResultSet result = fixture.execSelectQuery(query);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at oracle.net.nt.TcpNTAdapter.getOutputStream(Unknown Source)
		//       at oracle.net.ns.NSProtocol.establishConnection(Unknown Source)
		//       at oracle.net.ns.NSProtocol.connect(Unknown Source)
		//       at oracle.jdbc.driver.T4CConnection.connect(T4CConnection.java:856)
		//       at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:268)
		//       at oracle.jdbc.driver.PhysicalConnection.<init>(PhysicalConnection.java:439)
		//       at oracle.jdbc.driver.T4CConnection.<init>(T4CConnection.java:165)
		//       at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:35)
		//       at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:801)
		//       at java.sql.DriverManager.getConnection(Unknown Source)
		//       at java.sql.DriverManager.getConnection(Unknown Source)
		//       at com.verizon.JITDispatch.utilities.DBHandler.<init>(DBHandler.java:35)
		assertNotNull(result);
	}

	/**
	 * Run the Connection getConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/17/15 5:18 AM
	 */
	@Test
	public void testGetConnection_1()
		throws Exception {
		DBHandler fixture = new DBHandler();

		Connection result = fixture.getConnection();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at oracle.net.nt.TcpNTAdapter.getOutputStream(Unknown Source)
		//       at oracle.net.ns.NSProtocol.establishConnection(Unknown Source)
		//       at oracle.net.ns.NSProtocol.connect(Unknown Source)
		//       at oracle.jdbc.driver.T4CConnection.connect(T4CConnection.java:856)
		//       at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:268)
		//       at oracle.jdbc.driver.PhysicalConnection.<init>(PhysicalConnection.java:439)
		//       at oracle.jdbc.driver.T4CConnection.<init>(T4CConnection.java:165)
		//       at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:35)
		//       at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:801)
		//       at java.sql.DriverManager.getConnection(Unknown Source)
		//       at java.sql.DriverManager.getConnection(Unknown Source)
		//       at com.verizon.JITDispatch.utilities.DBHandler.<init>(DBHandler.java:35)
		assertNotNull(result);
	}

	/**
	 * Run the DBHandler getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/17/15 5:18 AM
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {

		DBHandler result = DBHandler.getInstance();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at oracle.net.nt.TcpNTAdapter.getOutputStream(Unknown Source)
		//       at oracle.net.ns.NSProtocol.establishConnection(Unknown Source)
		//       at oracle.net.ns.NSProtocol.connect(Unknown Source)
		//       at oracle.jdbc.driver.T4CConnection.connect(T4CConnection.java:856)
		//       at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:268)
		//       at oracle.jdbc.driver.PhysicalConnection.<init>(PhysicalConnection.java:439)
		//       at oracle.jdbc.driver.T4CConnection.<init>(T4CConnection.java:165)
		//       at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:35)
		//       at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:801)
		//       at java.sql.DriverManager.getConnection(Unknown Source)
		//       at java.sql.DriverManager.getConnection(Unknown Source)
		//       at com.verizon.JITDispatch.utilities.DBHandler.<init>(DBHandler.java:35)
		//       at com.verizon.JITDispatch.utilities.DBHandler.getInstance(DBHandler.java:51)
		assertNotNull(result);
	}

	/**
	 * Run the DBHandler getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/17/15 5:18 AM
	 */
	@Test
	public void testGetInstance_2()
		throws Exception {

		DBHandler result = DBHandler.getInstance();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at oracle.net.nt.TcpNTAdapter.getOutputStream(Unknown Source)
		//       at oracle.net.ns.NSProtocol.establishConnection(Unknown Source)
		//       at oracle.net.ns.NSProtocol.connect(Unknown Source)
		//       at oracle.jdbc.driver.T4CConnection.connect(T4CConnection.java:856)
		//       at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:268)
		//       at oracle.jdbc.driver.PhysicalConnection.<init>(PhysicalConnection.java:439)
		//       at oracle.jdbc.driver.T4CConnection.<init>(T4CConnection.java:165)
		//       at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:35)
		//       at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:801)
		//       at java.sql.DriverManager.getConnection(Unknown Source)
		//       at java.sql.DriverManager.getConnection(Unknown Source)
		//       at com.verizon.JITDispatch.utilities.DBHandler.<init>(DBHandler.java:35)
		//       at com.verizon.JITDispatch.utilities.DBHandler.getInstance(DBHandler.java:51)
		assertNotNull(result);
	}

	/**
	 * Run the DBHandler getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/17/15 5:18 AM
	 */
	@Test
	public void testGetInstance_3()
		throws Exception {

		DBHandler result = DBHandler.getInstance();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at oracle.net.nt.TcpNTAdapter.getOutputStream(Unknown Source)
		//       at oracle.net.ns.NSProtocol.establishConnection(Unknown Source)
		//       at oracle.net.ns.NSProtocol.connect(Unknown Source)
		//       at oracle.jdbc.driver.T4CConnection.connect(T4CConnection.java:856)
		//       at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:268)
		//       at oracle.jdbc.driver.PhysicalConnection.<init>(PhysicalConnection.java:439)
		//       at oracle.jdbc.driver.T4CConnection.<init>(T4CConnection.java:165)
		//       at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:35)
		//       at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:801)
		//       at java.sql.DriverManager.getConnection(Unknown Source)
		//       at java.sql.DriverManager.getConnection(Unknown Source)
		//       at com.verizon.JITDispatch.utilities.DBHandler.<init>(DBHandler.java:35)
		//       at com.verizon.JITDispatch.utilities.DBHandler.getInstance(DBHandler.java:51)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/17/15 5:18 AM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 11/17/15 5:18 AM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 11/17/15 5:18 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DBHandlerTest.class);
	}
}