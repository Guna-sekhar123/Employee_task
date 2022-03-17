package com.em.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SignupDao")
public class SignupDao extends HttpServlet {
	String sql = "select * from login where Employee_Id=? and password=?";
	String url = "jdbc:mysql://localhost:3306/gunasekhar_111915084";
	String username = "root";
	String password = "Gunasekhar@1432#";
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection(url,username,password);
	Statement stmt=(Statement) con.createStatement();
    String q1="select * from emp_details where uname="+uname+" and pass="+pass+";";
    ResultSet rs=((java.sql.Statement) stmt).executeQuery(q1);
    response.sendRedirect("login.jsp");
    con.close();

}
