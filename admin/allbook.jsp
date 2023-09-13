<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<%@ page import="com.DAO.bookDAOimpl" import="com.DB.DBconnect"
	import="com.entity.BookDtls" import="java.util.List"%>
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
									<th scope="col">Id</th>
									<th scope="col">Image</th>
									<th scope="col">Book Name</th>
									<th scope="col">Author Name</th>
									<th scope="col">Price</th>
									<th scope="col">Book Categories</th>
									<th scope="col">Status</th>
									<th scope="col">Action</th>
								</tr>
							</thead>
							<tbody>
								<%
								bookDAOimpl dao = new bookDAOimpl(DBconnect.getConn());
								List<BookDtls> list = dao.getBooks();

								for (BookDtls b : list) {
								%>
								<tr>
									<th><%=b.getId()%></th>
									<td><img src="../book/<%=b.getPhoto()%>"
										style="width: 70px; height: 70px;" /></td>
									<td><%=b.getBookName()%></td>
									<td><%=b.getAuthor()%></td>
									<td><%=b.getPrice()%></td>
									<td><%=b.getBookCategories()%></td>
									<td><%=b.getStatus()%></td>
									<td><a href="editBook.jsp?id=<%=b.getId()%>"
										class="btn btn-primary btn-sm text-white">Edit</a> <a
										href="../delete?id=<%=b.getId()%>"
										class="btn btn-danger btn-sm text-white">Delete</a></td>
								</tr>

								<%
								}
								%>




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