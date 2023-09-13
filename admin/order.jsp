<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin: All books</title>
<%@include file="allCSS.jsp"%>
</head>
<body>
	<c:if test="${empty userobj }">
		<c:redirect url="../login.jsp" />
	</c:if>
	<%@include file="navbar.jsp"%>
	<div class="container">
		<div class="row">
			<div class="col">
				<h5 class="text-center">Hello Admin</h5>
				<div class="card">
					<div class="card-body">
						<table class="table table-striped">
							<thead>
								<tr class="bg-primary text-white">
									<th scope="col">O.. Id</th>
									<th scope="col">Name</th>
									<th scope="col">Email</th>
									<th scope="col">Address</th>
									<th scope="col">Phone</th>
									<th scope="col">Book name</th>
									<th scope="col">Author</th>
									<th scope="col">Price</th>
									<th scope="col">Payment Type</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<th scope="row">1</th>
									<td>Mark</td>
									<td>Otto</td>
									<td>@mdo</td>
									<td>Mark</td>
									<td>Otto</td>
									<td>@mdo</td>
									<td>Mark</td>
									<td>Otto</td>

								</tr>
								<tr>
									<td>Mark</td>
									<td>Otto</td>
									<td>@mdo</td>
									<td>Mark</td>
									<td>Otto</td>
									<td>@mdo</td>
									<td>Mark</td>
									<td>Otto</td>
									<td>Otto</td>
								</tr>
								<tr>
									<td>Mark</td>
									<td>Otto</td>
									<td>@mdo</td>
									<td>Mark</td>
									<td>Otto</td>
									<td>@mdo</td>
									<td>Mark</td>
									<td>Otto</td>
									<td>Otto</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>

	<%@include file="footer.jsp"%>
</body>
</html>