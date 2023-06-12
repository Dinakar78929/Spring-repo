<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Detailed table page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<h1>This is the Table to show all details</h1>
	<h4>
		<a href="Home.jsp">Home</a>
	</h4>
	<table class="table">
		<tr>
			<th>Name</th>
			<th>Age</th>
			<th>Location</th>
			<th>Contact</th>
			<th>Address</th>
			<th>fileName</th>
		</tr>

		<c:forEach items="${dtos}" var="dto">
			<tr>
				<td>${dto.name}</td>
				<td>${dto.age}</td>
				<td>${dto.location}</td>
				<td>${dto.contact}</td>
				<td>${dto.address}</td>
				<td><a target="_blank"
					href="fileDownload?fileName=${dto.fileName}& contentType=${dto.contentType}">${dto.fileName}</a></td>
			</tr>
		</c:forEach>

	</table>



</body>
</html>