<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-dark bg-dark">
		<div class="container-fluid">
		<span><a><img
					src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQxSbWEXybH5NSxDD1zRaImFMoXk2miwB2Wy5HGNNkfMw&s"
					style="width: 50px"></a> </span>
			<!-- <a class="navbar-brand" href="#">X-Workz</a> -->
			 <a style="margin-right: -700px" class="btn btn-primary"
				href="Update.jsp" role="submit">Home</a>
				<div style="color: white;  margin-right: 10px">
			Admin, ${dto.name}</div>
		</div>
	</nav>


	<form
		id="form" class="d-flex justify-content-center"
		action="search" method="get">
		<pre>
		Location<select class="form-select" name="location">
			<option>Select</option>
			<option value="Rajajinagar">Rajajinagar</option>
			<option value="BTM">BTM</option>
			<option value="Vijaynagar">Vijaynagar</option>
			<option value="Basavangudi">Basavangudi</option>
			<option value="Kormangala">Kormangala</option>
		</select> 
		<input class="btn-success" type="submit" value="Search" />
		</pre>
	</form>
	<table class="table table-success table-striped">
		<tr>
			<th>Location</th>
			<th>Vehicle Type</th>
			<th>Vehicle Classification</th>
			<th>Term</th>
			<th>Price</th>
			<th>Discount</th>
		</tr>

		<c:forEach items="${list}" var="dto">
			<tr>
				<td>${dto.location}</td>
				<td>${dto.vehicleType}</td>
				<td>${dto.vehicleClassification}</td>
				<td>${dto.term}</td>
				<td>${dto.price}</td>
				<td>${dto.discount}</td>
			</tr>
		</c:forEach>

	</table>


	<footer class="bg-light text-center text-lg-start" style="margin-top: 200px">
		<!-- Copyright -->
		<div class="footer fixed-bottom"
			style="background-color: black;color: white;">
			© 2023 Copyright: <a style="color: white;"
				href="https://mdbootstrap.com/">X-workz</a>
				<a>login : ${dto.loginTime}</a>
		</div>
		<!-- Copyright -->
	</footer>

</body>
</html>