<% 
	String bgColor = request.getParameter("color"); 
	if (bgColor == null | bgColor.trim().equals(""))
		bgColor="white";
%>
<body>bgcolor = <%= bgColor %></body>