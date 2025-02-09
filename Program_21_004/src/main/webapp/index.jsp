<!-- Write a jsp program to upload file into server and print current date and time -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>File Upload</title>
</head>
<body>
	<form action="upload.jsp" method="post">
		Select file:<input type="file" name="file-input"><br>
		<input type="submit" value="upload">
	</form>
</body>
</html>