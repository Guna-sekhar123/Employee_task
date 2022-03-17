package com.em;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.em.dao.*;
@WebServlet("/Signup")
public class Signup extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String eid = request.getParameter("id");
		String pass = request.getParameter("pass");
		String fn   = request.getParameter("fname");
		String ln = request.getParameter("lname");
		String dob = request.getParameter("dob");
		int cnum = request.getParameter("cnum");
		String jr = request.getParameter("jr");
		int ms = request.getParameter("ms");
		int yb = request.getParameter("yb");
		SignupDao dao = new SignupDao();
		if(dao.check(x)) {
			response.sendRedirect("login.jsp");
		}
		else {
			response.sendRedirect("Signup.jsp");
		}
	}

}
