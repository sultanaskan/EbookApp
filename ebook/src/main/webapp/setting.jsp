<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<%@ include file="components/userLoged.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Setting</title>
<%@include file="components/allcss.jsp"%>
</head>
<body>
	<%@include file="components/navbar.jsp"%>


	<div class="container my-3">
		<div class="row text-center justify-content-center">


			<div class="col-md-4 col-sm-6 my-2 ">
				<div class="card">
					<a class="btn" href="addoldbook.jsp">
						<div class="card-body">
							<i class="fa-solid fa-book fa-3x text-success"></i>
							<h4>Sell Old Book</h4>
						</div>
					</a>
				</div>
			</div>
			
			
			
			<div class="col-md-4 col-sm-6 my-2 ">
				<div class="card">
					<a class="btn" href="selloldbook.jsp">
						<div class="card-body">
							<i class="fa-solid fa-lock fa-3x text-warning"></i>
							<h4>Login & Security</h4>
						</div>
					</a>
				</div>
			</div>



		</div>











		<div class="row text-center justify-content-center">


			<div class="col-md-3 col-sm-6 my-2">
				<a href="addoldbook.jsp">
					<div class="card">
						<div class="card-body">
							<i class="fa-solid fa-map-location-dot fa-3x"></i>
							<h4>Your Address</h4>
							<p>Edit your Address</p>

						</div>
					</div>
				</a>
			</div>


			<div class="col-md-3 col-sm-6 my-2">
				<a href="">
					<div class="card">
						<div class="card-body">
							<i class="fa-solid fa-box-open fa-3x text-warning"></i>
							<h4>My Order</h4>
							<p>Track your order</p>
						</div>
					</div>
				</a>
			</div>



			<div class="col-md-3 col-sm-6 my-2">
				<a>
					<div class="card">
						<div class="card-body">
							<i class="fa-solid fa-envelope-open-text fa-3x"></i>
							<h4>24/7 Support</h4>
							<p>get help</p>
						</div>
					</div>
				</a>
			</div>



		</div>









	</div>
	</div>


	<%@include file="components/footer.jsp"%>
</body>
</html>