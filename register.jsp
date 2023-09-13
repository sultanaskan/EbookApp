<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<%@include file="all_component/allCSS.jsp"%>
</head>
<body>
	<%@include file="all_component/navbar.jsp"%>
	<br>

	<div class="container p-2">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card">
					<div class="card-body">
						<h3 class="text-center">Registration form</h3>

						<c:if test="${not empty succMsg}">
							<p class="text-center text-success">${succMsg}</p>
							<c:remove var="succMsg" scope="session"/>
						</c:if>


						<c:if test="${not empty errMsg }">
							<p class="text-center text-danger">${errMsg}</p>
							<c:remove var="errMsg" scope="session"/>
						</c:if>
						
						<c:if test="${not empty tramMsg }">
							<p class="text-center text-danger">${tramMsg}</p>
							<c:remove var="tramMsg" scope="session"/>
						</c:if>



						<form action="register" method="post">
							<div class="form-group">
								<label for="name">Full Name</label> <input name="name"
									type="text" class="form-control" id="name"
									aria-describedby="nameHelp">
							</div>

							<div class="form-group">
								<label for="email">Email address</label> <input name="email"
									type="email" class="form-control" id="email"
									aria-describedby="emailHelp">
							</div>

							<div class="form-group">
								<label for="phone">Phone Number</label> <input name="phone"
									type="number" class="form-control" id="phone"
									aria-describedby="phone">
							</div>

							<div class="form-group">
								<label for="exampleInputPassword1">Password</label> <input
									name="password" type="password" class="form-control"
									id="password">
							</div>

							<div class="form-group form-check">
								<input name="check" type="checkbox" class="form-check-input"
									id="exampleCheck1"> <label class="form-check-label"
									for="exampleCheck1">Agree Term & Conditions</label>
							</div>

							<button type="submit" class="btn btn-primary">Register</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>


	<%@include file="all_component/footer.jsp"%>
</body>
</html>