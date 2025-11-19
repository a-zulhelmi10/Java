<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>registerDB</title>
<%@page import="java.sql.*" %>
</head>
<body>
	<%
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaLoginPage", "root", "root");	
		}catch (Exception e){
			out.println(e);
		}
		String name = request.getParameter("name");
		String username= request.getParameter("username");
		String password = request.getParameter("password");
		
		try {
			PreparedStatement pst = con.prepareStatement("insert into users values ('"+name+"', '"+username+"', '"+password+"')");
			pst.executeUpdate();
			out.println("Registered Successfully<br>");
			out.println("Click <a href=\"login form.html\">here</a> to login");
		} catch (Exception e) {
			out.println(e);
		}
	%> 
	
</body>
</html>