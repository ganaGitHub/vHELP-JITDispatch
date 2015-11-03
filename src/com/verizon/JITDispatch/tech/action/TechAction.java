package com.verizon.JITDispatch.tech.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.verizon.JITDispatch.login.model.TechActionModel;

public class TechAction  extends HttpServlet {
	
	private static Logger logger = Logger.getLogger("JITDispatch");
	boolean ajaxflag = false;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	String param = (String) request.getParameter("param");
    	String ajax = (String) request.getParameter("ajax");
    	System.out.println("param: " + param);
    	
    	if(param.equalsIgnoreCase("init"))
    	{
    		if (ajax != null)
    			ajaxflag = true;
    		else
    			ajaxflag = false;
    		initialize(request, response);
    	}
    	else if(param.equalsIgnoreCase("accept"))
    	{
    		acceptRequest(request, response);
    	}
    	else if(param.equalsIgnoreCase("jobdone"))
    	{
    		jobDone(request, response);
    		
    	}
    }
    
	protected void initialize(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = null;
		HttpSession session = request.getSession();
		try {
			
			System.out.println("Redirecting the request to login page");
			TechActionModel techActionModelObj = new TechActionModel();
			String techName = (String) session.getAttribute("sUserName");
			String status=techActionModelObj.getTechStatus(techName);
			if (status.equals("ACCEPTED") || status.equals("REACHED"))
			{
				System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
				rd = request.getRequestDispatcher("jsp/request/TechJob.jsp");
				String[] latlongs = techActionModelObj.getTechUserLatLong(techName);
				String LatLongStr = latlongs[0] + "," + latlongs[1] + "," + latlongs[2] + "," + latlongs[3];
				session.setAttribute("LatLongStr", LatLongStr);
				if (status.equals("ACCEPTED"))
				{
					if (!ajaxflag)
						rd.forward(request, response);
					else
					{
						PrintWriter  out = response.getWriter();
						out.print("START" + "," + LatLongStr);
					}
				}
				else
				{
					techActionModelObj.setTechStatus(techName, "PROGRESS");
					if (!ajaxflag)
					{
						request.setAttribute("NOAJAX", "1");
						rd.forward(request, response);
						
					}
					else
					{
						PrintWriter  out = response.getWriter();
						out.print("STOP");
					}
				}
				//rd.forward(request, response);
			}
			else if (status.equals("PROGRESS"))
			{
				
				rd = request.getRequestDispatcher("jsp/request/TechJob.jsp");
				request.setAttribute("NOAJAX", "1");
				String[] latlongs = techActionModelObj.getTechUserLatLong(techName);
				String LatLongStr = latlongs[0] + "," + latlongs[1] + "," + latlongs[2] + "," + latlongs[3];
				session.setAttribute("LatLongStr", LatLongStr);
				rd.forward(request, response);
				//PrintWriter  out = response.getWriter();
				//out.print("STOP" + "," + LatLongStr);
			}
			else
			{
				rd = request.getRequestDispatcher("jsp/request/TechAction.jsp");
				techAction(request,response);
				rd.forward(request, response);
			}
			// rd = request.getRequestDispatcher("jsp/common/home.jsp");
			
		} catch (Exception e) {
			System.out.println("Exception occurred while redirecting the request to login page, exception: " + e.toString());
			System.out.println(e);
			rd = request.getRequestDispatcher("jsp/common/error.jsp?error=Error occurred while redirecting the request to login page!");
			rd.forward(request, response);
		}
	} /* End of initialize */
	
	protected void techAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = null;
		try {
			System.out.println("Redirecting the request to login page");
			HttpSession session = request.getSession();
			String techName = (String) session.getAttribute("sUserName");
			session.setAttribute("stechName", techName);
			
			TechActionModel techActionModelObj = new TechActionModel();
			String [] LatLong = techActionModelObj.getPendingResuests(techName);
			String LatLongStr = null; 
			if (LatLong[0]!=null)
				LatLongStr = LatLong[0] +  "," + LatLong[1] + "," + LatLong[2] + "," + LatLong[3];
			session.setAttribute("LatLongStr", LatLongStr);
			
		} catch (Exception e) {
			System.out.println("Exception occurred while redirecting the request to login page, exception: " + e.toString());
			System.out.println(e);
			rd = request.getRequestDispatcher("jsp/common/error.jsp?error=Error occurred while redirecting the request to login page!");
			rd.forward(request, response);
		}
	} /* End of initialize */
	
	protected void acceptRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = null;
		try {
			System.out.println("Redirecting the request to Test page");
			HttpSession session = request.getSession();
			rd = request.getRequestDispatcher("jsp/request/TechJob.jsp");
			//session.setAttribute("stechName", "Technician4");
			String techName = (String) session.getAttribute("sUserName");
			TechActionModel techActionModelObj = new TechActionModel();
			String status = techActionModelObj.acceptRequest(techName);			
			
			rd.forward(request, response);
		} catch (Exception e) {
			System.out.println("Exception occurred while redirecting the request to login page, exception: " + e.toString());
			System.out.println(e);
		}
	} /* End of acceptRequest */

	protected void jobDone(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = null;
		try {
			System.out.println("Redirecting the request to JobDone page");
			HttpSession session = request.getSession();
			String techName = (String) session.getAttribute("sUserName");
			//session.setAttribute("stechName", "Technician4");
			rd = request.getRequestDispatcher("jsp/request/TechAction.jsp");			
			TechActionModel techActionModelObj = new TechActionModel();
			techActionModelObj.setJobCompleted(techName);
			session.setAttribute("LatLongStr", "");
			rd.forward(request, response);			
		} catch (Exception e) {
			System.out.println("Exception occurred while redirecting the request to login page, exception: " + e.toString());
			System.out.println(e);
		}
	} /* End of jobDone */
	
}
