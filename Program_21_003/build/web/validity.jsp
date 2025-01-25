<%-- 
    Document   : validity
    Created on : 25 Jan 2025, 11:23:47 pm
    Author     : sudarshan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Validation check</title>
    </head>
    <body>
        <%
            String name = request.getParameter("name");
            String dob = request.getParameter("dob");
            String email = request.getParameter("email");
            String luckyNumber = request.getParameter("lucky_number");
            String favFood = request.getParameter("fav_food");

            if (name == null || name.trim().isEmpty()) {
                out.println("<p>Name is required.</p>");
            } else if (dob == null || dob.trim().isEmpty()) {
                out.println("<p>Date of Birth is required.</p>");
            } else if (email == null || !email.matches("^[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
                out.println("<p>Valid email is required.</p>");
            } else if (luckyNumber == null || !luckyNumber.matches("\\d+")) {
                out.println("<p>Lucky number must be a valid number.</p>");
            } else if (favFood == null || favFood.trim().isEmpty()) {
                out.println("<p>Favourite food is required.</p>");
            } else {
                out.println("<p>Validation Successful! Here is your data:</p>");
                out.println("<p>Name: " + name + "</p>");
                out.println("<p>Date of Birth: " + dob + "</p>");
                out.println("<p>Email: " + email + "</p>");
                out.println("<p>Lucky Number: " + luckyNumber + "</p>");
                out.println("<p>Favourite Food: " + favFood + "</p>");
            }
        %>

    </body>
</html>
