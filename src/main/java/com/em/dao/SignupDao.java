package com.em.dao;

import java.io.*;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SignupDao")
public class SignupDao extends HttpServlet {
	String url = "jdbc:mysql://localhost:3306/gunasekhar_111915084";
	String username = "root";
	String password = "Gunasekhar@1432#";
	public boolean check(String id,String pass,String fname) throws SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,password);
		String q1 = "insert into employee_details values(?,?,?,?,?,?,?,?)";
		ps = con.prepareStatement(q1);
		ps.setString(1,id);    
        ps.setString(2,pass);
        ps.setString(3,fname);
        ps.setString(4,lname);
        ps.setString(5,dob);
        ps.setString(6,contact);
        ps.setString(7,ms);
        ps.setString(8,ys);
		ResultSet rs=  ps.executeUpdate();
		if(rs.next()) {
			return true;
		}
		return false;
	}
}
