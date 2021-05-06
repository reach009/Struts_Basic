<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Email Form</title>
</head>
<body>
	<em>The form below uses Google's SMTP server. So you need to enter
		a gmail username and password </em>

	<form action="emailResult" method="post">
		<label for="from">From</label><br /> <input type="text" name="from" /><br />

		<label for="password">Password</label><br /> <input type="password"
			name="password" /><br /> <label for="to">To</label><br /> <input
			type="text" name="to" /><br /> <label for="subject">Subject</label><br />
		<input type="text" name="subject" /><br /> <label for="body">Body</label><br />
		<input type="text" name="body" /><br /> <input type="submit"
			value="Send Email" />
	</form>
</body>
</html>