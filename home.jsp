<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Home</title>
</head>
<body class="text-center">
	<h1 class="text-center">User Home</h1>
	<c:if test="${not empty usMsg }">
	<h6>${usMsg.name}</h6>
	<h6>${usMsg.email}</h6>
	<h6>${usMsg.phone}</h6>
	
	</c:if>
	

</body>
</html>