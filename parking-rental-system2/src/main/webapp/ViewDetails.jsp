<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search page</title>
<style type="text/css">
.footer {
	position: absolute;
	bottom: 0;
	width: 100%;
}

.ff {
	text-align: center;
}
</style>
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
				</span>
				<div class="container">
					<div class="row justify-content-center">
						<h4 style="color: green">${adminInfoDTOs.name}</h4>

					</div>
				</div>
				<a class="nav-link" href="Update.jsp">Back</a>
				<div>
					<a class="nav-link" href="Admin.jsp"><button>Logout</button></a>
				</div>

			</nav>
		</div>


	</header>
	<h1>This is ViewViewDetails.jsp page</h1>
	<div>
		<form action="onSearchByLocation" method="get">
			<div>
				<label>Location:</label> <input type="text" name="location">
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

		<c:forEach items="${dtos}" var="dto">
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
	<footer class="footer">
		<div
			class="d-flex flex-column flex-md-row text-center text-md-start justify-content-between py-4 px-4 px-xl-5 bg-secondary">
			<!-- Copyright -->


			<div class="container">
				<div class="row justify-content-center">
					<div class="footer">
						<h5 class="ff">Copyright � 2020. All rights reserved.</h5>

						<h5 class="ff">Login Time:${adminInfoDTOs.loginTime}</h5>
					</div>
				</div>
			</div>




			<!-- Copyright -->

			<!-- Right -->
			<div>
				<a href="#!" class="text-white me-4"> <i
					class="fab fa-facebook-f"></i>
				</a> <a href="#!" class="text-white me-4"> <i class="fab fa-twitter"></i>
				</a> <a href="#!" class="text-white me-4"> <i class="fab fa-google"></i>
				</a> <a href="#!" class="text-white"> <i class="fab fa-linkedin-in"></i>
				</a>
			</div>
			<!-- Right -->
		</div>
	</footer>
</body>
</html>