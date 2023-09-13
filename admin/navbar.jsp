<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<div class="container-fluid p-2 mt-2">
	<div class="row">
		<div class="col-md-4">
			<h1>E-BOOK</h1>
		</div>
		<div class="col-md-4">
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search" aria-label="Search">
				<button class="btn btn-success my-2 my-sm-0" type="submit">Search</button>
			</form>
		</div>
		<div class="col-md-4">
			<c:if test="${not empty userobj }">
				<a href="register.jsp" class="btn btn-primary"><i
					class="fa-solid fa-user"></i> ${userobj.name }</a>
				<a data-toggle="modal" data-target="#exampleModal"
					class="btn btn-danger"><i
					class="fa-solid fa-right-from-bracket"></i> Logout</a>
			</c:if>
			<c:if test="${empty userobj }">
				<a href="../login.jsp" class="btn btn-success"><i
					class="fa-solid fa-right-to-bracket"></i> Login</a>
				<a href="../register.jsp" class="btn btn-primary"><i
					class="fa-regular fa-address-card"></i>Register</a>
			</c:if>
		</div>
	</div>
</div>














<nav class="navbar navbar-expand-md navbar-dark bg-custom sticky-top">

	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarSupportedContent"
		aria-controls="navbarSupportedContent" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="collapse navbar-collapse" id="navbarSupportedContent">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item border rounded mx-1 active"><a
				class="nav-link " href="home.jsp"><i class="fa-solid fa-house"></i>
					Home</a></li>

		</ul>




	</div>
</nav>


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



