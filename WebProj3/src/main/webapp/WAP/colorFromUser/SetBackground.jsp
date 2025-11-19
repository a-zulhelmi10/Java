<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<% 
	String bgColor = request.getParameter("color"); 
	if (bgColor == null | bgColor.trim().equals(""))
		bgColor="white";
%>
</head>
<body bgcolor = <%= bgColor %>>
	Background color <%= bgColor %><br>
	<p style="color:white;">
	click <a href="SetBackground.html" style="color:white;">here</a> to go back
	</p>
</body>
</html>