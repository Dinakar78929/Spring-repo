<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details Page</title>
</head>
<body>
	<h1>This shows Current saved Page</h1>
	<h4>
		<a href="Home.jsp">Home</a>
	</h4>

	<form action="downloadFile" method="get">

		<div>
			<label>FileName:</label> <input type="text" name="fileName">
		</div>
		<div>
			<label>ContentType:</label> <input type="text" name="contentType">
		</div>
		<div>
			<input type="submit" value="download">
		</div>
	</form>

</body>
</html>