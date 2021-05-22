<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello World</title>
</head>
<body>
	<h1>Hello World From Struts2</h1>
	<form action="colorResult">
		<label for="color">Please pick a color</label><br /> <select name="color">
			<option default value="na">Select Color</option>
			<option value="Black">Black</option>
<!-- 			<option value="Blue">Blue</option>
			<option value="Green">Green</option>
			<option value="Red">Red</option>
			<option value="Orange">Orange</option>
			<option value="Yellow">Yellow</option> -->		
			<option value="White">White</option>
		</select> <input type="submit" value="Pick" />
	</form>
</body>
</html>