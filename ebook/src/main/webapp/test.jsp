<%@page import="com.db.Database"%>
<%@page import="com.DAO.DBconn"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello World</h1>
<%
Connection conn = new Database().Dbconn();
System.out.println(conn);
%>
<%=conn  %>

</body>
</html>