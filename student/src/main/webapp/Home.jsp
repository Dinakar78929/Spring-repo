<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>This is home page</h1>
	${msg}
	<form action="move" method="get" enctype="multipart/data-form">
		<input type="file" name="file"> <br> <br> <input
			type="submit" value="Submit">
	</form>
</body>
</html>