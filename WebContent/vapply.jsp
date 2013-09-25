<%@page import="javax.xml.ws.Response"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %> 
<%@ page import="sai.applyjob.db.DBConnection" %> 	


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
	<div style="width: 900px; margin:auto;">
<%
		Connection conn;
		conn = DBConnection.getConnection();
%>
<%
try {
Statement statement = null;
ResultSet rs = null;
statement = conn.createStatement();
// sql query to retrieve values from the secified table.
String QueryString = "SELECT * from tbl_company";
rs = statement.executeQuery(QueryString);
%>
<table cellpadding="10" border="0" >
<%
while (rs.next()) {
%>
<TR>
<TD><%=rs.getInt(1)%></TD>
<TD><%=rs.getString(2)%></TD>
<TD><%=rs.getString(3)%></TD>
<TD><%=rs.getString(4)%></TD>
</TR>
<% } %>
<%
// close all the connections.
rs.close();
statement.close();
conn.close();
} catch (Exception ex) {
%>
</font>
<font size="+3" color="red"></b>
<%
out.println("Unable to connect to database.");
}
%>
</table>
</font>
	</div>
	</div>
</div>



<jsp:include page="footer.jsp"/>