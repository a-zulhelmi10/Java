<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to Homepage</title>
<%@page import="java.sql.*" %>
</head>
<body>
	<% 
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaLoginPage", "root", "root");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
	
		try {
			PreparedStatement ps = con.prepareStatement("select * from users where username='"+username+"' and password='"+password+"'");
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				String name = rs.getString("name");
				out.println("Welcome " +name);
				out.println("<br>Go to <a href=\"/WebProj3/login.html\">homepage</a>");
			}
			else {
				out.println("Wrong username or password");
				out.println("<br>Click <a href=\"/WebProj3/login.html\">here</a> to login");
			}
		}catch (Exception e){
			out.println(e);
		} 
		
	%>
</body>
</html>