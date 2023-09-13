<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="com.DB.*" import="com.DAO.*" import="com.entity.*"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin: Edit book</title>
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
					<h1 class="text-center text-success">Edit book</h1>

					<c:if test="${not empty addSuccMsg}">
						<h4 class="text-center text-success">${addSuccMsg}</h4>
						<c:remove var="addSuccMsg" scope="session" />
					</c:if>
					<c:if test="${not empty addFailMsg}">
						<h4 class="text-center text-danger">${addFailMsg}</h4>
						<c:remove var="addFailMsg" scope="session" />
					</c:if>

					<%
					int id = Integer.parseInt(request.getParameter("id"));
					bookDAOimpl dao = new bookDAOimpl(DBconnect.getConn());
					BookDtls b = dao.getBookById(id);
					System.out.println(b);
					%>



					<div class="card-body">
						<form action="../editBook" method="post">

							<div class="form-group">
								<input value="<%=b.getId()%>" name="id" type="number"
									class="form-control" id="inputEmail4">
							</div>

							<div class="form-group ">
								<label for="inputEmail4">Book name</label> <input
									value="<%=b.getBookName()%>" name="bookName" type="text"
									class="form-control" id="inputEmail4">
							</div>
							<div class="form-group ">
								<label for="inputPassword4">Author Name</label> <input
									value="<%=b.getAuthor()%>" name="authName" type="text"
									class="form-control" id="inputPassword4">
							</div>

							<div class="form-group">
								<label for="inputAddress">Price</label> <input
									value="<%=b.getPrice()%>" name="price" type="number"
									class="form-control" id="inputAddress">
							</div>

							<div class="form-group">
								<label for="inputState">Book Categories</label> <select
									name="categories" id="inputState" class="form-control">

									<option
										<c:choose>
    <c:when test="${b.getCategories() == 'New'}">selected</c:when>
</c:choose>>
										New</option>
									<option
										<c:choose>
    <c:when test="${b.getCategories() == 'Old'}">selected</c:when>
</c:choose>>
										Old</option>






								</select>
							</div>
							<div class="form-group ">
								<label for="inputState">Book Status</label> <select
									name="status" id="inputState" class="form-control">
									<option
										<c:choose>
    <c:when test="${b.getStatus() == 'Active'}">selected</c:when>
</c:choose>>
										Active</option>

									<option
										<c:choose>
    <c:when test="${b.getStatus() == 'Inactive'}">selected</c:when>
</c:choose>>
										Inactive</option>
								</select>
							</div>
							<!--  
							<div class="form-group ">
								<label for="inputPassword4">Upload cover photo</label> <input
									name="photo" type="file" class="form-control-file"
									id="inputPassword4">
							</div>
							-->


							<button type="submit" class="btn col-md-3 offset-9 btn-primary">Update</button>
						</form>
					</div>


				</div>
			</div>
		</div>
	</div>


	<%@include file="footer.jsp"%>

</body>
</html>