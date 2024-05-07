<%@page import="com.db.Database"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.entity.Book"%>
<%@page import="java.util.List"%>
<%@page import="com.DAO.DBconn"%>
<%@page import="com.DAO.DAOImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/components/jstl.jsp" %>
<%@include file="/components/adminlog.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ALL BOOKS:</title>
<%@include file="/components/allcss.jsp"%>
</head>
<body>
	<%
	Connection conn = new Database().Dbconn();
	DAOImpl dao = new DAOImpl(conn);
	List<Book> list = dao.getAllBook();
	System.out.println("All Book List is: " + list);
	%>
	<%@include file="navbar.jsp"%>
	<div class="container">
		<div class="row">
			<div class="col my-3">
				<div class="card">
					<div class="card-body">
						<h2 class="text-center ">Orders </h2>

						<c:if test="${not empty bremMSG }">
						<h5 class="text-center text-warning">${bremMSG }</h5>
						<c:remove var="bremMSG" scope="session"/>
						</c:if>




						<table class="table border">
							<thead class="table-dark">
								<tr>
									<th>Id</th>
									<th colspan="2">Book</th>
									<th>Author</th>
									<th>Price</th>
									<th>Categories</th>
									<th>Status</th>
									<th>Action</th>
								</tr>
							</thead>
							<tbody class="table">

								<%
								for (Book b : list) {
								%>
								<tr>
									<td class=""><%=b.getBid()%></td>
									<td class=""><img style="width: 50px; height: 60px"
										alt="<%=b.getFile()%>" src="../books/<%=b.getFile()%>"></td>
									<td><%=b.getName()%></td>
									<td class=""><%=b.getAuthor()%></td>
									<td><%=b.getPrice()%></td>
									<td><%=b.getCat()%></td>
									<td><%=b.getStatus()%></td>
									<td><a href="editbook.jsp?bid=<%=b.getBid()%>"
										class="btn btn-primary btn-sm mx-1 ">Edit</a><a
										href="../removebook?bid=<%=b.getBid()%>"
										class="btn btn-danger btn-sm mx-1">Del</a></td>

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

	<%@include file="/components/footer.jsp"%>
</body>
</html>