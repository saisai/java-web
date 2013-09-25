<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>
<jsp:include page="header.jsp"/>

<div id="wrapper">
	<div id="page_body">
		<div style="margin:auto;width: 800px;">
		<form id="frmApply" action="apply" method="post">
			<table border="0" cellspacing="10" cellpadding="10">
				<tr><td>Website url</td><td><input type="text" name="txtCompanyName" id="txtCompanyName" class="txtBox" /></td></tr>
				<tr><td>E-mail</td><td><input type="text" name="txtEmail" id="txtEmail" class="txtBox" /></td></tr>				
				<tr><td></td><td><input type="submit" name="btnApply"  id="btnApply" value="Apply" /></td></tr>
			</table>
			<div id="results"></div>
		</form>
		</div>
	</div>
</div>

<jsp:include page="footer.jsp"/>
