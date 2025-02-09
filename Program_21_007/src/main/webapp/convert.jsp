<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.text.DecimalFormat" %>

<%! 
// Function to convert a number to words
private static final String[] units = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", 
    "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };

private static final String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

public static String convertToWords(int number) {
    if (number == 0) return "Zero";

    String words = "";
    if (number / 1000 > 0) {
        words += convertToWords(number / 1000) + " Thousand ";
        number %= 1000;
    }
    if (number / 100 > 0) {
        words += convertToWords(number / 100) + " Hundred ";
        number %= 100;
    }
    if (number > 0) {
        if (number < 20) {
            words += units[number];
        } else {
            words += tens[number / 10];
            if (number % 10 > 0) {
                words += " " + units[number % 10];
            }
        }
    }
    return words.trim();
}
%>

<%
    try {
        int num = Integer.parseInt(request.getParameter("number"));
        String words = convertToWords(num);
%>
        <h2>Number in Words: <%= words %></h2>
<%
    } catch (Exception e) {
%>
        <h3 style="color: red;">Invalid Input! Please enter a valid number.</h3>
        <a href="index.jsp">Try Again</a>
<%
    }
%>
ad>
<body>

</body>
</html>