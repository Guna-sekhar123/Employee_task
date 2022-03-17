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
	<%
	String eid = session.getAttribute("Employee_Id");
	String sql = "select * from employee_details where Employee_Id=?";
	String url = "jdbc:mysql://localhost:3306/gunasekhar_111915084";
	String username = "root";
	String password = "Gunasekhar@1432#";
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection(url,username,password);
	PreparedStatement st = con.prepareStatement(sql);
	st.setString(1, eid);
	ResultSet rs = st.executeQuery();
	if(rs.next()) {
		%>Employee ID :<%= rs.getString(1)%>
		First Name :<%= rs.getString(2)%>
		Last Name :<%=rs.getString(3)%>
		Date of Birth :<%=rs.getString(4)%>
		Contact :<%=rs.getString(5)%>
		Job role :<%= rs.getString(6)%>
		Monthly salary :<%= rs.getString(7)%>
		yearly salary :<%= rs.getString(8)%>
		<% int x1 = rs.getInt(7);
		int x2  = rs.getInt(8);%>
		Total salary:<%= x1+x2 %><%
		}
	%>
</body>
</html>