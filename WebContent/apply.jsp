<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="js/jquery-1.10.2.min.js"></script>
<script src="js/validate.js"></script>
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>

<jsp:include page="header.jsp"/>

<div id="wrapper">
	<div id="page_body">
		<div style="margin:auto;width: 800px;">
		<form id="frmApply" action="apply" method="post">
			<table border="0" cellspacing="10" cellpadding="10">
				<tr><td>Company Name</td><td><input type="text" name="txtCompanyName" id="txtCompanyName" class="txtBox" /></td></tr>
				<tr><td>E-mail</td><td><input type="text" name="txtEmail" id="txtEmail" class="txtBox" /></td></tr>
				<tr><td>Web site</td><td><input type="text" name="txtWebSite" id="txtWebSite" class="txtBox" /></td></tr>
				<tr><td>Phone no</td><td><input type="text" name="txtPhoneNo" id="txtPhoneNo" class="txtBox" /></td></tr>
				<tr><td>Contact person</td><td><input type="text" name="txtContactPerson" id="txtContactPerson" class="txtBox" /></td></tr>
				<tr><td>Address</td><td><input type="text" name="txtAddress" id="txtAddress" class="txtBox" /></td></tr>
				<tr><td>Salary</td><td><input type="text" name="txtSalary" id="txtSalary" class="txtBox" /></td></tr>
				<tr><td></td><td><input type="submit" name="btnApply"  id="btnApply" value="Apply" /></td></tr>
			</table>
			<div id="results"></div>
		</form>
		</div>
	</div>
</div>


<jsp:include page="footer.jsp"/>