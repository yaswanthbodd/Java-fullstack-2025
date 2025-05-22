<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success Page</title>
</head>
<body>
	Welcome <%= request.getParameter("username") %> </br>
	Click <a href="login.jsp">here</a> to login.
</body>
</html>