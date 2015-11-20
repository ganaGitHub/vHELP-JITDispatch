package com.verizon.JITDispatch.login.model;

import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TechActionModelTest</code> contains tests for the class <code>{@link TechActionModel}</code>.
 *
 * @generatedBy CodePro at 11/20/15 1:20 AM
 * @author Administrator
 * @version $Revision: 1.0 $
 */
public class TechActionModelTest {
	/**
	 * Run the TechActionModel() constructor test.
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testTechActionModel_1()
		throws Exception {
		TechActionModel result = new TechActionModel();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void SimulateGPS(ArrayList,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testSimulateGPS_1()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		ArrayList coords = new ArrayList();
		String techName = "";

		fixture.SimulateGPS(coords, techName);

		// add additional test code here
	}

	/**
	 * Run the String acceptRequest(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testAcceptRequest_1()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		String result = fixture.acceptRequest(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.acceptRequest(TechActionModel.java:150)
		assertNotNull(result);
	}

	/**
	 * Run the String acceptRequest(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testAcceptRequest_2()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		String result = fixture.acceptRequest(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.acceptRequest(TechActionModel.java:150)
		assertNotNull(result);
	}

	/**
	 * Run the String callURL(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testCallURL_1()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String myURL = "";

		String result = fixture.callURL(myURL);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Exception while calling URL:
		//       at com.verizon.JITDispatch.login.model.TechActionModel.callURL(TechActionModel.java:200)
		assertNotNull(result);
	}

	/**
	 * Run the String callURL(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testCallURL_2()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String myURL = "";

		String result = fixture.callURL(myURL);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Exception while calling URL:
		//       at com.verizon.JITDispatch.login.model.TechActionModel.callURL(TechActionModel.java:200)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList decodeLatlongs(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testDecodeLatlongs_1()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String encoded = "aa";

		ArrayList result = fixture.decodeLatlongs(encoded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: 2
		//       at java.lang.String.charAt(Unknown Source)
		//       at com.verizon.JITDispatch.login.model.TechActionModel.decodeLatlongs(TechActionModel.java:215)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList decodeLatlongs(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testDecodeLatlongs_2()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String encoded = "aa";

		ArrayList result = fixture.decodeLatlongs(encoded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: 2
		//       at java.lang.String.charAt(Unknown Source)
		//       at com.verizon.JITDispatch.login.model.TechActionModel.decodeLatlongs(TechActionModel.java:215)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList decodeLatlongs(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testDecodeLatlongs_3()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String encoded = "";

		ArrayList result = fixture.decodeLatlongs(encoded);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String[] getPendingResuests(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testGetPendingResuests_1()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		String[] result = fixture.getPendingResuests(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.getPendingResuests(TechActionModel.java:120)
		assertNotNull(result);
	}

	/**
	 * Run the String[] getPendingResuests(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testGetPendingResuests_2()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		String[] result = fixture.getPendingResuests(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.getPendingResuests(TechActionModel.java:120)
		assertNotNull(result);
	}

	/**
	 * Run the String[] getPendingResuests(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testGetPendingResuests_3()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		String[] result = fixture.getPendingResuests(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.getPendingResuests(TechActionModel.java:120)
		assertNotNull(result);
	}

	/**
	 * Run the String[] getPendingResuests(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testGetPendingResuests_4()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		String[] result = fixture.getPendingResuests(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.getPendingResuests(TechActionModel.java:120)
		assertNotNull(result);
	}

	/**
	 * Run the String[] getPendingResuests(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testGetPendingResuests_5()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		String[] result = fixture.getPendingResuests(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.getPendingResuests(TechActionModel.java:120)
		assertNotNull(result);
	}

	/**
	 * Run the String[] getPendingResuests(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testGetPendingResuests_6()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		String[] result = fixture.getPendingResuests(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.getPendingResuests(TechActionModel.java:120)
		assertNotNull(result);
	}

	/**
	 * Run the String[] getPendingResuests(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testGetPendingResuests_7()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		String[] result = fixture.getPendingResuests(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.getPendingResuests(TechActionModel.java:120)
		assertNotNull(result);
	}

	/**
	 * Run the String[] getPendingResuests(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testGetPendingResuests_8()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		String[] result = fixture.getPendingResuests(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.getPendingResuests(TechActionModel.java:120)
		assertNotNull(result);
	}

	/**
	 * Run the String[] getPendingResuests(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testGetPendingResuests_9()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		String[] result = fixture.getPendingResuests(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.getPendingResuests(TechActionModel.java:120)
		assertNotNull(result);
	}

	/**
	 * Run the String getTechStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testGetTechStatus_1()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		String result = fixture.getTechStatus(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.getTechStatus(TechActionModel.java:53)
		assertNotNull(result);
	}

	/**
	 * Run the String getTechStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testGetTechStatus_2()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		String result = fixture.getTechStatus(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.getTechStatus(TechActionModel.java:53)
		assertNotNull(result);
	}

	/**
	 * Run the String getTechStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testGetTechStatus_3()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		String result = fixture.getTechStatus(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.getTechStatus(TechActionModel.java:53)
		assertNotNull(result);
	}

	/**
	 * Run the String getTechStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testGetTechStatus_4()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		String result = fixture.getTechStatus(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.getTechStatus(TechActionModel.java:53)
		assertNotNull(result);
	}

	/**
	 * Run the String getTechStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testGetTechStatus_5()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		String result = fixture.getTechStatus(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.getTechStatus(TechActionModel.java:53)
		assertNotNull(result);
	}

	/**
	 * Run the String getTechStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testGetTechStatus_6()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		String result = fixture.getTechStatus(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.getTechStatus(TechActionModel.java:53)
		assertNotNull(result);
	}

	/**
	 * Run the String[] getTechUserLatLong(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testGetTechUserLatLong_1()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		String[] result = fixture.getTechUserLatLong(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.getTechUserLatLong(TechActionModel.java:94)
		assertNotNull(result);
	}

	/**
	 * Run the String[] getTechUserLatLong(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testGetTechUserLatLong_2()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		String[] result = fixture.getTechUserLatLong(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.getTechUserLatLong(TechActionModel.java:94)
		assertNotNull(result);
	}

	/**
	 * Run the String[] getTechUserLatLong(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testGetTechUserLatLong_3()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		String[] result = fixture.getTechUserLatLong(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.getTechUserLatLong(TechActionModel.java:94)
		assertNotNull(result);
	}

	/**
	 * Run the String[] getTechUserLatLong(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testGetTechUserLatLong_4()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		String[] result = fixture.getTechUserLatLong(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.getTechUserLatLong(TechActionModel.java:94)
		assertNotNull(result);
	}

	/**
	 * Run the String[] getTechUserLatLong(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testGetTechUserLatLong_5()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		String[] result = fixture.getTechUserLatLong(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.getTechUserLatLong(TechActionModel.java:94)
		assertNotNull(result);
	}

	/**
	 * Run the String[] getTechUserLatLong(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testGetTechUserLatLong_6()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		String[] result = fixture.getTechUserLatLong(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.getTechUserLatLong(TechActionModel.java:94)
		assertNotNull(result);
	}

	/**
	 * Run the String[] getTechUserLatLong(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testGetTechUserLatLong_7()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		String[] result = fixture.getTechUserLatLong(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.getTechUserLatLong(TechActionModel.java:94)
		assertNotNull(result);
	}

	/**
	 * Run the String[] getTechUserLatLong(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testGetTechUserLatLong_8()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		String[] result = fixture.getTechUserLatLong(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.getTechUserLatLong(TechActionModel.java:94)
		assertNotNull(result);
	}

	/**
	 * Run the String[] getTechUserLatLong(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testGetTechUserLatLong_9()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		String[] result = fixture.getTechUserLatLong(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.getTechUserLatLong(TechActionModel.java:94)
		assertNotNull(result);
	}

	/**
	 * Run the String parsePolyline(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testParsePolyline_1()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String jsonobj = "";
		String techName = "";

		String result = fixture.parsePolyline(jsonobj, techName);

		// add additional test code here
		assertEquals("success", result);
	}

	/**
	 * Run the String parsePolyline(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testParsePolyline_2()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String jsonobj = "";
		String techName = "";

		String result = fixture.parsePolyline(jsonobj, techName);

		// add additional test code here
		assertEquals("success", result);
	}

	/**
	 * Run the String parsePolyline(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testParsePolyline_3()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String jsonobj = "";
		String techName = "";

		String result = fixture.parsePolyline(jsonobj, techName);

		// add additional test code here
		assertEquals("success", result);
	}

	/**
	 * Run the String parsePolyline(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testParsePolyline_4()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String jsonobj = "";
		String techName = "";

		String result = fixture.parsePolyline(jsonobj, techName);

		// add additional test code here
		assertEquals("success", result);
	}

	/**
	 * Run the void setJobCompleted(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testSetJobCompleted_1()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		fixture.setJobCompleted(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.setJobCompleted(TechActionModel.java:287)
	}

	/**
	 * Run the void setJobCompleted(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testSetJobCompleted_2()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		fixture.setJobCompleted(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.setJobCompleted(TechActionModel.java:287)
	}

	/**
	 * Run the void setJobCompleted(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testSetJobCompleted_3()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		fixture.setJobCompleted(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.setJobCompleted(TechActionModel.java:287)
	}

	/**
	 * Run the void setJobCompleted(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testSetJobCompleted_4()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		fixture.setJobCompleted(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.setJobCompleted(TechActionModel.java:287)
	}

	/**
	 * Run the void setJobCompleted(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testSetJobCompleted_5()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		fixture.setJobCompleted(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.setJobCompleted(TechActionModel.java:287)
	}

	/**
	 * Run the void setJobCompleted(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testSetJobCompleted_6()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		fixture.setJobCompleted(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.setJobCompleted(TechActionModel.java:287)
	}

	/**
	 * Run the void setJobCompleted(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testSetJobCompleted_7()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		fixture.setJobCompleted(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.setJobCompleted(TechActionModel.java:287)
	}

	/**
	 * Run the void setJobCompleted(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testSetJobCompleted_8()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		fixture.setJobCompleted(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.setJobCompleted(TechActionModel.java:287)
	}

	/**
	 * Run the void setJobCompleted(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testSetJobCompleted_9()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		fixture.setJobCompleted(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.setJobCompleted(TechActionModel.java:287)
	}

	/**
	 * Run the void setJobCompleted(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testSetJobCompleted_10()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		fixture.setJobCompleted(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.setJobCompleted(TechActionModel.java:287)
	}

	/**
	 * Run the void setJobCompleted(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testSetJobCompleted_11()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		fixture.setJobCompleted(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.setJobCompleted(TechActionModel.java:287)
	}

	/**
	 * Run the void setJobCompleted(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testSetJobCompleted_12()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		fixture.setJobCompleted(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.setJobCompleted(TechActionModel.java:287)
	}

	/**
	 * Run the void setJobCompleted(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testSetJobCompleted_13()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		fixture.setJobCompleted(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.setJobCompleted(TechActionModel.java:287)
	}

	/**
	 * Run the void setJobCompleted(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testSetJobCompleted_14()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		fixture.setJobCompleted(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.setJobCompleted(TechActionModel.java:287)
	}

	/**
	 * Run the void setJobCompleted(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testSetJobCompleted_15()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		fixture.setJobCompleted(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.setJobCompleted(TechActionModel.java:287)
	}

	/**
	 * Run the void setJobCompleted(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testSetJobCompleted_16()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";

		fixture.setJobCompleted(techName);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.setJobCompleted(TechActionModel.java:287)
	}

	/**
	 * Run the void setTechStatus(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testSetTechStatus_1()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";
		String status = "";

		fixture.setTechStatus(techName, status);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.setTechStatus(TechActionModel.java:75)
	}

	/**
	 * Run the void setTechStatus(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testSetTechStatus_2()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";
		String status = "";

		fixture.setTechStatus(techName, status);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.setTechStatus(TechActionModel.java:75)
	}

	/**
	 * Run the void setTechStatus(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testSetTechStatus_3()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();
		String techName = "";
		String status = "";

		fixture.setTechStatus(techName, status);

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.setTechStatus(TechActionModel.java:75)
	}

	/**
	 * Run the void testDBConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testTestDBConnection_1()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.testDBConnection(TechActionModel.java:27)
	}

	/**
	 * Run the void testDBConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testTestDBConnection_2()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.testDBConnection(TechActionModel.java:27)
	}

	/**
	 * Run the void testDBConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testTestDBConnection_3()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.testDBConnection(TechActionModel.java:27)
	}

	/**
	 * Run the void testDBConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testTestDBConnection_4()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.testDBConnection(TechActionModel.java:27)
	}

	/**
	 * Run the void testDBConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testTestDBConnection_5()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.testDBConnection(TechActionModel.java:27)
	}

	/**
	 * Run the void testDBConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testTestDBConnection_6()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.testDBConnection(TechActionModel.java:27)
	}

	/**
	 * Run the void testDBConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testTestDBConnection_7()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.testDBConnection(TechActionModel.java:27)
	}

	/**
	 * Run the void testDBConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testTestDBConnection_8()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.testDBConnection(TechActionModel.java:27)
	}

	/**
	 * Run the void testDBConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testTestDBConnection_9()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.testDBConnection(TechActionModel.java:27)
	}

	/**
	 * Run the void testDBConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	@Test
	public void testTestDBConnection_10()
		throws Exception {
		TechActionModel fixture = new TechActionModel();
		fixture.t1 = new Thread();

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
		//       at com.verizon.JITDispatch.login.model.TechActionModel.testDBConnection(TechActionModel.java:27)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/20/15 1:20 AM
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
	 * @generatedBy CodePro at 11/20/15 1:20 AM
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
	 * @generatedBy CodePro at 11/20/15 1:20 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TechActionModelTest.class);
	}
}