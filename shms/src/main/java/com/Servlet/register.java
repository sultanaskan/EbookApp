package com.Servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.DAOImp;
import com.DAO.Dbconn;
import com.Entity.mborders;

@WebServlet("/registerServlet")
public class register extends HttpServlet {
	Connection conn = new Dbconn().DBconn();
	
	

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Handle the POST request here
    	HttpSession se= req.getSession();
    	try {
    	String mbnam= req.getParameter("mbnam");
    	String mbpho= req.getParameter("mbpho");
    	String mbmai= req.getParameter("mbmai");
    	String mbadd= req.getParameter("mbadd");
    	String mbpas= req.getParameter("mbpas");
    	String mbpcon= req.getParameter("mbpcon");
    	
    	System.out.println("Registration form datas: "+mbnam+mbpho+ mbmai+ mbadd+ mbpas + mbpcon);

    	
    	if(mbpas != mbpcon) {
    	mborders mb = new mborders();
    	mb.setMbnam(mbnam);
    	mb.setMbpho(mbpho);
    	mb.setMbmai(mbmai);
    	mb.setMbadd(mbadd);
    	mb.setMbpass(mbpas);
    	System.out.println("mborder id: "+ mb.getMbnam()+mb.getMbpho()+ mb.getMbmai()+ mb.getMbadd()+ mb.getMbpass() + mbpcon);
    	
    	DAOImp DAO = new DAOImp(conn);
    	DAO.MbRegister(mb);
		se.setAttribute("REMSG", "<p style='text-align:center; color:green;'>Registration successfull :) You can login new!</p>");
    	resp.sendRedirect("register.jsp");
    	} else {
    		se.setAttribute("REMSG", "<p style='text-align:center; color:red;'>Registration failed :( Password not match!</p>");
    		resp.sendRedirect("register.jsp");
    	}
    	
    	
    	
    	}catch (Exception e) {
    		e.printStackTrace();
    	}
    	
    	
       
    }
}
