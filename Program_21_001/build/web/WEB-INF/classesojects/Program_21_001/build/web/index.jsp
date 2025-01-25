<%-- 
    Document   : index
    Created on : 25 Jan 2025
    Author     : sudarshan
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Pascal's Triangle Pattern</title>
</head>
<body>
    <h2>Pascal's Triangle Pattern</h2>
    <%
        int rows = 5;// Number of rows for the pattern
        int space=rows;
        for (int i = 0; i < rows; i++) {
            for(int sp=1;sp<=space;sp++){
                out.print(" ");
            }
            int number = 1; // Initialize the first number in the row
            for (int j = 0; j <= i; j++) {
                out.print(number + " "); // Print the current number
                number = number * (i - j) / (j + 1); // Calculate the next number using Pascal's Triangle formula
            }
            space=space-1;
            out.println("<br>"); // Line break for the next row
        }
    %>
</body>
</html>

