<%@page import="com.entity.Cart"%>
<%@page import="com.entity.Book"%>
<%@page import="java.util.List"%>
<%@page import="com.DAO.DBconn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Book:</title>
<%@include file="components/allcss.jsp"%>


</head>
<body>
	<%@include file="components/navbar.jsp"%>
	<img style="height: 250px; width: 100%" alt="benner"
		src="components/img/ben.png">





	<!-- New Book -->
	<div class="container my-2 p-3 resentbook">
		<h2 class="text-white text-center">New Books</h2>
		<div class="row justify-content-center text-center">

			<%
			HttpSession se = request.getSession();
			user u = (user) se.getAttribute("logedin");
			System.out.println("User Loged User id: " + u);
			DAOImpl dao = new DAOImpl(conn);
			List<Book> ne = dao.getNewBook();
			%>




			<%
			for (Book b : ne) {
			%>
			<div class="col-lg-3 col-md-4 col-sm-6 my-2">
				<div class="card">
					<div class="card-body">
						<img class="gcardbook" alt="book" src="books/<%=b.getFile()%>">
						<p>
							Book Name:
							<%=b.getName()%>
							<br> Author Name:<%=b.getAuthor()%>
							<br> Categories:
							<%=b.getCat()%>
						</p>
						<div class="row text-center justify-content-center">
							<c:if test="${not empty logedin  }">
								<%
								Cart c = dao.chackCartByUB(b.getBid(), u.getUid());
								if (c != null) {
								%>
								<a class="disabled btn btn-danger btn-sm m-1">Add Card</a>

								<%
								} else if (c == null) {
								%>

								<a
									href="addcartservlet?bid=<%=b.getBid()%>&uid=<%=u.getUid()%>&bname=<%=b.getName()%>&author=<%=b.getAuthor()%>&price=<%=b.getPrice()%>&address=<%=u.getAddress()%>&phone=<%=u.getPhone()%>&email=<%=b.getEmail()%>"
									class="btn btn-danger btn-sm m-1">Add Card</a>
								<%
								}
								%>
							</c:if>




							<c:if test="${empty logedin }">

								<a href="login.jsp" class=" btn btn-danger btn-sm m-1">Add
									Card</a>
							</c:if>
							<a href="viewdetails.jsp?bid=<%=b.getBid()%>"
								class="btn btn-primary btn-sm m-1">View Details</a> <a
								class="btn btn-success btn-sm m-1"><%=b.getPrice()%></a>
						</div>
					</div>
				</div>
			</div>
			<%
			}
			%>



		</div>
		<a class="self-align-center  y-2 btn btn-danger">View All</a>
	</div>








	<%@include file="components/footer.jsp"%>
</body>
</html>