<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login:</title>
<%@include file="components/allcss.jsp"%>
</head>
<body>
	<%@include file="components/navbar.jsp"%>
	<div class="Container m-3">
		<div class="row ">
			<div class="col-md-6 offset-md-3 ">
				<div class="card">
					<div class="card-body">
						<h3 class="text-center">Login</h3>
						
						<c:if test="${not empty logFM }">
							<h3 class="text-center text-danger">${logFM }</h3>
							<c:remove var="logFM" scope="session" />
						</c:if>

						<form action="LoginServlet" method="post">

							<div class="form-group">
								<label for="inputEmail4">User Email</label> <input name="email"
									type="email" class="form-control">
							</div>
							<div class="form-group ">
								<label>Password</label> <input name="password" type="password"
									class="form-control">
							</div>




							<button class="btn btn-primary float-right">Login</button>

						</form>
					</div>
				</div>
			</div>
		</div>
	</div>



	<%@include file="components/footer.jsp"%>
</body>
</html>