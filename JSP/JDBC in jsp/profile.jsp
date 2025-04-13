<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import ="java.sql.*" %>
       
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
   String url = "jdbc:mysql://localhost:3306/collage" ;
   String username = "root";
   String password = "221120107025";
   String sql = "select * from teacher where id = 9";
  Class.forName("com.mysql.jdbc.Driver");
  Connection con = DriverManager.getConnection(url , username , password);
  Statement st = con.createStatement();
  ResultSet rs = st.executeQuery(sql);
  rs.next();
  

%>
 
 id : <%= rs.getString(1) %> <br>
 name : <%= rs.getString(2) %>  <br>
 subject :<%= rs.getString(3)%>  <br>
 city : <%= rs.getString(4) %>  <br>
 
 
 
 
 
</body>
</html>
