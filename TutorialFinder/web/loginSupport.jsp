<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LoginSupport</title>
</head>
<body>
	<s:form action="loginSupport">
		<!-- 		setting data to member object fields -->
		<%-- 		<s:textfield key="user.login" label="Login" /> --%>
		<%-- 		<s:password key="user.password" label="Password" /> --%>
		<s:textfield key="login" label="Login" />
		<s:password key="password" label="Password" />
		<s:submit />
	</s:form>
</body>
</html>