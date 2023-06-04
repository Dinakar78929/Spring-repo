<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Page</title>
</head>
<body>
	<h4 style="color: green;">${list}</h4>
	Name: ${sessionName}
	<br> Email: ${sessionEmail}
	<br> Mobile: ${sessionMobile}
	<br> Country: ${sessionCountry}
	<br> Type: ${sessionType}
	<br> Description: ${sessionDescription}
	<br>
	<form method="post" action="view">
		<input type="submit" value="ViewDetails">
	</form>


</body>
</html>