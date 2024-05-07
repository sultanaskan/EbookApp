<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>	
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register user:</title>
<%@include file="components/allcss.jsp"%>
</head>
<body>
	<%@include file="components/navbar.jsp"%>
	<div class="Container m-3">
		<div class="row ">
			<div class="col-md-8 offset-md-2 ">
				<div class="card">
					<div class="card-body">
					<h3 class="text-center"> Register Account</h3>
						<form action="RegisterServlet" method="post">
							<div class="form-row">
								<div class="form-group col-md-6">
									<label for="inputEmail4">Full Name</label> <input name="name"
										type="text" class="form-control">
								</div>
								<div class="form-group col-md-6">
									<label>Email</label> <input name="email" type="email"
										class="form-control">
								</div>
							</div>
							<div class="form-row">
								<div class="form-group col-md-6">
									<label for="inputEmail4">Phone Number</label> <input
										name="phone" type="text" class="form-control">
								</div>
								<div class="form-group col-md-6">
									<label>Address </label> <input name="address"
										type="text" class="form-control">
								</div>
							</div>
							<div class="form-row">
								<div class="form-group col-md-6">
									<label for="inputEmail4">Password</label> <input
										name="password" type="password" class="form-control">
								</div>
								<div class="form-group col-md-6">
									<label>Retype Password</label> <input name="rpassword"
										type="password" class="form-control">
								</div>
							</div>

							

							<div class="form-row">
								<div class="form-group col-md-6">
									<label>City</label> <input name="city" type="text"
										class="form-control">
								</div>
								<div class="form-group col-md-4">
									<label>State</label> <input name="state" type="text"
										class="form-control">
								</div>
								<div class="form-group col-md-2">
									<label for="inputZip">Zip</label> <input name="zip" type="text"
										class="form-control">
								</div>
								<div class="form-group">
								<label>Profile Photo</label>
								<input type="file">
								</div>
								<button class="btn btn-primary">Submit</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>


	<%@include file="components/footer.jsp"%>
</body>
</html>