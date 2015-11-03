<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title> Header Page </title>
	</head>
	<body>
		<%
		String title = "vHelp - Just In Time Dispatch";
		%>
		<table WIDTH="100%" border=0 style="vertical-align: text-bottom;">
		    <tr>
		    	<td width="5%"> <IMG SRC="<%=request.getContextPath()%>/images/titleImage.png" /> </td>
				<td align="left"> 
					<H3> <%= title %> </H3> 
				</td>
		    </tr>
	   </table>	
	</body>
</html>