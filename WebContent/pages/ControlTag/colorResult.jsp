<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Example of If and Else</title>
</head>
<body>

	<s:if test="color=='Black'">
         You have selected 'Black'. 
      </s:if>

	<s:elseif test="color=='White'">
         You have selected 'White'
      </s:elseif>

	<s:else>
         You have not selected 'Black' or 'White'.
      </s:else>
</body>
</html>