<!DOCTYPE html>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<%@ page import="com.DAO.Dbconn"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Student hustle Management System</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" />
<%@ include file="globalcomps/css.jsp"%>
<link rel="stylesheet" type="text/css" href="style.css">


</head>
<body>






	<div id="container" class="container">
		<!-- 
		     </%@ include file="justuser.jsp"%>
			 -->
		<%@ include file="admin/deshboard.jsp"%>


		<div id="content"></div>
		<script type="text/javascript">
			
			
			
			
			 var content = document.getElementById("content");
                 function oadcontent() {
                	 removeSiblings('main');
                	 
                    fetch("matchentryoptions.jsp").then(response => response.text()).then(data => {
                            content.innerHTML = data;}) .catch(error => {
                                console.error("Error loading HTML content:", error);
                        });                    
                };
                
               
                </script>

	</div>



	<script src="script.js"></script>

	<div class="bottom-nav" style="">
		<ul>
			<li><button class="btn3" style=""><%@include
						file="icons/btn/addUser.jsp"%>
				</button></li>
			<li><button class="btn3" style=""><%@include
						file="icons/btn/addDeposit.jsp"%>
				</button></li>
			<li><button class="btn3">
					<%@include file="icons/btn/addFood.jsp"%>
				</button></li>
			<li><button class="btn3" style=""><%@include
						file="icons/btn/expense.jsp"%>
				</button></li>
		</ul>

	</div>





</body>
</html>



