<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>This is first page</h3>
	<jsp:forward page="Second2.jsp"/>
	<h3>End of first page</h3> <!-- The response will not coming back-->
</body>
</html>