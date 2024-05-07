package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.*;

import com.entity.user;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		try {
			DBconn db = new DBconn();
			user u = new user();
			String name = req.getParameter("name");
			String email = req.getParameter("email");
			String phone = req.getParameter("phone");
			String password = req.getParameter("password");
			String address = req.getParameter("address");
			String city = req.getParameter("city");
			String state = req.getParameter("state");
			String zip = req.getParameter("zip");

			System.out.println("New user Going to registration in this app: " + "  " + name + "  " + email + "  "
					+ phone + "  " + password + "  " + address + "  " + city + "  " + state + "  " + zip);

			u.setName(name);
			u.setEmail(email);
			u.setPhone(phone);
			u.setPassword(password);
			u.setAddress(address);
			u.setCity(city);
			u.setState(state);
			u.setZip(zip);

			DAOImpl dao = new DAOImpl(db.getConn());

			boolean r = dao.RegisterUser(u);

			HttpSession se = req.getSession();
			if (r) {
				se.setAttribute("REGSM", "Registration Successfull !");
			} else {
				se.setAttribute("REGFM", "Somthing Wrong on server");
				
			}
			
			resp.sendRedirect("index.jsp");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}