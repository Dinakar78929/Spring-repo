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
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">

		<span class="container-fluid"> <a class="navbar-brand" href="#">
				<img
				src="https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/b09f3422542809.563146973698f.jpg"
				alt="Avatar Logo" style="width: 60px;" class="rounded-pill">
		</a>

		</span> <span><a class="nav-link active" aria-current="page"
			href="Home.jsp"> Home</a></span> <span><a class="nav-link"
			href="RegisterPage.jsp">Register</a></span> <span><a class="nav-link"
			href="CurrentSaved.jsp">Download</a></span> <span><a class="nav-link">ViewDetails</a></span>
	</nav>

	<h3 class="d-flex justify-content-center" style="color: brown">Details
		of all registered Persons</h3>
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
					href="downloadFile?fileName=${dto.fileName}& contentType=${dto.contentType}">${dto.fileName}</a></td>
			</tr>
		</c:forEach>

	</table>



</body>
</html>