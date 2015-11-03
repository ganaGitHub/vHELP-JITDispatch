package com.verizon.JITDispatch.login.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

public class LogoutAction  extends HttpServlet {
	private static Logger logger = Logger.getLogger("JITDispatch");

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	String param = (String) request.getParameter("param");
    	logger.info("param: " + param);
    	
    	logout(request, response);
    }
    
	protected void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = null;
		try {
			HttpSession session = request.getSession();
			
			session.setAttribute("group", "");
			
			// Invalidated the session
			logger.info("Invalidating the session");
			session.invalidate(); 
			
			logger.info("Redirecting the request to login page");
			rd = request.getRequestDispatcher("jsp/login/login.jsp");
			// rd = request.getRequestDispatcher("jsp/common/home.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			logger.error("Exception occurred while invalidating the session, exception: " + e.toString());
			logger.error(e, e);
			rd = request.getRequestDispatcher("jsp/common/error.jsp?error=Error occurredwhile invalidating the session!");
			rd.forward(request, response);
		}
	} /* End of initialize */
}
