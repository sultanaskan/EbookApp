<%@page import="com.entity.Cart"%>
<%@page import="com.entity.Book"%>
<%@page import="java.util.List"%>
<%@page import="com.DAO.DBconn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Book:</title>
<%@include file="components/allcss.jsp"%>


</head>
<body>
	<%@include file="components/navbar.jsp"%>


	<div class="container">
		<div class="card text-center">

			<div class="m-5">
				<img height="200px" width="200px"
					class="rounded-circle border w-5 h-5 r " alt=""
					src="data:image/jpeg;base64,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">

			</div>

			<div
				class="text-center   p-5 justify-content-center align-item-center">

				<div class="card text-enter float-right">
					<div class="card-body col-6">
						<table class="p-5">
							<tr>
								<td><h4>Name</h4></td>
								<td><h4>Sultan Ahmed</h4></td>
							</tr>
							<tr>
								<td><h4>Email</h4></td>
								<td><h4>sultanahmedaskan@gmail.com</h4></td>
							</tr>
							<tr>
								<td><h4>Phone</h4></td>
								<td><h4>01746144544</h4></td>
							</tr>
							<tr>
								<td><h4>Address</h4></td>
								<td><h4>Dhaka, bangladesh</h4></td>
							</tr>
						</table>
					</div>
				</div>
			</div>




		</div>

	</div>



	<br>









	<%@include file="components/footer.jsp"%>
</body>
</html>