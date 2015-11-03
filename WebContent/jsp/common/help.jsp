<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title> Online Spreadsheet</title>
	</head>
	<body>
		<jsp:include flush="true" page="../../jsp/common/menuHeader.jsp"></jsp:include>
		<table width="1000px" height="200px" align="center" border="0">
			<TR>
				<TD>
					<H3> Online Spreadsheet Features </H3>
				</TD>
			</TR>
			<TR>
				<TD>
					<DL> 
						<DT> <B> Create File </B>
						<DD> A new spreadsheet can be created on the fly with the required columns. 
						<DD> Note: Please follow the instructions in the Create File screen.
					</DL>
				</TD>
			</TR>
			<TR>
				<TD>
					<DL> 
						<DT> <B> Open File </B>
						<DD> Records in the existing spreadsheet can be viewed, added, updated, cloned, inserted and deleted. 
						<DD> To modify the records, lock the by clicking on the Modify button and then right click on one of the record.
					</DL>
				</TD>
			</TR>
			<TR>
				<TD>
					<DL> 
						<DT> <B> Download File </B>
						<DD> Latest spreadsheet can be downloaded on to your PC by this option.
						<DD> Select the spreadsheet from the 'Select File' drop down and save.
					</DL>
				</TD>
			</TR>
			
			<TR>
				<TD>
					<DL> 
						<DT> <B> Upload File </B>
						<DD> Records from a local XLS file can be uploaded to a appropriate spreadsheet.
						<DD> Browse the local XLS file, and select the appropriate file from 'Select File' drop down and then download.
					</DL>
				</TD>
			</TR>
		</table>
		<jsp:include flush="true" page="../../jsp/common/footer.jsp"></jsp:include>
	</body>
</html>