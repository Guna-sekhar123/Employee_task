package com.em;

import java.io.*;

import com.em.dao.LoginDao;

@WebServlet("/Login")
public class Login extends HttpServlet {
	protected <HttpServletRequest> void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String eid = request.getParameter("eid");
		String pass = request.getParameter("pass");
		LoginDao dao = new LoginDao();
		if(dao.check(eid, pass)) {
			HttpSession session = request.getSession();
			session.setAttribute("Employee_Id", eid);
			response.sendRedirect("report.jsp");
		}
		else {
			response.sendRedirect("Login.jsp");
		}
	}

}
