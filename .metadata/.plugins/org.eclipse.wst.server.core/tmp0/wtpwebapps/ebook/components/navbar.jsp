<%@page import="java.sql.Connection"%>
<%@page import="com.db.Database"%>
<%@page import="com.entity.user"%>
<%@page import="com.DAO.DAOImpl"%>
<%@page import="com.DAO.DBconn"%>
<%@include file="jstl.jsp" %>


<% Connection conn =new Database().Dbconn(); %>


<div class="container-fluid bg-white  " style="min-height: 60px">
	<div class="row p-2">
		<div class="col-md-3">
			<h3 class="text-success float-left">E-Book Store</h3>
		</div>
		<div class=" col-md-5">
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form>
		</div>

		<c:if test="${not empty  logedin }">
			<div class="col-md-4  text-right">
				<a href="profile.jsp" class="btn btn-primary "><i
					class="fa-regular fa-user"></i> Profile</a>
				<button data-toggle="modal" data-target="#exampleModal"
					class="btn btn-danger ">
					<i class="fa-solid fa-right-from-bracket"></i> Logout
				</button>
			</div>
		</c:if>

		<c:if test="${empty logedin}">
			<div class="col-md-4  text-right">
				<a href="login.jsp" class="btn btn-success "><i
					class="fa-solid fa-right-to-bracket "></i> Login</a> <a
					href="register.jsp" class="btn btn-primary "><i
					class="fa-solid fa-id-card"></i> Register</a>
			</div>
		</c:if>


	</div>
</div>



<nav class="navbar navbar-expand-lg navbar-dark  sticky-top"
	style="background: #004275">
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarSupportedContent"
		aria-controls="navbarSupportedContent" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="row collapse navbar-collapse" id="navbarSupportedContent">
		<div class=" col-md-7 float-left ">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link"
					href="index.jsp"> <i class="fa-solid fa-house fa-2x"></i> Home
				</a></li>
				<li class="nav-item active"><a class="nav-link"
					href="resentbook.jsp"> <i class="fa-solid fa-book"></i>Resent
						book
				</a></li>
				<li class="nav-item  active"><a class="nav-link"
					href="newbook.jsp"> <i class="fa-solid fa-book"></i>New book
				</a></li>
				<li class="nav-item active"><a class="nav-link "
					href="oldbook.jsp"> <i class="fa-solid fa-book"></i> Old Book
				</a></li>
			</ul>
		</div>

		<div class="col-md-5 ">
			<a class=" float-right btn bg-white mx-1" href="#">Profile <i
				class="fa-regular fa-user"></i>
			</a> <a href="setting.jsp" class=" float-right btn bg-white mx-1"
				href="#"><i class="fa-solid fa-gear"></i>Setting </a>




			<c:if test="${not empty logedin }">

				<%
				DAOImpl daoNav = new DAOImpl(conn);
				user uNav = (user) session.getAttribute("logedin");
				int uidNav = uNav.getUid();
				int totalCarts = daoNav.getCartsCountByUid(uidNav);
				System.out.println("total Carts is: " + totalCarts);
				%>

				<a href="cart.jsp" class="float-right  btn bg-white mx-1"
					href="#"> <i class="fa-solid fa-cart-arrow-down"></i> <sup
					style="font-size: 15px; width: 250px"
					class="bg-danger rounded text-white"> <%=totalCarts%>
				</sup>
				</a>
			</c:if>


		</div>

	</div>
</nav>





<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1"
	aria-labelledby="exampleModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title" id="exampleModalLabel">warning !</h5>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body">Are you sure you want to logout?</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-secondary" data-dismiss="modal">No</button>
				<a href="Logout" type="button" class="btn btn-primary">Yes</a>
			</div>
		</div>
	</div>
</div>
