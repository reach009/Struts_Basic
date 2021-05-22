<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Email Error</title>
</head>

<body>
	<p>
		There is a problem sending your email to
		<s:property value="to" />
	</p>
</body>
</html>