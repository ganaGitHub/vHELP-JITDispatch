<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
 
<html>
	<head>
      	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<style type="text/css">@import url(<%=request.getContextPath()%>/css/common/common.css);</style>
   </head>
   <body>
	   	<jsp:include flush="true" page="../../jsp/common/header.jsp"></jsp:include>
		<TABLE WIDTH="100%" HEIGHT="35PX" BORDER="0" cellpadding=5px>
		    <TR class="menuFormat">
<!-- 		        <TD width="85px"> -->
<%-- 		            <A href="<%=request.getContextPath()%>/jsp/common/home.jsp" class="link"> Home </A> --%>
<!-- 		        </TD> -->
<!-- 		        <TD width="120px"> -->
<%-- 		            <A href="<%=request.getContextPath()%>/CreateRequestAction?param=init" class="link"> vHelp-Request </A> --%>
<!-- 		        </TD> -->
<!-- 		        <TD width="120px"> -->
<%-- 		            <A href="<%=request.getContextPath()%>/TechAction?param=init" class="link"> I am Technician </A> --%>
<!-- 		        </TD> -->
<!-- 		        <TD width="85px"> -->
<%-- 		            <A href="<%=request.getContextPath()%>/jsp/common/help.jsp" class="link"> Help </A> --%>
<!-- 		        </TD> -->
<!-- 		        <TD COLSPAN="90"> -->
<!-- 		            &nbsp; -->
<!-- 		        </TD> -->
		        <TD width="100px" align="right">
		            <A href="<%=request.getContextPath()%>/LogoutAction?param=logout" class="link"> Logout </A>
		        </TD>
		    </TR>
		</TABLE>
		<TABLE width="100%">
			<TR><TD> <HR> </TD></TR>
		</TABLE>
	</body>
</html>
