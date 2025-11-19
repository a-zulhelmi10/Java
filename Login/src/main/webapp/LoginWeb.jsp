<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Website</title>
</head>
<body>
	<% 	
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaLoginPage","root", "root");	
			PreparedStatement ps = con.prepareStatement("select * from users where username='"+username+"' and password='"+password+"'");
			ResultSet rs = ps.executeQuery();
			if (rs.next()){
				String name = rs.getString("name");
				request.setAttribute("name", name);
				RequestDispatcher rd = request.getRequestDispatcher("Welcome.jsp");
				rd.forward(request, response);
			}else{
				out.println("Wrong username or password OR user does not exist");			}
		}catch (Exception e){
			out.println(e);
		}
	%>
	

</body>
</html>