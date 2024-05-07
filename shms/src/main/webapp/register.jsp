<!DOCTYPE html>

<%@ page isELIgnored="false" %>

<%@ page import="com.DAO.*"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Registration Page</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f4f4f4;
	margin: 0;
	padding: 0;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

.container {
	background-color: #fff;
	border-radius: 5px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
	marging: 10px;
	width: 100%;
	max-width: 800px;
	box-sizing: border-box;
	display: flex;
	width: 100%;
	transition: 0.3s;
}

.banner {
	flex: 2;
	background-image: url("appimgs/welcomebg.png");
	background-repeat: none;
	background-position: center;
	text-align: center;
	padding: 20px;
	color: white;
	transition: 0.5s;
}

.banner-content {
	padding: 5px;
	text-align: right;
}

p {
	font-size: 18px;
	margin-bottom: 20px;
}

.banner-button {
	display: inline-block;
	padding: 10px 20px;
	background-color: #007BFF;
	color: #fff;
	text-decoration: none;
	transition: background-color 0.3s;
}

.banner-button:hover {
	background-color: #0056b3;
	transition: 0.3s;
}

.form-container {
	flex: 5;
	padding: 20px;
}

h2 {
	text-align: center;
}

form {
	display: flex;
	flex-direction: column;
}

input {
	padding: 10px;
	margin: 5px 0;
	border: 1px solid #ccc;
	border-radius: 3px;
	box-sizing: border-box;
	width: 100%;
}

input[type="submit"] {
	background-color: #007BFF;
	color: #fff;
	cursor: pointer;
}

input[type="submit"]:hover {
	background-color: #0056b3;
}

@media ( max-width : 768px) {
	.container {
		margin: 3px;
	}
	.form-container {
		flex: 4;
	}
	.banner {
		flex: 1;
	}
}
</style>
</head>
<body>
	<div class="container">
		<div class="banner">
			<div class="banner-content">
				<h1>To get services, create an account or login</h1>
				<p id="togglehelp">if you are not registered try to register!</p>
				<button onclick="toggle()" id="toggleButton" class="banner-button">Register</button>
			</div>
		</div>
		<div class="form-container">
			<h2 id="formHeader">Login Form</h2>
			<c:if test="${not empty REMSG}">
				${REMSG}
				<c:remove var="REMSG" scope="session" />
			</c:if>




			<form action="loginServlet" method="post" id="loginForm">
				<input type="email" placeholder="Email" autofocus="autofocus">
				<input type="password" placeholder="Password" autofocus="autofocus">
				<input type="submit" value="Login">
			</form>




			<form action="registerServlet" method="post" id="registrationForm"
				style="display: none;">
				<input name="mbnam" type="text" placeholder="Full Name"
					autofocus="autofocus" required="required"> 
					
					<input name="mbpho" type="text" placeholder="phone" autofocus="autofocus"
					required="required"> 
					
					<input name="mbmai" type="email"
					placeholder="Email" autofocus="autofocus">
					
					 <input
					name="mbadd" type="text" placeholder="Address"
					autofocus="autofocus"> 
					
					<input  name="mbpas" id="mbpas" type="password"
					placeholder="Password" autofocus="autofocus" required="required">
				
				<input style="color:green;" name="mbpcon" id="mbpcon" onkeyup="funColler()" type="password" placeholder="Confirm Password"
					autofocus="autofocus"> 
					
				<input type="submit"
					value="Register" >

			</form>
			<script type="text/javascript">
			
			function funColler(){
				checkMatch('mbpas', 'mbpcon');	
			}
			
			function checkMatch(fValueId, lValueId) {
				const fValue = document.getElementById(fValueId);
				const lValue = document.getElementById(lValueId);
				console.log(fValue);
				console.log(lValue);
				
				if(fValue.value === lValue.value){
					lValue.style.color ="green";
					alert('Password not match!');
				}else{
					lValue.style.color ="red";
					lValue.style.border ="red";
				}
				
			}
			
			</script>





		</div>
	</div>

	<script>
		function toggle() {
			const toggleButton = document.getElementById("toggleButton");
			const formHeader = document.getElementById("formHeader");
			const registrationForm = document.getElementById("registrationForm");
			const loginForm = document.getElementById("loginForm");
			const togglehelp = document.getElementById("togglehelp");
			if (formHeader.textContent === "Login Form") {
				formHeader.textContent = "Register Form";
				togglehelp.textContent = "If you are already registered, try to login!";
				toggleButton.textContent = "Login";
				loginForm.style.display = "none";
				registrationForm.style.display = "block";
			} else {
				formHeader.textContent = "Login Form";
				toggleButton.textContent = "Register";
				togglehelp.textContent = " If you are not registerd try to register";
				loginForm.style.display = "block";
				registrationForm.style.display = "none";
			}

		}
	</script>
	<script type="text/javascript" src="script.js"></script>
</body>
</html>
