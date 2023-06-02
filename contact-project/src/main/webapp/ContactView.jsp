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
<title>ContactView Page</title>
</head>
<body>
	<button>
		<center>
			<a href="Welcome.jsp">Go to Welcome Page </a>
		</center>
	</button>
	<table>
		<thead>
			<th>Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Country</th>
			<th>Type</th>
			<th>Description</th>
		</thead>
		<!-- <thead>
		
	</thead> -->
		<br>
		<c:forEach items="${collections}" var="item">
			<tr>
				<td>${item.name}</td>
				<td>${item.email}</td>
				<td>${item.mobile}</td>
				<td>${item.country}</td>
				<td>${item.type}</td>
				<td>${item.description}</td>
				<br>


			</tr>
		</c:forEach>
	</table>



	<%-- <br>
	<c:forEach items="${collections}" var="item">
		<tr>${item.email}
			<br>
		</tr>
	</c:forEach> --%>



	<%-- <c:forEach items="${collections}" var="map">
		<tr>

			<td>${entry.name}</td>
	</c:forEach>

	</c:forEach> --%>
	<%-- ${ collections} --%>
</body>
</html>