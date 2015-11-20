package com.verizon.JITDispatch.login.model;

import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CreateRequestModelTest</code> contains tests for the class <code>{@link CreateRequestModel}</code>.
 *
 * @generatedBy CodePro at 11/20/15 1:19 AM
 * @author Administrator
 * @version $Revision: 1.0 $
 */
public class CreateRequestModelTest {
	/**
	 * Run the CreateRequestModel() constructor test.
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testCreateRequestModel_1()
		throws Exception {
		CreateRequestModel result = new CreateRequestModel();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the String assignRequest(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testAssignRequest_1()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String userName = "";
		String techName = "";
		String issueName = "";

		String result = fixture.assignRequest(userName, techName, issueName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.assignRequestToUser(CreateRequestModel.java:237)
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.assignRequest(CreateRequestModel.java:228)
		assertNotNull(result);
	}

	/**
	 * Run the void assignRequestToTechnican(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testAssignRequestToTechnican_1()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String userName = "";
		String techName = "";

		fixture.assignRequestToTechnican(userName, techName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.assignRequestToTechnican(CreateRequestModel.java:254)
	}

	/**
	 * Run the void assignRequestToTechnican(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testAssignRequestToTechnican_2()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String userName = "";
		String techName = "";

		fixture.assignRequestToTechnican(userName, techName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.assignRequestToTechnican(CreateRequestModel.java:254)
	}

	/**
	 * Run the void assignRequestToTechnican(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testAssignRequestToTechnican_3()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String userName = "";
		String techName = "";

		fixture.assignRequestToTechnican(userName, techName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.assignRequestToTechnican(CreateRequestModel.java:254)
	}

	/**
	 * Run the void assignRequestToUser(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testAssignRequestToUser_1()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String userName = "";
		String techName = "";
		String issueName = "";

		fixture.assignRequestToUser(userName, techName, issueName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.assignRequestToUser(CreateRequestModel.java:237)
	}

	/**
	 * Run the void assignRequestToUser(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testAssignRequestToUser_2()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String userName = "";
		String techName = "";
		String issueName = "";

		fixture.assignRequestToUser(userName, techName, issueName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.assignRequestToUser(CreateRequestModel.java:237)
	}

	/**
	 * Run the void assignRequestToUser(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testAssignRequestToUser_3()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String userName = "";
		String techName = "";
		String issueName = "";

		fixture.assignRequestToUser(userName, techName, issueName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.assignRequestToUser(CreateRequestModel.java:237)
	}

	/**
	 * Run the void cancelRequest(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testCancelRequest_1()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String userName = "";

		fixture.cancelRequest(userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.cancelRequest(CreateRequestModel.java:271)
	}

	/**
	 * Run the void cancelRequest(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testCancelRequest_2()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String userName = "";

		fixture.cancelRequest(userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.cancelRequest(CreateRequestModel.java:271)
	}

	/**
	 * Run the void cancelRequest(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testCancelRequest_3()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String userName = "";

		fixture.cancelRequest(userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.cancelRequest(CreateRequestModel.java:271)
	}

	/**
	 * Run the void cancelRequest(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testCancelRequest_4()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String userName = "";

		fixture.cancelRequest(userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.cancelRequest(CreateRequestModel.java:271)
	}

	/**
	 * Run the void cancelRequest(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testCancelRequest_5()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String userName = "";

		fixture.cancelRequest(userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.cancelRequest(CreateRequestModel.java:271)
	}

	/**
	 * Run the void cancelRequest(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testCancelRequest_6()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String userName = "";

		fixture.cancelRequest(userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.cancelRequest(CreateRequestModel.java:271)
	}

	/**
	 * Run the void cancelRequest(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testCancelRequest_7()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String userName = "";

		fixture.cancelRequest(userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.cancelRequest(CreateRequestModel.java:271)
	}

	/**
	 * Run the void cancelRequest(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testCancelRequest_8()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String userName = "";

		fixture.cancelRequest(userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.cancelRequest(CreateRequestModel.java:271)
	}

	/**
	 * Run the void cancelRequest(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testCancelRequest_9()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String userName = "";

		fixture.cancelRequest(userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.cancelRequest(CreateRequestModel.java:271)
	}

	/**
	 * Run the void cancelRequest(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testCancelRequest_10()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String userName = "";

		fixture.cancelRequest(userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.cancelRequest(CreateRequestModel.java:271)
	}

	/**
	 * Run the void cancelRequest(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testCancelRequest_11()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String userName = "";

		fixture.cancelRequest(userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.cancelRequest(CreateRequestModel.java:271)
	}

	/**
	 * Run the void cancelRequest(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testCancelRequest_12()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String userName = "";

		fixture.cancelRequest(userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.cancelRequest(CreateRequestModel.java:271)
	}

	/**
	 * Run the void cancelRequest(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testCancelRequest_13()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String userName = "";

		fixture.cancelRequest(userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.cancelRequest(CreateRequestModel.java:271)
	}

	/**
	 * Run the void cancelRequest(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testCancelRequest_14()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String userName = "";

		fixture.cancelRequest(userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.cancelRequest(CreateRequestModel.java:271)
	}

	/**
	 * Run the void cancelRequest(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testCancelRequest_15()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String userName = "";

		fixture.cancelRequest(userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.cancelRequest(CreateRequestModel.java:271)
	}

	/**
	 * Run the void cancelRequest(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testCancelRequest_16()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String userName = "";

		fixture.cancelRequest(userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.cancelRequest(CreateRequestModel.java:271)
	}

	/**
	 * Run the ArrayList<String[]> checkMyJob(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testCheckMyJob_1()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String userName = "";

		ArrayList<String[]> result = fixture.checkMyJob(userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.checkMyJob(CreateRequestModel.java:185)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<String[]> checkMyJob(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testCheckMyJob_2()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String userName = "";

		ArrayList<String[]> result = fixture.checkMyJob(userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.checkMyJob(CreateRequestModel.java:185)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<String[]> checkMyJob(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testCheckMyJob_3()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String userName = "";

		ArrayList<String[]> result = fixture.checkMyJob(userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.checkMyJob(CreateRequestModel.java:185)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<String[]> checkMyJob(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testCheckMyJob_4()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String userName = "";

		ArrayList<String[]> result = fixture.checkMyJob(userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.checkMyJob(CreateRequestModel.java:185)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<String[]> checkMyJob(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testCheckMyJob_5()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String userName = "";

		ArrayList<String[]> result = fixture.checkMyJob(userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.checkMyJob(CreateRequestModel.java:185)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<String[]> checkMyJob(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testCheckMyJob_6()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String userName = "";

		ArrayList<String[]> result = fixture.checkMyJob(userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.checkMyJob(CreateRequestModel.java:185)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<String[]> checkMyJob(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testCheckMyJob_7()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String userName = "";

		ArrayList<String[]> result = fixture.checkMyJob(userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.checkMyJob(CreateRequestModel.java:185)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<String[]> checkMyJob(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testCheckMyJob_8()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String userName = "";

		ArrayList<String[]> result = fixture.checkMyJob(userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.checkMyJob(CreateRequestModel.java:185)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<String[]> checkMyJob(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testCheckMyJob_9()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String userName = "";

		ArrayList<String[]> result = fixture.checkMyJob(userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.checkMyJob(CreateRequestModel.java:185)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<String[]> getTechnicianLatLongList(String,String[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testGetTechnicianLatLongList_1()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String skill = "";
		String[] userLatLong = new String[] {null, ""};
		String flag = "";
		String userName = "";

		ArrayList<String[]> result = fixture.getTechnicianLatLongList(skill, userLatLong, flag, userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.getTechnicianLatLongList(CreateRequestModel.java:127)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<String[]> getTechnicianLatLongList(String,String[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testGetTechnicianLatLongList_2()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String skill = "";
		String[] userLatLong = new String[] {null, ""};
		String flag = "";
		String userName = "";

		ArrayList<String[]> result = fixture.getTechnicianLatLongList(skill, userLatLong, flag, userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.getTechnicianLatLongList(CreateRequestModel.java:127)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<String[]> getTechnicianLatLongList(String,String[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testGetTechnicianLatLongList_3()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String skill = "";
		String[] userLatLong = new String[] {null, ""};
		String flag = "";
		String userName = "";

		ArrayList<String[]> result = fixture.getTechnicianLatLongList(skill, userLatLong, flag, userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.getTechnicianLatLongList(CreateRequestModel.java:127)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<String[]> getTechnicianLatLongList(String,String[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testGetTechnicianLatLongList_4()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String skill = "";
		String[] userLatLong = new String[] {null, ""};
		String flag = "";
		String userName = "";

		ArrayList<String[]> result = fixture.getTechnicianLatLongList(skill, userLatLong, flag, userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.getTechnicianLatLongList(CreateRequestModel.java:127)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<String[]> getTechnicianLatLongList(String,String[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testGetTechnicianLatLongList_5()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String skill = "";
		String[] userLatLong = new String[] {null, ""};
		String flag = "";
		String userName = "";

		ArrayList<String[]> result = fixture.getTechnicianLatLongList(skill, userLatLong, flag, userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.getTechnicianLatLongList(CreateRequestModel.java:127)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<String[]> getTechnicianLatLongList(String,String[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testGetTechnicianLatLongList_6()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String skill = "";
		String[] userLatLong = new String[] {null, ""};
		String flag = "";
		String userName = "";

		ArrayList<String[]> result = fixture.getTechnicianLatLongList(skill, userLatLong, flag, userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.getTechnicianLatLongList(CreateRequestModel.java:127)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<String[]> getTechnicianLatLongList(String,String[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testGetTechnicianLatLongList_7()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String skill = "";
		String[] userLatLong = new String[] {null, ""};
		String flag = "";
		String userName = "";

		ArrayList<String[]> result = fixture.getTechnicianLatLongList(skill, userLatLong, flag, userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.getTechnicianLatLongList(CreateRequestModel.java:127)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<String[]> getTechnicianLatLongList(String,String[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testGetTechnicianLatLongList_8()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String skill = "";
		String[] userLatLong = new String[] {null, ""};
		String flag = "";
		String userName = "";

		ArrayList<String[]> result = fixture.getTechnicianLatLongList(skill, userLatLong, flag, userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.getTechnicianLatLongList(CreateRequestModel.java:127)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<String[]> getTechnicianLatLongList(String,String[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testGetTechnicianLatLongList_9()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String skill = "";
		String[] userLatLong = new String[] {null, ""};
		String flag = "";
		String userName = "";

		ArrayList<String[]> result = fixture.getTechnicianLatLongList(skill, userLatLong, flag, userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.getTechnicianLatLongList(CreateRequestModel.java:127)
		assertNotNull(result);
	}

	/**
	 * Run the String[] getUserLatLong(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testGetUserLatLong_1()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String userName = "";

		String[] result = fixture.getUserLatLong(userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.getUserLatLong(CreateRequestModel.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the String[] getUserLatLong(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testGetUserLatLong_2()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String userName = "";

		String[] result = fixture.getUserLatLong(userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.getUserLatLong(CreateRequestModel.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the String[] getUserLatLong(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testGetUserLatLong_3()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String userName = "";

		String[] result = fixture.getUserLatLong(userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.getUserLatLong(CreateRequestModel.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the String[] getUserLatLong(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testGetUserLatLong_4()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String userName = "";

		String[] result = fixture.getUserLatLong(userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.getUserLatLong(CreateRequestModel.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the String[] getUserLatLong(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testGetUserLatLong_5()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String userName = "";

		String[] result = fixture.getUserLatLong(userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.getUserLatLong(CreateRequestModel.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the String[] getUserLatLong(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testGetUserLatLong_6()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String userName = "";

		String[] result = fixture.getUserLatLong(userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.getUserLatLong(CreateRequestModel.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the String[] getUserLatLong(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testGetUserLatLong_7()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();
		String userName = "";

		String[] result = fixture.getUserLatLong(userName);

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.getUserLatLong(CreateRequestModel.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the void testDBConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testTestDBConnection_1()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();

		fixture.testDBConnection();

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.testDBConnection(CreateRequestModel.java:15)
	}

	/**
	 * Run the void testDBConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testTestDBConnection_2()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();

		fixture.testDBConnection();

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.testDBConnection(CreateRequestModel.java:15)
	}

	/**
	 * Run the void testDBConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testTestDBConnection_3()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();

		fixture.testDBConnection();

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.testDBConnection(CreateRequestModel.java:15)
	}

	/**
	 * Run the void testDBConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testTestDBConnection_4()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();

		fixture.testDBConnection();

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.testDBConnection(CreateRequestModel.java:15)
	}

	/**
	 * Run the void testDBConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testTestDBConnection_5()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();

		fixture.testDBConnection();

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.testDBConnection(CreateRequestModel.java:15)
	}

	/**
	 * Run the void testDBConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testTestDBConnection_6()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();

		fixture.testDBConnection();

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.testDBConnection(CreateRequestModel.java:15)
	}

	/**
	 * Run the void testDBConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testTestDBConnection_7()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();

		fixture.testDBConnection();

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.testDBConnection(CreateRequestModel.java:15)
	}

	/**
	 * Run the void testDBConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testTestDBConnection_8()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();

		fixture.testDBConnection();

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.testDBConnection(CreateRequestModel.java:15)
	}

	/**
	 * Run the void testDBConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testTestDBConnection_9()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();

		fixture.testDBConnection();

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.testDBConnection(CreateRequestModel.java:15)
	}

	/**
	 * Run the void testDBConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testTestDBConnection_10()
		throws Exception {
		CreateRequestModel fixture = new CreateRequestModel();

		fixture.testDBConnection();

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
		//       at com.verizon.JITDispatch.login.model.CreateRequestModel.testDBConnection(CreateRequestModel.java:15)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
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
	 * @generatedBy CodePro at 11/20/15 1:19 AM
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
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CreateRequestModelTest.class);
	}
}