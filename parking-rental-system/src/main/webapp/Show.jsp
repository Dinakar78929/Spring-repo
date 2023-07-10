<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body class="text-center">

	<!-- <div class="cover-container d-flex h-100 p-3 mx-auto flex-column"> -->
	<header class="masthead mb-auto">
		<div class="inner">

			<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
				<span class="container-fluid"> <a class="navbar-brand"
					href="#"> <img
						src="https://img.freepik.com/premium-vector/parking-space-icon-where-you-can-park-your-car-flat-vector-illustration-isolated-white-background_124715-1477.jpg?w=2000"
						alt="Parking Logo" style="width: 60px;" class="rounded-pill">
				</a>
				</span> <span><a> <!-- <a class="nav-link active" aria-current="page"> -->
				</a></span> <span><a class="nav-link" href="Update.jsp">Update Page</a></span>
				<!-- <span><a class="nav-link" href="CurrentSaved.jsp">Download</a></span>
				<span><a class="nav-link" href="showDetails">ViewDetails</a></span> -->
			</nav>
		</div>
	</header>
	<div>
		<form action="onSearchByLocation" method="get">
			<div>
				<label>Location:</label>
				<!-- <select name="location">
					<option value="">--select option--</option>
					<option value="Rajajinagar">Rajajinagar</option>
					<option value="Marathahalli">Marathahalli</option>
					<option value="WhiteField">WhiteField</option>
					<option value="Electronic City">Electronic City</option>
				</select> -->
				<input type="text" name="location">
			</div>
			<div>
				<input type="submit" value="Search">
			</div>
		</form>
	</div>
	<h1 class="d-flex justify-content-center" style="color: red;">${msg}</h1>
	<table class="table">
		<tr>
			<th>Location</th>
			<th>VehicalType</th>
			<th>VehicalClass</th>
			<th>Terms</th>
			<th>Price</th>
			<th>Discount</th>
		</tr>

		<c:forEach items="${lists}" var="dto">
			<tr>
				<%-- <td>${dto.getId}</td> --%>
				<td>${dto.location}</td>
				<td>${dto.vehicalType}</td>
				<td>${dto.vehicalClass}</td>
				<td>${dto.terms}</td>
				<td>${dto.price}</td>
				<td>${dto.discount}</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>