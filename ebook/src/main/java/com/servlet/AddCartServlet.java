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
import com.entity.*;

@WebServlet("/addcartservlet")
public class AddCartServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			DBconn db = new DBconn();
			int bid = Integer.parseInt(req.getParameter("bid"));
			int uid = Integer.parseInt(req.getParameter("uid"));
			String bname = req.getParameter("bname");
			String author = req.getParameter("author");
			double price = Double.parseDouble(req.getParameter("price"));
			String address = req.getParameter("address");
			String phone = req.getParameter("phone");
			String email = req.getParameter("email");

			System.out.println("New cart Data: " + "  " + bid + "  " + uid + "  " + bname +"   "+ author+ "   " + price + "  " + phone+ "  " + email);

			Cart c = new Cart();
			c.setBid(bid);
			c.setUid(uid);
			c.setBname(bname);
			c.setAuthor(author);
			c.setPrice(price);
			c.setAddress(address);
			c.setPhone(phone);
			c.setEmail(email);

			DAOImpl dao = new DAOImpl(db.getConn());

			Cart r1 = dao.chackCartByUB(bid, uid);
			HttpSession se = req.getSession();
			if (r1 != null) {
				System.out.println("Book already exists card!:  " + r1);
				se.setAttribute("existsInCart", c);
				resp.sendRedirect("index.jsp");
			} else {

				boolean r = dao.addCart(c);
				if (r) {
					System.out.println("Cart added Successfuly!:  " + r1);
					se.setAttribute("caddMSG", "Cart added successfuly !");
					resp.sendRedirect("index.jsp");

				} else {
					System.out.println("Cart added Successfuly!:  " + r1);
					se.setAttribute("caddMSG", "Somthing wrong on server to add cart !");
					resp.sendRedirect("index.jsp");
				}
				;
			}

		} catch (Exception e) {

		}
	}

}
