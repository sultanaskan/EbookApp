package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconn {
Connection conn=null;
String url= "jdbc:mysql://localhost:3306/shms";
String user = "root";
String pass= "";
		public Connection DBconn() {
			 
			 try {
				 Class.forName("com.mysql.cj.jdbc.Driver");
				 conn= DriverManager.getConnection(url, user, pass);
				 
			 }catch (Exception e) {
				e.printStackTrace();
			 }
	return conn;
}
}
