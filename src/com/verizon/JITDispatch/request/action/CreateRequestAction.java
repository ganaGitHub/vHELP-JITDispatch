package com.verizon.JITDispatch.request.action;

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

import com.verizon.JITDispatch.login.model.CreateRequestModel;
import com.verizon.JITDispatch.login.model.TechActionModel;

public class CreateRequestAction  extends HttpServlet {
	
	private static Logger logger = Logger.getLogger("JITDispatch");

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	String param = (String) request.getParameter("param");
    	System.out.println("param: " + param);
    	
    	if(param.equalsIgnoreCase("init"))
    	{
    		initialize(request, response);
    	}
    	else if(param.equalsIgnoreCase("create"))
    	{
    		createRequest(request, response);
    	}
    	else if(param.equalsIgnoreCase("assign"))
    	{
    		assignRequest(request, response);
    		
    	}
    	else if(param.equalsIgnoreCase("cancel"))
    	{
    		cancelRequest(request, response);
    		
    	}
    	else if(param.equalsIgnoreCase("ajax"))
    	{
    		ajaxRequest(request, response);    		
    	}
    }
    
	protected void initialize(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = null;
		try {
			System.out.println("Redirecting the request to login page");
			HttpSession session = request.getSession();
			rd = request.getRequestDispatcher("jsp/request/createRequest.jsp");
			String userName = (String) session.getAttribute("sUserName");
			CreateRequestModel createRequestModelObj = new CreateRequestModel();
			ArrayList<String[]> technicianJobList = createRequestModelObj.checkMyJob(userName);
			
			if(technicianJobList != null && 
					technicianJobList.size() > 0 )
			{
				session.setAttribute("Requestflag", "yes");
			}
			else
			{
				session.setAttribute("Requestflag", "no");
			}
			
			rd.forward(request, response);
		} catch (Exception e) {
			System.out.println("Exception occurred while redirecting the request to login page, exception: " + e.toString());
			System.out.println(e);
			rd = request.getRequestDispatcher("jsp/common/error.jsp?error=Error occurred while redirecting the request to login page!");
			rd.forward(request, response);
		}
	} /* End of initialize */
	
	protected void createRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = null;
		try {
			System.out.println("Redirecting the request to login page");
			HttpSession session = request.getSession();
			String userName = (String) session.getAttribute("sUserName");
			session.setAttribute("sUserName", userName);
			
			//String userName = (String) session.getAttribute("sUserName");
			System.out.println("userName: " + userName);
			
			String issueName = (String) request.getParameter("issueName");
			System.out.println("issueName: " + issueName);
			session.setAttribute("sIssueName", issueName);
			
			session.setAttribute("issueName", issueName);
			
			CreateRequestModel createRequestModelObj = new CreateRequestModel();
			String [] userLatLong = createRequestModelObj.getUserLatLong(userName);
			String userLatLongStr = userLatLong[0] +  "," + userLatLong[1];
			session.setAttribute("userLatLongStr", userLatLongStr);
			
			ArrayList<String[]> technicianLatLongList = new ArrayList<String[]>();
			ArrayList<String[]> technicianJobList = createRequestModelObj.checkMyJob(userName);
			
			if(technicianJobList != null && 
					technicianJobList.size() > 0 )
			{
				 if (technicianJobList.get(0)[3].length() > 0)
				 {
					 session.setAttribute("Requestflag", "yes");
					 technicianLatLongList = createRequestModelObj.getTechnicianLatLongList(issueName, userLatLong, technicianJobList.get(0)[3], userName);
				 }
			}
			else
			{
				session.setAttribute("Requestflag", "no");
				technicianLatLongList = createRequestModelObj.getTechnicianLatLongList(issueName, userLatLong, "", "");
			}
			
				System.out.println("technicianLatLongList: " + technicianLatLongList);
				session.setAttribute("technicianLatLongList", technicianLatLongList);
				
				int technicianLatLongListLength = technicianLatLongList.size();
				System.out.println("technicianLatLongListLength: " + technicianLatLongListLength);
				String technicianLatLongListLengthStr = String.valueOf(technicianLatLongListLength);
				
				String technicianLatLongs = "";
				
				for(int i = 0; i < technicianLatLongList.size(); i++)
				{
					String[] techNameLatLong = new String[4];
					techNameLatLong = technicianLatLongList.get(i);
					String name = techNameLatLong[0];
					String lattitude = techNameLatLong[1];
					String longitude = techNameLatLong[2];
					String distanceTemp = techNameLatLong[3];
					technicianLatLongs += name + "," + lattitude + "," +  longitude + "," +  distanceTemp;
					
					if(i < technicianLatLongList.size() - 1)
					{
						technicianLatLongs += ",";
					}
				}
				
				System.out.println("technicianLatLongs: " + technicianLatLongs);
				session.setAttribute("technicianLatLongListLength", technicianLatLongListLengthStr);
				session.setAttribute("technicianLatLongList", technicianLatLongs);
				
				rd = request.getRequestDispatcher("jsp/request/createRequest.jsp");
			
				// rd = request.getRequestDispatcher("jsp/common/home.jsp");
				rd.forward(request, response);
				
		} catch (Exception e) {
			System.out.println("Exception occurred while redirecting the request to login page, exception: " + e.toString());
			System.out.println(e);
			rd = request.getRequestDispatcher("jsp/common/error.jsp?error=Error occurred while redirecting the request to login page!");
			rd.forward(request, response);
		}
	} /* End of initialize */
	
	protected void assignRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = null;
		try {
			System.out.println("Redirecting the request to login page");
			HttpSession session = request.getSession();
			
			String technicianLatLong = (String) session.getAttribute("technicianLatLongList");
			String[] technicianLatLongList = technicianLatLong.split(",");
			String techName = technicianLatLongList[0];
			System.out.println("techName: " + techName);
			
			String userName = (String) session.getAttribute("sUserName");
			System.out.println("userName: " + userName);
			
			String issueName = (String) session.getAttribute("issueName");
			System.out.println("issueName: " + issueName);
			
			
			CreateRequestModel createRequestModelObj = new CreateRequestModel();
			String status = createRequestModelObj.assignRequest(userName, techName, issueName);
			System.out.println("status: " + status);
			session.setAttribute("Requestflag", "yes");
			createRequest(request,response);
			//rd = request.getRequestDispatcher("jsp/request/createRequest.jsp");
			// rd = request.getRequestDispatcher("jsp/common/home.jsp");
			//rd.forward(request, response);
		} catch (Exception e) {
			System.out.println("Exception occurred while redirecting the request to login page, exception: " + e.toString());
			System.out.println(e);
			rd = request.getRequestDispatcher("jsp/common/error.jsp?error=Error occurred while redirecting the request to login page!");
			rd.forward(request, response);
		}
	} /* End of assignRequest */

	protected void cancelRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = null;
		try {
			System.out.println("Redirecting the request to JobDone page");
			HttpSession session = request.getSession();
			String userName = (String) session.getAttribute("sUserName");
			CreateRequestModel createRequestModelObj = new CreateRequestModel();
			createRequestModelObj.cancelRequest(userName);
			session.setAttribute("Requestflag", "no");
			createRequest(request,response);			
			session.setAttribute("LatLongStr", "");
		} catch (Exception e) {
			System.out.println("Exception occurred while redirecting the request to login page, exception: " + e.toString());
			System.out.println(e);
		}
	} /* End of Request */

	protected void ajaxRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = null;
		try {
			System.out.println("Redirecting the request to ajax page");
			HttpSession session = request.getSession();
			String userName = (String) session.getAttribute("sUserName");
			session.setAttribute("sUserName", userName);
			
			//String userName = (String) session.getAttribute("sUserName");
			System.out.println("userName: " + userName);
			
			String issueName = (String) request.getParameter("issueName");
			System.out.println("issueName: " + issueName);
			session.setAttribute("sIssueName", issueName);
			
			session.setAttribute("issueName", issueName);
			
			CreateRequestModel createRequestModelObj = new CreateRequestModel();
			
			ArrayList<String[]> technicianJobList = createRequestModelObj.checkMyJob(userName);
			
			if(technicianJobList != null && 
					technicianJobList.size() > 0 )
			{
				 if (technicianJobList.get(0)[3].length() > 0)					 
				 {
					 	if (technicianJobList.get(0)[3].equals("ACCEPTED") || 
					 			technicianJobList.get(0)[3].equals("REACHED") ||
					 			technicianJobList.get(0)[3].equals("PROGRESS") )
					 	{
					 		System.out.println("Condition1");
					 		session.setAttribute("Requestflag", "yes");
					 		String techLatLongStr = technicianJobList.get(0)[1] +  "," + technicianJobList.get(0)[2];
					 		session.setAttribute("techLatLongStr", techLatLongStr);
					 		PrintWriter out = response.getWriter();
					 		if (technicianJobList.get(0)[3].equals("ACCEPTED"))
					 			techLatLongStr = "START" +"," + techLatLongStr;
					 		else if (technicianJobList.get(0)[3].equals("REACHED")||
						 			technicianJobList.get(0)[3].equals("PROGRESS") )
					 			techLatLongStr = "STOP" +"," + techLatLongStr;

					 		out.print(techLatLongStr);
					 	}
					 	else
					 	{
							 System.out.println("Condition1.1");
							 PrintWriter out = response.getWriter();
							 out.print("STOP");
					 		
					 	}
				 }
				 else
				 {
					 System.out.println("Condition2");
					 PrintWriter out = response.getWriter();
					 out.print("STOP");
				 }
			}
			else
			{
				System.out.println("Condition3");
				session.setAttribute("Requestflag", "no");
				 PrintWriter out = response.getWriter();
				 out.print("STOP");
			}		
				
		} catch (Exception e) {
			System.out.println("Exception occurred while redirecting the request to login page, exception: " + e.toString());
			System.out.println(e);
			rd = request.getRequestDispatcher("jsp/common/error.jsp?error=Error occurred while redirecting the request to login page!");
			rd.forward(request, response);
		}
	} /* End of ajaxRequest */

}
