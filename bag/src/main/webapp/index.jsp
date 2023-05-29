<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
	<form method="post" action="send">
	<div>
	<label>Brand:</label>
	<input type="text" name="brand">
	</div>
	<div>
	<label>Color:</label>
	<input type="text" name="color">
	</div>
	<div>
	<label>Type:</label>
	<select name="type">
	<option value="0">--select type--</option>
	<option value="running">Running</option>
	<option value="luggege">Luggege</option>
	<option value="school">school</option>
	<option value="college">College</option>
	</select>
	</div>
	
	<input type="submit" value="Submit">
	<input type="reset" value="Clear">
	</form>
	</div>
	
</body>
</html>