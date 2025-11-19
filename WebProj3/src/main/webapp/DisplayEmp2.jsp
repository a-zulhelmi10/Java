<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Displaye emp2
	<jsp:useBean class="JavaBeanDemo.Employee" <%! String id="emp";%> scope="session"/>
	<table border>
	<tr>
		<th>Employee Number</th>
		<td><jsp:getProperty property="eNo" name="emp"/>
	</tr>
	<tr>
		<th>Employee Name</th>
		<td><jsp:getProperty property="eName" name="emp"/>
	</tr>
	<tr>
		<th>Employee Salary</th>
		<td><jsp:getProperty property="salary" name=<%=id %>/>
	</tr>	
	</table>
	Click <a href="empForm.html"/>here</a> to go back
</body>
</html>