<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSPParam1</title>
</head>
<body>
	<jsp:forward page="jspParam2.jsp"><jsp:param name="empName" value="psg"/></jsp:forward>
</body>
</html>