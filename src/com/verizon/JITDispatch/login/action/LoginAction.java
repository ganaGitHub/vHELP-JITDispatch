package com.verizon.JITDispatch.login.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

public class LoginAction extends HttpServlet {
	private static Logger logger = Logger.getLogger("JITDispatch");

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String param = (String) request.getParameter("param");
		logger.debug("param: " + param);

		if (param == null) {
			initialize(request, response);
		} else {
			login(request, response);
		}

	}

	protected void initialize(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = null;
		try {
			logger.debug("Redirecting the request to login page");

			rd = request.getRequestDispatcher("jsp/login/login.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			logger.debug("Exception occurred while redirecting the request to login page, exception: " + e.toString());
			logger.debug(e);
			rd = request.getRequestDispatcher(
					"jsp/common/error.jsp?error=Error occurred while redirecting the request to login page!");
			rd.forward(request, response);
		}
	} /* End of initialize */

	protected void login(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = null;
		HttpSession session = request.getSession();

		try {
			String userName = (String) request.getParameter("userName");
			// userName = "HydUser" and "ChnUser";
			logger.debug("userName: " + userName);
			session.setAttribute("sUserName", userName);

			// Reset the issue if logging again
			session.removeAttribute("sIssueName");

			String password = (String) request.getParameter("password");
			logger.debug("password: " + password);

			if (userName.equalsIgnoreCase("HydUser") || userName.equalsIgnoreCase("ChnUser")) {
				// User is a customer, so redirect to customer page
				logger.debug("Redirecting to customer: " + userName + " page");

				rd = request.getRequestDispatcher("CreateRequestAction?param=init");
				// rd = request.getRequestDispatcher("jsp/common/home.jsp");
				rd.forward(request, response);
			} else {
				// User is a technician, so redirect to his page
				logger.debug("Redirecting to technician: " + userName + " page");

				rd = request.getRequestDispatcher("TechAction?param=init");
				rd.forward(request, response);
			}
		} catch (Exception e) {
			logger.debug("Exception occurred while login, exception: " + e.toString());
			logger.debug(e);
			rd = request
					.getRequestDispatcher("jsp/login/login.jsp?status=Error occurred while login, please try again!");
			rd.forward(request, response);
		}
	}

}
