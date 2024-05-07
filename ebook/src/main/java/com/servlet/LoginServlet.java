package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.DAOImpl;
import com.DAO.DBconn;
import com.entity.user;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			DBconn db = new DBconn();
			String email = req.getParameter("email");
			String password = req.getParameter("password");

			System.out.println(email + "went to login" + password);

			DAOImpl dao = new DAOImpl(db.getConn());
			user u = new user();
			u = dao.getUserByEP(email, password);
			System.out.println(u);
			// System.out.println(u.getRole());

			HttpSession se = req.getSession();
			se.setAttribute("logedin", null);
			if (u == null) {
				se.setAttribute("logFMSG", "Login failed!!!");
				System.out.println("login failed!!!");
				resp.sendRedirect("login.jsp");
			} else if (u.getRole().equals("admin")) {
				se.setAttribute("logedin", u);
				se.setAttribute("logSMSG", "Admin Login successful !");
				resp.sendRedirect("admin/home.jsp");
				System.out.print("admin login Success");
			} else if (u.getRole().equals("user")) {
				se.setAttribute("logedin", u);
				se.setAttribute("logSMSG", "User Login successful !");
				resp.sendRedirect("index.jsp");
				System.out.println("user login Success");
			} else {
				se.setAttribute("logFMSG", "Login failed");
				System.out.println("login failed");
				resp.sendRedirect("login.jsp");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
