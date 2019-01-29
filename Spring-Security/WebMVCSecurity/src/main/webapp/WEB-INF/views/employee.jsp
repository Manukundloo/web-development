<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Get Employee Page</title>
</head>
<body>
	<h1>Employee Information</h1>
	<p>
		Employee ID:${id}<br> Employee Name:${name}<br>
	</p>
	<c:if test="${pageContext.request.userPrincipal.name != null}">
	Hi ${pageContext.request.userPrincipal.name}<br>
	
	<c:url var="logoutAction" value="/j_spring_security_logout"></c:url>
	
	<form action="${logoutAction}" method="post">
		<input type="submit" value="Logout" />
	</form>
	</c:if>
</body>
</html>