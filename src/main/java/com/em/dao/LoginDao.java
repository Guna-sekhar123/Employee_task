package com.em.dao;

import java.io.*;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginDao")
public class LoginDao extends HttpServlet {
	String sql = "select * from employee_details where Employee_Id=? and password=?";
	String url = "jdbc:mysql://localhost:3306/gunasekhar_111915084";
	String username = "root";
	String password = "Gunasekhar@1432#";
	public boolean check(String eid,String pass) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1,eid);
			st.setString(2, pass);
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		return false;
	}

}
