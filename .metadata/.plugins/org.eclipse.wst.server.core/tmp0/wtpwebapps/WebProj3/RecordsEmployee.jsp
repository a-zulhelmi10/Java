<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>  
<head>
<meta charset="UTF-8">
<title>Records Employee</title>
</head>
<body>
	<jsp:useBean class="JavaBeanDemo.Employee" id="emp" scope="session"/>
	<jsp:setProperty name="emp" property="*"/> <!-- the emp must refer to id in jsp:useBean tag -->
	<a href="DisplayEmp.jsp" />Display Emp</a>
</body>
</html>