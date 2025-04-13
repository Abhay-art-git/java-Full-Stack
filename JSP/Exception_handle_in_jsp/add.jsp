<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp file</title>
</head>
<body bgcolor = "yellow" >
<% 
         int i = Integer.parseInt(request.getParameter("num1"));
		 int j = Integer.parseInt(request.getParameter("num2"));
		 
		 int k = i+j;
		 
		 out.println("output : " + k);
		 
		 
		 //we can not use try catch block 
		 // we geneally use a error.jsp page to handle exception in jsp
		 // we put the error.jsp in errorPage="error.jsp"
			 int a = 9/0;
		
		 
		
		 	 
		 %>	 
	
</body>
</html> 
