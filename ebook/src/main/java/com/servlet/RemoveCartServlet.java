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

@WebServlet("/removecart")
public class RemoveCartServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int cid = Integer.parseInt(req.getParameter("cid"));
		DBconn db = new DBconn();
		HttpSession se = req.getSession();
		DAOImpl dao = new DAOImpl(db.getConn());
		boolean r = dao.RemoveCartbyId(cid);
		if (r) {
			System.out.println("Cart removes successfuly");
			se.setAttribute("cremMSG", "<h4 class=\" text-center text-success\">Cart removes successfuly ! </h4>");
			resp.sendRedirect("cart.jsp");
		} else {
			System.out.println("Somthing wrong server");
			se.setAttribute("cremMSG", "<h4 class=\" text-center text-danger\">Somthing wrong server ! </h4>");
			resp.sendRedirect("cart.jsp");
		}

	}

}
