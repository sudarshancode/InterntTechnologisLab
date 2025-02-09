<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.io.*, java.util.* , java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//Get the uploaded file
		Part filePart=request.getPart("file-input");
		String fileName=filePart.getSubmittedFileName();
		
		//Difine Upload path
		String uploadPath=application.getRealPath("/home/sudarshan/Downloads/")+"uploads";
		File fileUpload=new File(uploadPath);
		if (!fileUpload.exists()) fileUpload.mkdir();
		
		//Save File
		File file=new File(uploadPath,fileName);
		
		try (InputStream fileContent = filePart.getInputStream();
		         FileOutputStream fos = new FileOutputStream(file)) {
		        byte[] buffer = new byte[1024];
		        int bytesRead;
		        while ((bytesRead = fileContent.read(buffer)) != -1) {
		            fos.write(buffer, 0, bytesRead);
		        }
		        out.println("<h3>File uploaded successfully: " + fileName + "</h3>");
		    } catch (Exception e) {
		        out.println("<h3>Error: " + e.getMessage() + "</h3>");
		    }
		
	%>
</body>
</html>