package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database{
	
	
	
	
	

	public Database() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Connection Dbconn() {
		// TODO Auto-generated method stub
		Connection conn  = null;
		String url= "jdbc:mysql://localhost:3306/ebook";
		String user= "root";
		String password= "";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			
			conn = DriverManager.getConnection(url,user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
	

}
