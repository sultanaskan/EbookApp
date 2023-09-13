
<%@ page
	import="java.sql.Connection, java.sql.DriverManager, java.sql.SQLException, java.util.*, com.entity.*, com.DAO.*"%>
<%@ page isErrorPage="true"%>
<%@ page import="com.DB.DBconnect"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="icon" type="imgage/x-icon" href="/all-component/img/fav.ico">
<title>All Old Book</title>
<%@include file="all_component/allCSS.jsp"%>

</head>
<body>
	<%
	bookDAOimpl dao = new bookDAOimpl(DBconnect.getConn());
	%>

	<%@include file="all_component/navbar.jsp"%>
	<div class="container-fluid  back-img">
		<h1>Ebook Management System</h1>
	</div>





	<!-- start of  resent book section -->
	<div class="container text-center my-3">
		<h1 class="text-center text-white bg-primary">All Old Books</h1>
		<div class="row">


			<%
			List<BookDtls> list1 = dao.getAllOldBook();
			for (BookDtls b : list1) {
			%>
			<div class="col-md-3">
				<div class="card card-ho text-center p-3 my-3">
					<div class="card-body">
						<img class="text-center img-thumbnail"
							style="width: 125px; height: 150px" alt="Book Image"
							src="book/<%=b.getPhoto()%>" />
					</div>
					<p>
						<%=b.getBookName()%><br><%=b.getBookCategories()%><br><%=b.getStatus()%></
					</p>

					<%
					if (b.getBookCategories().equals("Old")) {
					%>
					<div class="bbtn">
						<a class="btn btn-sm btn-success"><i
							class="fa-solid fa-circle-info"></i> View Details</a> <a
							class="btn btn-sm btn-success"><i
							class="fa-solid fa-bangladeshi-taka-sign"></i> <%=b.getPrice()%></a>
					</div>
					<%
					} else {
					%>
					<div class="bbtn">
						<a class="btn btn-sm btn-danger"><i
							class="fa-solid fa-cart-shopping"></i> Add card</a> <a
							class="btn btn-sm btn-success"><i
							class="fa-solid fa-circle-info"></i> View Details</a> <a
							class="btn btn-sm btn-success"><i
							class="fa-solid fa-bangladeshi-taka-sign"></i> <%=b.getPrice()%></a>
					</div>
					<%
					}
					%>


				</div>
			</div>
			<%
			}
			%>



		</div>
		

	</div>

	<!-- end of resent book section -->



	<br>




	



	<%@include file="all_component/footer.jsp"%>

</body>
</html>