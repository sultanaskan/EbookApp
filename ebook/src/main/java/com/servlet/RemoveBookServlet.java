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

@WebServlet("/removebook")
public class RemoveBookServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int bid = Integer.parseInt(req.getParameter("bid"));
			DBconn db = new DBconn();
			DAOImpl dao = new DAOImpl(db.getConn());
			boolean r = dao.removeBookById(bid);
			HttpSession se =req.getSession();
			if(r) {
				System.out.println("Book remove successfuly");
				se.setAttribute("bremMSG", "Book remove successfuly !");
				resp.sendRedirect("admin/allbook.jsp");
			}else {
				System.out.println("Book remove successfuly");
				se.setAttribute("bremMSG", "Somthing Wrong on Server!");
				resp.sendRedirect("admin/allbook.jsp");
			}
				
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
