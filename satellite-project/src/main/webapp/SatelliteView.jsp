<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style>
table {
	width: 300px;
	margin: auto;
	border: 2px solid black;
	border-spacing: 5px 10px;
	border-radius: 20px;
	background-color: rgba(199, 56, 58, 0.345);
	border-collapse: collapse;
}

caption {
	color: rgb(121, 10, 37);
}

th {
	text-transform: uppercase;
	text-align: center;
	border: 2px solid black;
	color: rgb(83, 43, 226);
	padding: 10px 40px;
	background-color: #dea187;
	border-radius: 2px;
}

td, tr {
	border: 2px solid black;
	padding: 2px 10px;
	border-radius: 2px;
	text-align: center;
}
</style>
<meta charset="ISO-8859-1">
<title>Satellite Page</title>
</head>
<body>
<button>
		<center>
			<a href="Welcome.jsp">Go to Welcome Page </a>
		</center>
	</button>
	<table>
		<thead>
			<th>Satellite Name</th>
			<th>Launch Date</th>
			<th>Orbit Type</th>
			<th>Mission Type</th>
			<th>Mission duration</th>
			<th>Country Name</th>
			<th>Launched</th>
			<th>Purpose</th>
			<th>Agreement</th>
		</thead>

		<br>
		<c:forEach items="${collections}" var="item">
			<tr>
				<td>${item.satelliteName}</td>
				<td>${item.launchDate}</td>
				<td>${item.orbitType}</td>
				<td>${item.missionType}</td>
				<td>${item.duration}</td>
				<td>${item.country}</td>
				<td>${item.launched}</td>
				<td>${item.purpose}</td>
				<td>${item.agreement}</td>
				<br>


			</tr>
		</c:forEach>
	</table>
</body>
</html>