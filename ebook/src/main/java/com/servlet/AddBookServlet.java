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

@WebServlet("/addbook")
@MultipartConfig
public class AddBookServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession se = req.getSession();
		DBconn db = new DBconn();
		user u = (user) se.getAttribute("logedin");
		String role = u.getRole();
		System.out.println("Book added By: " + role);

		try {
			String bname = req.getParameter("bookname");
			String author = req.getParameter("author");
			Double price = Double.parseDouble(req.getParameter("price"));
			String cat = req.getParameter("cat");
			String status = req.getParameter("status");
			Part part = req.getPart("photo");
			String fileName = part.getSubmittedFileName();
			String email = u.getEmail();

			System.out.println("New book Details: " + " " + bname + " " + author + " " + price + " " + cat + " "
					+ status + " " + email + " " + fileName);

			Book b = new Book();
			b.setName(bname);
			b.setAuthor(author);
			b.setPrice(price);
			b.setCat(cat);
			b.setStatus(status);
			b.setFile(fileName);
			b.setEmail(email);

			DAOImpl dao = new DAOImpl(db.getConn());
			boolean r = dao.addNewBook(b);
			
			String path = getServletContext().getRealPath("")+ "books";
			System.out.println("Book image is going to save In: "+path);
			File file = new File(path);
			part.write(path + file.separator + fileName);

			if (r && role.equals("admin")) {
				System.out.println("BOOK Added successfuly");
				HttpSession se1 = req.getSession();
				se1.setAttribute("baddMSG", "<h1 class=\"text-center text-success\">BOOK Added successfuly :)</h1>");
				resp.sendRedirect("admin/addnewbook.jsp");
			}else if(r && role.equals("user")){
				System.out.println("BOOK Added successfuly");
				HttpSession se1 = req.getSession();
				se1.setAttribute("baddMSG", "<h1 class=\"text-center text-success\">BOOK Added successfuly :)</h1>");
				resp.sendRedirect("addoldbook.jsp");
				System.out.println("users book added successfuly!");
				
			}else {
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
