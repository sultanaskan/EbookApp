<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Welcome to Student Hosetel manager system</title>
<%@ include file="globalcomps/css.jsp" %>
<style>


.welcome-container {
	text-align: center;
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
}



.button-link {
	text-decoration: none;
	background: #3498db;
	border: none;
	color: #fff;
	padding: 10px 20px;
	font-size: 1.2rem;
	cursor: pointer;
}
.button-link:hover {
	background: #2c7da0; /* Change the background color on hover */
}

@media ( max-width : 768px) {
	.button-link {
		display: block;
		margin-top: 20px; /* Add some spacing below the paragraph */
	}
}
</style>
</head>
<body>
	<div class="welcome-container">
		<h1>Welcome to Student hostel managment System </h1>
		<p>Manage and Track your hostel efficiently !</p>
		<a href="register.jsp" class="button-link">GET START</a> 
		 
	</div>
</body>
</html>
