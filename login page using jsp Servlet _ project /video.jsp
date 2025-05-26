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
HttpSession Session = request.getSession();
if(Session.getAttribute("username")==null){
	response.sendRedirect("login.jsp");
	
	
}
%>

this is a video page
we can add video link and video format 
</body>
</html>
