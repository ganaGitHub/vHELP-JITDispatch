<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.apache.log4j.Logger" %>
<%@ page import="java.util.Hashtable" %>

<%! private static Logger logger = Logger.getLogger("JITDispatch"); %> 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> vHELP - JIT Dispatch </title>
        <style type="text/css">@import url(<%=request.getContextPath()%>/css/common/common.css);</style>
		<style type="text/css">@import url(<%=request.getContextPath()%>/css/request/request.css);</style>
        <script type="text/javascript" src="<%=request.getContextPath()%>/js/request/request.js"></script>
        <script src="http://maps.google.com/maps?file=api&amp;v=2&amp;sensor=false" type="text/javascript"></script> 
    </head>
    <body>
    	<form name="techActionForm">
    		<% 
    			String LatLongStr = (String) session.getAttribute("LatLongStr");
    			String[] latlong = null;
    			if ((LatLongStr != null) && (!LatLongStr.isEmpty()))
    				latlong = LatLongStr.split(",");
    			System.out.println("LatLongStr: " + LatLongStr);
    		%>
	        <jsp:include flush="true" page="../../jsp/common/menuHeader.jsp"></jsp:include>
    		<div id="fileSelectDiv">
		        <table align="center" border="0" cellpadding="10px">
	                <tr>		              
	                    <td>
	                            <%
	                            if((LatLongStr != null) && (!LatLongStr.isEmpty()))
                                {
	                            %>
	                            You have pending requests
	                            	                
	                    			<input type = "button" id="actionID" name="actionName" value="Accept" onClick="acceptRequest();"/>
	                            
	                              <div id="map" style="width: 921px; height: 329px;"></div> 

									   <script type="text/javascript"> 
									
									   var map = new GMap2(document.getElementById("map"));
									   var directions = new GDirections(map);
									   var isCreateHeadPoint = true;
									   directions.load("from:" + <%out.write(latlong[0]);%> + ", " + 
									   <%out.write(latlong[1]);%> + 
									                         " to:" + <%out.write(latlong[2]);%> + "," + 
									                         <%out.write(latlong[3]);%> , 
									                         { getPolyline: true, getSteps: true }); 
									
									   </script> 
	                            
	                            <%
                                }
	                            else
	                            {
	                            %>
	                            You have no pending requests
	                            <%
	                            }
	                            %>
	                    </td>
	                </tr>
			    </table>
		    </div>
            
            <br>
            
<!--             <div> -->
<!--             	<table align="center" border="0"> -->
<!--             		<tr> -->
<!--             			<td> -->
<%--             				<jsp:include flush="true" page="../../jsp/request/Pin.jsp"></jsp:include> --%>
<!--             			</td> -->
<!--             		</tr> -->
<!--             	</table> -->
<!--             </div> -->
        </form>
		<jsp:include flush="true" page="../../jsp/common/footer.jsp"></jsp:include>
    </body>
</html>