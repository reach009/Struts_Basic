<%@ page language="java" contentType="text/html; charset = ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<title>File Upload</title>
</head>

<body>
	<s:form action="resultAction" namespace="/" method="post" enctype="multipart/form-data">
		<s:file label="Select a file to upload" size="40" name="fileUpload" />
		<s:submit value="submit" name="submit" />
	</s:form>
</body>
</html>