<%@ page language="java" contentType="text/html; charset = ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>

<html>
<head>
<title>Login Page</title>
</head>

<body>
	<form action="loginActionResult" method="post">
		User: <br /> 
		<input type="text" name="user" /> <br /> 
		Password: <br />
		<input type="password" name="password" /> <br /> 
		<input type="submit" value="Login" />
	</form>
</body>
</html>