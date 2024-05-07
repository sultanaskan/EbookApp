<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<%@include file="/components/adminlog.jsp" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin home</title>
<%@include file="/components/allcss.jsp"%>
</head>
<body>





	<%@include file="navbar.jsp"%>

	<div
		class="container-fluid m-3 justify-content-center align-items-center "
		style="min-height: 300px">
		<div class="row text-center justify-content-center align-items-center">
			<div class="col-md-3 col-sm-6 my-1">
				<a class="btn" style="width: 100%" href="addnewbook.jsp">
					<div class="card">
						<div class="card-body">
							<i class="fa-solid fa-circle-plus fa-3x text-primary"></i>
							<h4>Add New Book</h4>
						</div>
					</div>
				</a>
			</div>



			<div class="col-md-3 col-sm-6 my-1">
				<a class="btn" style="width: 100%" href="allbook.jsp"><div
						class="card">
						<div class="card-body">
							<i class="fa-solid fa-book-atlas fa-3x text-success"></i>
							<h4>All Books</h4>
						</div>
					</div></a>
			</div>

			<div class="col-md-3 col-sm-6 my-1">
				<a class="btn" style="width: 100%" href="orders.jsp"><div
						class="card">
						<div class="card-body">
							<i class="fa-solid fa-box-open fa-3x text-warning"></i>
							<h4>Orders</h4>
						</div>
					</div> </a>
			</div>



			<div class="col-md-3 col-sm-6 my-1">
				<a class="btn" style="width: 100%" href="#"><div class="card">
						<div class="card-body">
							<i class="fa-solid fa-right-from-bracket fa-3x text-danger"></i>
							<h4>Logout</h4>
						</div>
					</div> </a>
			</div>

		</div>
	</div>


	<%@include file="/components/footer.jsp"%>
</body>
</html>