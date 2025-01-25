<%-- 
    Document   : operator
    Created on : 25 Jan 2025, 9:11:28 pm
    Author     : sudarshan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result Page</title>
    </head>
    <body>
        <% 
            String num1str=request.getParameter("num1");
            String num2str=request.getParameter("num2");
            String operation=request.getParameter("operation");
            
            //Convert into Double
            double num1=Double.parseDouble(num1str);
            double num2=Double.parseDouble(num2str);
            double result=0;
            
            String operationName="";
            
            if(operation.equals("add")){
                result=num1+num2;
                operationName="Addition";
            }else if(operation.equals("sub")){
                result=num1-num2;
                operationName="Subtraction";
            }else if(operation.equals("mul")){
                result=num1*num2;
                operationName="Multiplication";
            }
            
        %>
        <p><strong>Operation:</strong><%= operationName%></p>
        <p><strong>First Number: </strong><%= num1%></p>
        <p><strong>Second Number: </strong><%= num2%></p>
        <p><strong>Result: </strong><%= result%></p>


    </body>
</html>
