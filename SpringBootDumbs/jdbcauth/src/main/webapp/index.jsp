<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h2>Welcome to Studytonight!</h2>
	<security:authorize access="hasRole('GUEST')">
	<h3>
		<a href="java-course">Study Java</a>
	</h3>
	</security:authorize>
	<security:authorize access="hasRole('REGISTERED')">
	<h2>
		<a href="premium-courses">Study Premium Courses</a>
	</h2>
	</security:authorize>
	<br><br>
	<form:form
		action="${pageContext.request.contextPath}/logout"
		method="post">
		<input type="submit" value="logout">
	</form:form>
</body>
</html>