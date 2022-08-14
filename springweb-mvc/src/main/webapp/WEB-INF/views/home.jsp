<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body background="<c:url value="/resources/images/bg.jpg"/>"/>
<div style="text-align:center">
	<h1>Welcome to ${user} Home Page</h1>
	<p>Page served on ${d}</p>
	<a href="spring">Click here for one more View</a>
</div>	
</body>
</html>