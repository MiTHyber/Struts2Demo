<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search tutorial</title>
</head>
<body>
	<!-- 	<form action="tutorials/getTutorial.action" method="post"> -->
	<!-- 		<input id="language" name="language" /> <input type="submit" /> -->
	<!-- 	</form> -->
	<!-- using struts2 tags instead of plain html -->
	<s:form action="tutorials/getTutorial">
		<s:textfield key="language" label="Enter the language u want to learn" />
		<s:submit />
	</s:form>
</body>
</html>