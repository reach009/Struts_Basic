<%@ page language="java" contentType="text/html; charset = ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<title>File Upload</title>
</head>

<body>
	<form action="upload" method="post" enctype="multipart/form-data">
		<label for="myFile">Upload your file</label> <input type="file"
			name="myFile" /> <input type="submit" value="Upload" />
	</form>
</body>
</html>