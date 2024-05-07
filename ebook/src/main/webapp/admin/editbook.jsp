<%@page import="com.db.Database"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.entity.Book"%>
<%@page import="com.DAO.DAOImpl"%>
<%@page import="com.DAO.DBconn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<%@include file="/components/adminlog.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit book</title>
<%@include file="/components/allcss.jsp"%>
</head>
<body>

	<%
	Connection conn = new Database().Dbconn();
	DAOImpl dao = new DAOImpl(conn);
	Book b = dao.getBookById(Integer.parseInt(request.getParameter("bid")));
	System.out.println(b + " This book is going to Edit !");
	%>
	<%@include file="navbar.jsp"%>
	<div class="container">
		<div class="row">
			<div class="col-md-8 offset-md-2 my-3">
				<div class="card">
					<div class="card-body">
						<h2 class="text-center ">EDIT BOOK</h2>

						<!-- Book Add msg -->
						<c:if test="${not empty bediMSG }">
						${bediMSG }
						<c:remove var="baddMSG" scope="session" />
						</c:if>


						<form action="../updatebook" method="get">
							<input value="<%=b.getBid()%>" name="bid" type="hidden"
								class="form-control">
							<div class="form-group">
								<label>Book Name:</label> <input value="<%=b.getName()%>"
									name="bookname" type="text" class="form-control">
							</div>
							<div class="form-group">
								<label>Author Name:</label> <input value="<%=b.getAuthor()%>"
									name="author" type="text" class="form-control">
							</div>
							<div class="form-group">
								<label>Price:</label> <input value="<%=b.getPrice()%>"
									name="price" type="text" class="form-control">
							</div>
							<div class="form-group">
								<label>Categories:</label> <select class="form-control"
									name="cat">
									<%
									if (b.getCat().equals("New")) {
									%>
									<option selected>New</option>
									<option>Old</option>
									<%
									}
									%>
									<%
									if (b.getCat().equals("Old")) {
									%>
									<option>New</option>
									<option selected>Old</option>
									<%
									}
									%>
								</select>
							</div>
							<div class="form-group">
								<label>Status:</label> <select class="form-control"
									name="status">
									<%
									if (b.getStatus().equals("Active")) {
									%>
									<option selected>Active</option>
									<option>Inactive</option>
									<%
									}
									%>
									<%
									if (b.getStatus().equals("Inactive")) {
									%>
									<option>Active</option>
									<option selected>Inactive</option>
									<%
									}
									%>
								</select>
							</div>

							<div class="form-group form-check">
								<input name="term" type="checkbox" class="form-check-input"
									id="exampleCheck1"> <label class="form-check-label"
									for="exampleCheck1">I agree with Terms and conditions !</label>
							</div>
							<button type="submit" class="btn btn-primary float-right">ADD
								BOOK</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<%@include file="/components/footer.jsp"%>
</body>
</html>