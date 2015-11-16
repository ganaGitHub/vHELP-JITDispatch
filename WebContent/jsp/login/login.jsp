<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="org.apache.log4j.Logger" %>
<%! private static Logger logger = Logger.getLogger("JITDispatch"); %>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
		<style type="text/css">@import url(<%=request.getContextPath()%>/css/common/common.css);</style>
        <script type="text/javascript" src="<%=request.getContextPath()%>/js/login/login.js"></script>
	</head>
	<body>
		<form name="loginForm">
        	<jsp:include flush="true" page="../../jsp/common/header.jsp"></jsp:include>
        	<table WIDTH="100%" HEIGHT="35PX" BORDER="0">
			    <tr class="menuFormat">
			        <td>
			            &nbsp;
			        </td>
			    </tr>
			</table>
			<table width="100%">
				<tr><td> <HR> </td></tr>
			</table>
	        <%
	        	String status = (String) request.getParameter("status");
	        	if(status != null) {
	        %>
	        	<table align="center" ><tr><td> <span class="errorTextFormat"> ${param.status} </span> </td></tr></table>
	        <%  } %>
	        <br><br>
            <table width="300px" height="50px" align="center" border="0">
				<tr>
					<td> Enter User ID Name </td>
					<td> <input type="text" name="userName" id="userNameID" width="1000px"> </td>
				</tr>
				<tr>
					<td> Enter Password </td>
					<td> <input type="password" name="password" id="passwordID" width="1000px"> </td>
				</tr>
			</table>
            <br>           
            <div>
            	<table align="center" width="400px" border="0">
            		<tr align="right">
            			<td> <input type="button" onclick="login();" value="Submit" align="middle"> </td>
            			<td> <input type="reset" value="Reset" align="middle"> </td>
            		</tr>
            	</table>
            </div>
        </form>
        
		<jsp:include flush="true" page="../../jsp/common/footer.jsp"></jsp:include>
	</body>
</html>