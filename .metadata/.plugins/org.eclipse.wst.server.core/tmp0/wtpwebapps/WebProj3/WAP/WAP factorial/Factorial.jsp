<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FactorialJSP</title>
</head>
<body>
	<%
	int n = Integer.parseInt(request.getParameter("num"));
	%>
	<%!
		int fact(int n){
			int f = 1;
			for(int i=n; i>=1;i--)
				f = f*i;
			return f;
		}
	%>

	<p style="text-align:center; color:blue;">Factorial: <%= fact(n) %></p><br>
	<p style="text-align:center; color:red;">click <a href="fact.html">here</a> to go back</p>
	
</body>
</html>