<!-- Write a jsp program to count the number of visitors on website -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.io.*, java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
    // Get application-wide visitor count from ServletContext
    Integer visitorCount = (Integer) application.getAttribute("visitorCount");

    // If it's the first visit, initialize the counter
    if (visitorCount == null) {
        visitorCount = 1;
    } else {
        visitorCount++;
    }

    // Store updated visitor count in application context
    application.setAttribute("visitorCount", visitorCount);
	%>
	<h1>Number of visitor counts:<%=visitorCount %></h1>
</body>
</html>