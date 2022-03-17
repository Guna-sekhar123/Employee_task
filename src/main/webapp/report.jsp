<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
	<%
		response.setHeader("Cache-Control","no-cache,no-store,no-revalidate");
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Expires","0");
		
		if(session.getAttribute("Employee_Id") == null){
			response.sendRedirect("Login.jsp");
		}
	%>
	Enter Employee_Id :  <input type="number" name="id"><br>
	<input type="submit" value="open">
</body>
</html>