<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add book page</title>
<%@include file="allCSS.jsp"%>
</head>
<body>
	<c:if test="${empty userobj }">
		<c:redirect url="../login.jsp" />
	</c:if>
	<%@include file="navbar.jsp"%>

	<div class="container p-3  ">
		<div class="row">
			<div class="col-md-6 offset-3">
				<div class="card p-3">
					<h1 class="text-center text-success">Add a new book</h1>

					<c:if test="${not empty addSuccMsg}">
						<h4 class="text-center text-success">${addSuccMsg}</h4>
						<c:remove var="addSuccMsg" scope="session" />
					</c:if>
					<c:if test="${not empty addFailMsg}">
						<h4 class="text-center text-danger">${addFailMsg}</h4>
						<c:remove var="addFailMsg" scope="session" />
					</c:if>


					<div class="card-body">
						<form action="../addbook" method="post"
							enctype="multipart/form-data">

							<div class="form-group ">
								<label for="inputEmail4">Book name</label> <input
									name="bookName" type="text" class="form-control"
									id="inputEmail4">
							</div>
							<div class="form-group ">
								<label for="inputPassword4">Author Name</label> <input
									name="authName" type="text" class="form-control"
									id="inputPassword4">
							</div>

							<div class="form-group">
								<label for="inputAddress">Price</label> <input name="price"
									type="number" class="form-control" id="inputAddress">
							</div>

							<div class="form-group">
								<label for="inputState">Book Categories</label> <select
									name="categories" id="inputState" class="form-control">
									<option selected>Choose...</option>
									<option>New</option>
									<option>Old</option>
								</select>
							</div>
							<div class="form-group ">
								<label for="inputState">Book Status</label> <select
									name="status" id="inputState" class="form-control">
									<option selected>Active</option>
									<option>Inactive</option>
								</select>
							</div>

							<div class="form-group ">
								<label for="inputPassword4">Upload cover photo</label> <input
									name="photo" type="file" class="form-control-file"
									id="inputPassword4">
							</div>

							<div class="form-group">
								<div class="form-check">
									<input class="form-check-input" type="checkbox" id="gridCheck">
									<label name="check" class="form-check-label" for="gridCheck">
										I agree term & conditions </label>
								</div>
							</div>
							<button type="submit" class="btn col-md-3 offset-9 btn-primary">Submit</button>
						</form>
					</div>


				</div>
			</div>
		</div>
	</div>


	<%@include file="footer.jsp"%>

</body>
</html>