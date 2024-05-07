<%@page import="com.entity.Book"%>
<%@page import="com.DAO.DBconn"%>
<%@page import="com.DAO.DAOImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Details</title>
<%@include file="components/allcss.jsp"%>
</head>
<body>
	<%@include file="components/navbar.jsp"%>
	<%
	int id = Integer.parseInt(request.getParameter("bid"));
	DAOImpl dao = new DAOImpl(conn);
	Book b = dao.getBookById(id);
	System.out.println("Details of book: " + b);
	%>

	<div class="container my-3 bg-white text-dark">
		<div class="row">
			<div class="col-md-6 ">
				<div class="card offset-3" style="width: 500px">
					<div class="card-body">
						<img style="float: center; height: auto; width: 300px;" alt="<%=b.getFile()%>"
							src="books/<%=b.getFile()%>">
					</div>
				</div>
			</div>
			<div class="col-md-6 p-3">
				<div class="card" style="width: 500px">
					<div class="card-body">
						<h4 class="text-center text-warning">
							Book name:
							<%=b.getName()%></h4>
						<h4 class="text-center text-warning">
							Book Author:
							<%=b.getAuthor()%></h4>
						<h4 class="text-center text-warning">
							Book Price:
							<%=b.getPrice()%></h4>
						<h5 class="text-center ">
							Contract seller:
							<%=b.getEmail()%></h5>
					</div>
					<br>
					<div
						class="row text-center justify content-center align-items-center">
						<div class="col-4 ">
							<i class="fa-solid fa-layer-group fa-3x text-primary"></i> <br>
							in stock
						</div>
						<div class="col-4 ">
							<i class="fa-solid fa-arrow-rotate-left fa-2x text-success"></i>
							<br> Return Available
						</div>
						<div class="col-4 ">
							<i class="fa-solid fa-truck fa-3x text-danger"></i> <br>
							Free Shifting
						</div>
					</div>
					<br>
					
					<div class="row text-center p-4">
					<div class="col-6"><a class="btn btn-primary">Continue shopping</a></div>
					<div class="col-6"><a class="btn btn-danger">Add Cart</a></div>
						
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@include file="components/footer.jsp"%>

</body>
</html>