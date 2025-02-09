<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String user=request.getParameter("username");
		String password=request.getParameter("password");
		
		String validUser="sudarshan";
		String validPass="1234";
		
		if(user.equals(validUser) && password.equals(validPass)){
			session.setAttribute("username", user);
			response.sendRedirect("welcome.jsp");
		}else{
	%>
		<h1>Invalid User Name and Password</h1>
	<%
		}
	%>
</body>
</html>