package com.verizon.JITDispatch.tech.action;

import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TechThreadTest</code> contains tests for the class <code>{@link TechThread}</code>.
 *
 * @generatedBy CodePro at 11/20/15 1:19 AM
 * @author Administrator
 * @version $Revision: 1.0 $
 */
public class TechThreadTest {
	/**
	 * Run the TechThread(String,ArrayList) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testTechThread_1()
		throws Exception {
		String techName = "";
		ArrayList coords = new ArrayList();

		TechThread result = new TechThread(techName, coords);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testRun_1()
		throws Exception {
		TechThread fixture = new TechThread("", new ArrayList());

		fixture.run();

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
		//       at com.verizon.JITDispatch.tech.action.TechThread.run(TechThread.java:48)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testRun_2()
		throws Exception {
		TechThread fixture = new TechThread("", new ArrayList());

		fixture.run();

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
		//       at com.verizon.JITDispatch.tech.action.TechThread.run(TechThread.java:48)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testRun_3()
		throws Exception {
		TechThread fixture = new TechThread("", new ArrayList());

		fixture.run();

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
		//       at com.verizon.JITDispatch.tech.action.TechThread.run(TechThread.java:48)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testRun_4()
		throws Exception {
		TechThread fixture = new TechThread("", new ArrayList());

		fixture.run();

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
		//       at com.verizon.JITDispatch.tech.action.TechThread.run(TechThread.java:48)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testRun_5()
		throws Exception {
		TechThread fixture = new TechThread("", new ArrayList());

		fixture.run();

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
		//       at com.verizon.JITDispatch.tech.action.TechThread.run(TechThread.java:48)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testRun_6()
		throws Exception {
		TechThread fixture = new TechThread("", new ArrayList());

		fixture.run();

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
		//       at com.verizon.JITDispatch.tech.action.TechThread.run(TechThread.java:48)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testRun_7()
		throws Exception {
		TechThread fixture = new TechThread("", new ArrayList());

		fixture.run();

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
		//       at com.verizon.JITDispatch.tech.action.TechThread.run(TechThread.java:48)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testRun_8()
		throws Exception {
		TechThread fixture = new TechThread("", new ArrayList());

		fixture.run();

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
		//       at com.verizon.JITDispatch.tech.action.TechThread.run(TechThread.java:48)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testRun_9()
		throws Exception {
		TechThread fixture = new TechThread("", new ArrayList());

		fixture.run();

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
		//       at com.verizon.JITDispatch.tech.action.TechThread.run(TechThread.java:48)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testRun_10()
		throws Exception {
		TechThread fixture = new TechThread("", new ArrayList());

		fixture.run();

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
		//       at com.verizon.JITDispatch.tech.action.TechThread.run(TechThread.java:48)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testRun_11()
		throws Exception {
		TechThread fixture = new TechThread("", new ArrayList());

		fixture.run();

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
		//       at com.verizon.JITDispatch.tech.action.TechThread.run(TechThread.java:48)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testRun_12()
		throws Exception {
		TechThread fixture = new TechThread("", new ArrayList());

		fixture.run();

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
		//       at com.verizon.JITDispatch.tech.action.TechThread.run(TechThread.java:48)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testRun_13()
		throws Exception {
		TechThread fixture = new TechThread("", new ArrayList());

		fixture.run();

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
		//       at com.verizon.JITDispatch.tech.action.TechThread.run(TechThread.java:48)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testRun_14()
		throws Exception {
		TechThread fixture = new TechThread("", new ArrayList());

		fixture.run();

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
		//       at com.verizon.JITDispatch.tech.action.TechThread.run(TechThread.java:48)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testRun_15()
		throws Exception {
		TechThread fixture = new TechThread("", new ArrayList());

		fixture.run();

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
		//       at com.verizon.JITDispatch.tech.action.TechThread.run(TechThread.java:48)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/20/15 1:19 AM
	 */
	@Test
	public void testRun_16()
		throws Exception {
		TechThread fixture = new TechThread("", new ArrayList());

		fixture.run();

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
		//       at com.verizon.JITDispatch.tech.action.TechThread.run(TechThread.java:48)
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
		new org.junit.runner.JUnitCore().run(TechThreadTest.class);
	}
}