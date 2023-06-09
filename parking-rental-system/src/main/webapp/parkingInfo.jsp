<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Parking Info Page</title>
</head>
<!-- <style type="text/css">
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
	top: 43%;
	margin-left: -25%;
	position: absolute;
	margin-top: -8%;
}
</style> -->

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body class="text-center">
	<header class="masthead mb-auto">
		<div class="inner">

			<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
				<span class="container-fluid"> <a class="navbar-brand"
					href="#"> <img
						src="https://img.freepik.com/premium-vector/parking-space-icon-where-you-can-park-your-car-flat-vector-illustration-isolated-white-background_124715-1477.jpg?w=2000"
						alt="Parking Logo" style="width: 60px;" class="rounded-pill">
				</a>
				</span> <span> <!-- <a class="nav-link active" aria-current="page"> -->
					</a></span> <span><a class="nav-link" href="Admin.jsp">Logout</a></span> <span><a
					class="nav-link" href="Update.jsp">Update Page</a></span>
				<!-- <span><a class="nav-link" href="CurrentSaved.jsp">Download</a></span>
				<span><a class="nav-link" href="showDetails">ViewDetails</a></span> -->
				<%-- <div>
					<h4>${dtos.name}</h4>
				</div> --%>
			</nav>
		</div>
	</header>
	<h1 class="d-flex justify-content-center">This is Parking Info
		Page</h1>
	<h4 class="d-flex justify-content-center" style="color: green">${parkingInfoSuccess}</h4>
	<h4 class="d-flex justify-content-center" style="color: green">${parkingInfoError}</h4>
	<div class="d-flex justify-content-center">
		<div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">
			<form action="parkingInfo" method="post" id="form">
				<div class="form-outline mb-3">
					<label class="form-label">Location:</label> <select name="location"
						class="form-control">
						<option value="">--select option--</option>
						<option value="Rajajinagar">Rajajinagar</option>
						<option value="Marathahalli">Marathahalli</option>
						<option value="WhiteField">WhiteField</option>
						<option value="Electronic City">Electronic City</option>
					</select>
				</div>
				<div class="form-outline mb-3">
					<label class="form-label">Vehical Type:</label> <select
						name="vehicalType" class="form-control">
						<option value="">--select option--</option>
						<option value="TWO WHEELER">TWO WHEELER</option>
						<option value="fOUR WHEELER">fOUR WHEELER</option>
						<option value="ELECTRIC">ELECTRIC</option>
					</select>
				</div>
				<div class="form-outline mb-3">
					<label class="form-label">Vehical Class:</label> <select
						name="vehicalClass" class="form-control">
						<option value="">--select option--</option>
						<option value="Apache">Apache</option>
						<option value="Pulser">Pulser</option>
						<option value="Skoda">Skoda</option>
						<option value="Swift">Swift</option>
					</select>
				</div>
				<div class="form-outline mb-3">

					<label class="form-label">Terms:</label> <select name="terms"
						class="form-control">
						<option value="">--select option--</option>
						<option value="1 Day">1 Day</option>
						<option value="15 Days">15 Days</option>
						<option value="30 Days">30 Days</option>
						<option value="90 Days">90 Days</option>
						<option value="180 Days">180 Days</option>
						<option value="360 Days">360 Days</option>
					</select>
				</div>
				<div class="form-outline mb-3">
					<label class="form-label">Price:</label> <input type="number"
						placeholder="Price" name="price" class="form-control">
				</div>

				<div class="form-outline mb-3">
					<label class="form-label">Discount:</label> <input type="number"
						placeholder="discount" name="discount" class="form-control">
				</div>

				<div class="d-flex justify-content-center">
					<input type="submit" value="Update">
				</div>
			</form>
		</div>
	</div>
	<footer>
		<div
			class="d-flex flex-column flex-md-row text-center text-md-start justify-content-between py-4 px-4 px-xl-5 bg-primary">
			<!-- Copyright -->
			<div class="text-white mb-3 mb-md-0">Copyright � 2020. All
				rights reserved.</div>
			<!-- Copyright -->
			<%-- <a>login : ${dtos.lastLoginTime }</a> --%>
		</div>

	</footer>
</body>
</html>