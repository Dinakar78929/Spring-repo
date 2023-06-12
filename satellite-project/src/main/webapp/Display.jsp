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
	Name: ${dtos.satelliteName}
	<br> Launch Date: ${dtos.launchDate}
	<br> Orbit Type:${dtos.orbitType}
	<br> Mission Type: ${dtos.missionType}
	<br> Mission duration: ${dtos.duration}
	<br> Country Name: ${dtos.country}
	<br>Launched: ${dtos.launched}
	<br> Purpose: ${dtos.purpose}
	<br> Agreement: ${dtos.agreement}
	<br>
	<form method="post" action="view">
		<input type="submit" value="ViewDetails">
	</form>
</body>
</html>