<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AdminUpdate Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<header class="masthead mb-auto">
		<div class="inner">

			<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
				<span class="container-fluid"> <a class="navbar-brand"
					href="#"> <img
						src="https://img.freepik.com/premium-vector/parking-space-icon-where-you-can-park-your-car-flat-vector-illustration-isolated-white-background_124715-1477.jpg?w=2000"
						alt="Parking Logo" style="width: 60px;" class="rounded-pill">
				</a>
				</span> <span> <!-- <a class="nav-link active" aria-current="page"> -->
					</a></span> <span><a class="nav-link" href="Admin.jsp">Logout</a></span>
				<!-- <span><a class="nav-link" href="CurrentSaved.jsp">Download</a></span>
				<span><a class="nav-link" href="showDetails">ViewDetails</a></span> -->

			</nav>
		</div>
	</header>
	<h1>this is update page</h1>
	<form class="row row-cols-lg-auto g-3 align-items-center">
	<div class="col-12">
		<label class="visually-hidden" for="inlineFormInputGroupUsername">Username</label>
		<div class="input-group">
			<div class="input-group-text">@</div>
			<input type="text" class="form-control"
				id="inlineFormInputGroupUsername" placeholder="Username">
		</div>
	</div>
	<div class="input-group mb-3">
  <button class="btn btn-outline-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">Dropdown</button>
  <ul class="dropdown-menu">
    <li><a class="dropdown-item" href="#">Action</a></li>
    <li><a class="dropdown-item" href="#">Another action</a></li>
    <li><a class="dropdown-item" href="#">Something else here</a></li>
    <li><hr class="dropdown-divider"></li>
    <li><a class="dropdown-item" href="#">Separated link</a></li>
  </ul>
  <input type="text" class="form-control" aria-label="Text input with dropdown button">
</div>
</form>
	<button>
		<a href="parkingInfo.jsp">ParkingInfo</a>
	</button>
</body>
</html>