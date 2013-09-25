

<%
String Logined = (String)session.getAttribute("Logined");
if(Logined == null || !Logined.trim().equals("true")) {
	response.sendRedirect("index.html");
	return;
} 
 %>

