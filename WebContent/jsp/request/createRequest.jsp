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
    </head>
    <body>
    	<form name="createRequestForm">
    		<% 
    			String issueName = (String) session.getAttribute("sIssueName");
    			String reqflag = (String) session.getAttribute("Requestflag");
    			System.out.println("issueName: " + issueName);
    		%>
	        <jsp:include flush="true" page="../../jsp/common/menuHeader.jsp"></jsp:include>
    		<div id="fileSelectDiv">
		        <table align="center" border="0" cellpadding="10px">
	                <tr>
		                <th align="left">
	                        Select Type of Issue 
	                    </th>
	                    <td>
	                        <select id=issueID name=issueName onChange="createRequest();" width=20px; class="selectFilecomboBoxFormat">
	                            <option value="Select">
	                                Select
	                            </option>
	                            <%
	                            if((issueName != null) && (issueName.equals("ONT")))
                                {
	                            %>
	                            <option value="ONT" selected="selected">
	                                ONT
	                            </option>
	                            <option value="STB">
	                                STB
	                            </option>
	                            <%
                                }
	                            if((issueName != null) && (issueName.equals("STB")))
	                            {
	                            %>
	                            <option value="ONT">
	                                ONT
	                            </option>
	                            <option value="STB" selected="selected">
	                                STB
	                            </option>
	                            <%
	                            }
	                            else if(issueName == null)
	                            {
	                            %>
	                            <option value="ONT">
	                                ONT
	                            </option>
	                            <option value="STB">
	                                STB
	                            </option>
	                            <%
	                            }
	                            %>
	                       </select>
	                    </td>
	                    <td>
	                    <% if (reqflag == "no") {%>
	                    	<input type = "button" id="assignID" name="assignName" value="Need Help" onClick="assign();"/>
						<%} else { %>	                    	
							<input type = "button" id="cancelID" name="cancelName" value="Cancel Request" onClick="cancel();"/>
						<%} %>
	                    </td>
	                </tr>
			    </table>
		    </div>
            
            <br>
            
            <div>
            	<table align="center" border="0">
            		<tr>
            			<td>
            				<jsp:include flush="true" page="../../jsp/request/Pin.jsp"></jsp:include>
            			</td>
            		</tr>
            	</table>
            </div>
        </form>
		<jsp:include flush="true" page="../../jsp/common/footer.jsp"></jsp:include>
    </body>
</html>