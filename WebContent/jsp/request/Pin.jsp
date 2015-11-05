<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.util.ArrayList" %>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<div id="Map" style="width: 1100px; height: 550px;">
	</div>
	<script type="text/javascript" src="http://code.jquery.com/jquery-2.1.0.min.js"></script>
	<script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=false"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/utilities/pin.js"></script>
	
	<%
	String technicianLatLongList = (String) session.getAttribute("technicianLatLongList");
	System.out.println("technicianLatLongList: " + technicianLatLongList);
	
	int technicianLatLongListLength = Integer.valueOf((String) session.getAttribute("technicianLatLongListLength"));
	System.out.println("technicianLatLongListLength: " + technicianLatLongListLength);
	
	String userName = (String) session.getAttribute("sUserName");
	System.out.println("technicianLatLongList: " + technicianLatLongList);
	
	String userLatLongStr = (String) session.getAttribute("userLatLongStr");
	System.out.println("userLatLongStr: " + userLatLongStr);
	
	
	%>
	
	<script type="text/javascript">
		
	</script>
	<body>
		<form name="pinForm">
			<input type="text" id="sTechnicianLatLongListID" name="sTechnicianLatLongList" value="<%=technicianLatLongList %>">
			<input type="hidden" id="technicianLatLongListLengthID" name="technicianLatLongListLengthName" value="<%=technicianLatLongListLength %>">
			<input type="hidden" id="sUserNameID" name="sUserName" value="<%=userName %>">
			<input type="hidden" id="userLatLongStrID" name="userLatLongStrName" value="<%=userLatLongStr %>">
		</form>
	</body>
</html>