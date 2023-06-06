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
	Name: ${satelliteName}
	<br> Launch Date: ${launchDate}
	<br> Orbit Type:${orbitType}
	<br> Mission Type: ${missionType}
	<br> Mission duration: ${duration}
	<br> Country Name: ${country}
	<br>Launched: ${launched}
	<br> Purpose: ${purpose}
	<br> Agreement: ${agreement}
	<br>
<form method="post" action="view">
<input type="submit" value="ViewDetails">
</form>
</body>
</html>