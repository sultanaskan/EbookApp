package com.servlet;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.DAO.DAOImpl;
import com.DAO.DBconn;
import com.entity.Book;
import com.entity.user;

@WebServlet("/updatebook")
//@MultipartConfig
public class UpdateBookServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession se = req.getSession();
		DBconn db = new DBconn();
		user u = (user) se.getAttribute("logedin");

		try {
			System.out.println("start fachig request");
			int id = Integer.parseInt(req.getParameter("bid"));
			String bname = req.getParameter("bookname");
			String author = req.getParameter("author");
			Double price = 43.3;// Double.parseDouble(req.getParameter("price"));
			String cat = req.getParameter("cat");
			String status = req.getParameter("status");
			String email = u.getEmail();

			System.out.println("end fachig request");

			System.out.println("New book Details: "+id + " " + bname + " " + author + " " + price + " " + cat + " "
					+ status + " " + email);

			Book b = new Book();
			b.setBid(id);
			b.setName(bname);
			b.setAuthor(author);
			b.setPrice(price);
			b.setCat(cat);
			b.setStatus(status);
			b.setEmail(email);

			DAOImpl dao = new DAOImpl(db.getConn());
			boolean r = dao.updateBook(b);
			if (r) {
				System.out.println("BOOK updated successfuly");
				HttpSession se1 = req.getSession();
				se1.setAttribute("baddMSG", "<h1 class=\"text-center text-success\">BOOK Updated successfuly :)</h1>");
				resp.sendRedirect("admin/addnewbook.jsp");
			} else {
				System.out.println("Somthing Wrong on server");
				HttpSession se1 = req.getSession();
				se1.setAttribute("baddMSG", "<h1 class=\"text-center text-danger\">Somthing Wrong on server :(</h1>");
				resp.sendRedirect("admin/addnewbook.jsp");
			}
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
