<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WELCOME PAGE</title>
</head>
<body>
<% 
HttpSession Session = request.getSession();
if( Session.getAttribute("username")==null){
	response.sendRedirect("login.jsp");
}

%>

 <h2>Welcome Page</h2>
    <p>
        This is a welcome page
    </p>
    
  <a href="video.jsp"> video</a>

 <form action="Logout">
        <input type="submit" value="Logout" >
    </form>

</body>
</html>
