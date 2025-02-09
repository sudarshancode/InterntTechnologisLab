<!-- Write a jsp program to validate username and password to open an authentic session  --> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="validate.jsp" method="post">
		user name:<input type="text" name="username"><br>
		password:<input type="text" name="password"><br>
		<input type="submit" value="Login">
	</form>
</body>
</html>