<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Home</title>
<%@include file="allCSS.jsp"%>

</head>
<body>
<c:if test="${empty userobj }">
<c:redirect url="../login.jsp"/>
</c:if>

	<%@include file="navbar.jsp"%>

	<div class="container m-3 text-center">
		<div class="row p-5">
			<div class="col-md-3  ">
				<a href="addbook.jsp">
					<div class="card ">
						<div class="card-body text-center">
							<i class="fa-solid fa-square-plus fa-3x text-primary"></i>
							<h2>Add book</h2>
							-----------
						</div>
					</div>
				</a>

			</div>


			<div class="col-md-3">
				<div class="card ">
					<a href="allbook.jsp">
						<div class="card-body text-center">
							<i class="fa-solid fa-book-open fa-3x text-success"></i>
							<h2>All Books</h2>
							-----------
						</div>
					</a>
				</div>
			</div>


			<div class="col-md-3">

				<a href="order.jsp">
					<div class="card ">
						<div class="card-body text-center">
							<i class="fa-solid fa-box-open fa-3x text-warning"></i>
							<h2>Orders</h2>
							-----------
						</div>
					</div>
				</a>
			</div>

			<div class="col-md-3">
				<a style="text-decoration: none;" data-toggle="modal" data-target="#exampleModal">
					<div class="card ">
						<div class="card-body text-center">
							<i class="fa-solid fa-right-from-bracket fa-3x text-danger"></i>
							<h2>Log out</h2>
							-----------
						</div>
					</div>
				</a>
			</div>
		</div>
	</div>

	<br>

	<%@include file="footer.jsp"%>
	<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1"
	aria-labelledby="exampleModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title" id="exampleModalLabel">Confram logout!</h5>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body text-center">
				<h4>Do you want to logout?</h4>
				<button type="button" class="btn btn-secondary" data-dismiss="modal">No</button>
				<a href="../logout" type="button" class="btn btn-primary">Yes</a>
			</div>
			<div class="modal-footer"></div>
		</div>
	</div>
</div>
<!-- end modal -->

</body>
</html>