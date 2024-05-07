package com.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.DAOImpl;
import com.db.Database;
import com.entity.Order;

@WebServlet("/order")
public class OrderServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = new Database().Dbconn();
		int o_id = 0;
		int c_id = 0;
		int b_id = 0;
		int s_id =  0;
		HttpSession s = req.getSession();
		
		try {
			o_id = Integer.parseInt(req.getParameter("o_id"));
			c_id = Integer.parseInt(req.getParameter("c_id"));
			b_id = Integer.parseInt(req.getParameter("b_id"));
			s_id = Integer.parseInt(req.getParameter("s_id"));
			
			
			DAOImpl dao = new DAOImpl(conn);
			Order o =new Order(o_id, c_id, b_id, s_id);
			boolean r =dao.saveOrder(o);
			if(r) {
				resp.sendRedirect("index.jsp");
				s.setAttribute("OSM", "Order submided Successfuly");
				
			}else {
				 {
						resp.sendRedirect("index.jsp");
						s.setAttribute("OSM", "Order Submition Failed");
						
					}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}