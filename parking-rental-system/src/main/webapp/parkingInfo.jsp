<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Parking Info</title>
</head>
<style type="text/css">
label {
	width: 120px;
	display: inline-block;
	margin: 4px;
}

#form {
	border-radius: 10px;
	background: yellow;
	color: black;
	width: 400px;
	padding: 20px;
	left: 60%;
	top: 50%;
	margin-left: -25%;
	position: absolute;
	margin-top: -8%;
}
</style>

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
	<h1>This is Parking Info Page</h1>
	<h4>${parkingInfoSuccess}</h4>
	<h4>${parkingInfoError}</h4>
	<div>
		<form action="parkingInfo" method="post" id="form">
			<div class="input-group mb-3">
				<!-- <label>Location:</label> -->
				<label class="btn btn-outline-secondary dropdown-toggle"
					data-bs-toggle="dropdown" aria-expanded="false">Location</label> <select
					name="location">
					<option value="">--select option--</option>
					<option value="Rajajinagar">Rajajinagar</option>
					<option value="Marathahalli">Marathahalli</option>
					<option value="WhiteField">WhiteField</option>
					<option value="Electronic City">Electronic City</option>
				</select>
			</div>
			<div class="input-group mb-3">
				<!-- <label>Vehical Type:</label> -->
				<label class="btn btn-outline-secondary dropdown-toggle"
					data-bs-toggle="dropdown" aria-expanded="false">Vehical
					Type</label> <select name="vehicalType">
					<option value="">--select option--</option>
					<option value="TWO WHEELER">TWO WHEELER</option>
					<option value="fOUR WHEELER">fOUR WHEELER</option>
					<option value="ELECTRIC">ELECTRIC</option>
				</select>
			</div>
			<div class="input-group mb-3">
				<!-- <label>Vehical Class:</label>  -->
				<label class="btn btn-outline-secondary dropdown-toggle"
					data-bs-toggle="dropdown" aria-expanded="false">Vehical
					Class</label> <select name="vehicalClass">
					<option value="">--select option--</option>
					<option value="Apache">Apache</option>
					<option value="Pulser">Pulser</option>
					<option value="Skoda">Skoda</option>
					<option value="Swift">Swift</option>
				</select>
			</div>
			<div class="input-group mb-3">
				<!-- <label class="visually-hidden" for="inlineFormInputGroupUsername">Terms:</label> -->
				<label class="btn btn-outline-secondary dropdown-toggle"
					data-bs-toggle="dropdown" aria-expanded="false">Terms</label> <select
					name="terms">
					<option value="">--select option--</option>
					<option value="1 Day">1 Day</option>
					<option value="15 Days">15 Days</option>
					<option value="30 Days">30 Days</option>
					<option value="90 Days">90 Days</option>
					<option value="180 Days">180 Days</option>
					<option value="360 Days">360 Days</option>
				</select>
			</div>
			<div class="input-group mb-3">
				<input type="number" placeholder="Price" name="price">
			</div>

			<div class="input-group mb-3">
				<!-- <label class="col-form-label">Discount:</label> -->
				<input type="number" placeholder="discount" name="discount">
			</div>

			<div>
				<input type="submit" value="Update">
			</div>
		</form>
	</div>
</body>
</html>