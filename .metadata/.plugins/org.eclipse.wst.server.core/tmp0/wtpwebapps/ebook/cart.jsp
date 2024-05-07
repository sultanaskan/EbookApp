
<%@page import="java.util.List"%>
<%@page import="com.DAO.DBconn"%>
<%@page import="com.entity.*"%>
<%@page import="com.DAO.DAOImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<%@include file="components/userLoged.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Your carts</title>
<%@include file="components/allcss.jsp"%>
</head>
<body>
	<%@include file="components/navbar.jsp"%>
	<%

	HttpSession se = request.getSession();
	user u = (user) se.getAttribute("logedin");
	System.out.println("Card userL" + u);
	int uid = u.getUid();
	DAOImpl dao = new DAOImpl(conn);
	List<Cart> list = dao.getCartsByU(uid);
	double total = dao.getTotalAmount(uid);
	System.out.println("Cart list is: " + list);
	System.out.println("Total amounts: " + total);
	%>





	<div class="container-fluid  bg-light text-center">
		<div class="row">

			<div class="col-lg-6 my-2 " style="mx-width: 60px;">
				<div class="card">
					<div class="card-body">
						<table class="table table-sm">
							<c:if test="${not empty cremMSG }">
		${cremMSG };
		<c:remove var="cremMSG" scope="session" />
							</c:if>
							<h1 class="text-warning">Cart Details</h1>
							<thead class="table-warning ">
								<tr>
									<th>Book Name</th>
									<th>Author</th>
									<th>Categories</th>
									<th>Price</th>
									<th>Seller</th>
									<th>Action</th>
								</tr>
							</thead>
							<tbody class="table-light">

								<%
								for (Cart c : list) {
								%>
								<tr>
									<td><%=c.getBname()%></td>
									<td><%=c.getAuthor()%></td>
									<td><%=dao.getBookById(c.getBid()).getCat()%></td>
									<td><%=c.getPrice()%></td>
									<td style="font-size: 10px"><%=c.getEmail()%></td>
									<td><a type="button" href="removecart?cid=<%=c.getCid()%>"
										class="btn-danger btn btn-sm ">Remove</a></td>

								</tr>

								<%
								}
								%>


								<tr class="table-warning">
									<td colspan="3">Total amount:</td>
									<td colspan="3"><%=total%></td>
								</tr>



							</tbody>

						</table>
					</div>
				</div>

			</div>



			<div class="col-lg-6 my-2">
				<h2 class="text-center text-success">Delivery Address</h2>

				<form action="placeOrderServelet" method="post">

					<div class="row">
						<div class="col">
							<label>Full Name: </label> <input value="<%=u.getName()%>"
								name="name" type="text" class="form-control">
						</div>

						<div class="col">
							<label>Email: </label> <input value="<%=u.getEmail()%>"
								name="email" type="email" class="form-control">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label>Phone: </label> <input value="<%=u.getPhone()%>"
								name="phone" type="text" class="form-control">
						</div>

						<div class="col">
							<label>Address: </label> <input value="<%=u.getAddress()%>"
								name="address" type="text" class="form-control">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label>City: </label> <input value="<%=u.getCity()%>"
								name="city" type="text" class="form-control">
						</div>

						<div class="col">
							<label>State: </label> <input value="<%=u.getState()%>"
								name="state" type="text" class="form-control">
						</div>
						<div class="col">
							<label>Zip: </label> <input value="<%=u.getZip()%>" name="zip"
								type="text" class="form-control">
						</div>
					</div>
					<br>
					<br>
					<a href="order?o_id=<%=3%>&c_id=<%=2%>&b_id=<%=3%>&s_id=<%=3%>" class="btn btn-primary float-right">Place
						Order Now </a>


				</form>

			</div>
		</div>
	</div>

	<%@include file="components/footer.jsp"%>
</body>
</html>