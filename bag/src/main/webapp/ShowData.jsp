<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Brand:<%=request.getParameter("brand")%>
	<br>
	Color:<%=request.getParameter("color")%>
	<br>
	Type:<%=request.getParameter("type")%>
</body>
</html>