<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ebook login</title>
<%@include file="all_component/allCSS.jsp"%>
</head>
<body style="background-color: #f0f1f2">
	<%@include file="all_component/navbar.jsp"%>
	<div class="container p-3">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card">
					<div class="card-body">
					<h3 class="text-center">Login</h3>
					<c:if test="${not empty logfailMsg }">
					<h5 class="text-center text-danger">${logfailMsg}</h5>
					<c:remove var="logfailMsg" scope="session"/>
					</c:if>
					
					
						<form action="login" method="post">
							<div class="form-group">
								<label for="email">Email address</label> <input name="email" type="email"
									class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp">
							</div>
							<div class="form-group">
								<label for="password">Password</label> <input name="password" type="password"
									class="form-control" id="password">
							</div>
							<div class="text-center">
								<button type="submit" class="btn btn-primary">Login</button>
								<br>
								<a class="btn-sm" href="register.jsp">Create acount</a>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>


	<%@include file="all_component/footer.jsp"%>
</body>
</html>