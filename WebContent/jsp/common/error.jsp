<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title> Error Page </title>
		<style type="text/css">@import url(<%=request.getContextPath()%>/css/error.css);</style>
	</head>
	<body>
		<jsp:include flush="true" page="../../jsp/common/menuHeader.jsp"></jsp:include>
		<table width="750px" height="400px" align="center" border="0">
			<tr>
				<td>
					<span class="errorTextFormat"> **${param.error} </span>
				</td>
			</tr>
		</table>
		<jsp:include flush="true" page="../../jsp/common/footer.jsp"></jsp:include>
	</body>
</html>
