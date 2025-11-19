<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First</title>
</head>
<body>
	<!-- jsp:include -->
	<h3>This is first page</h3>
	<jsp:include page="Second.jsp"/>
	<h3>End of first page</h3> <!-- The response will be come back to First.jsp -->
</body>
</html>