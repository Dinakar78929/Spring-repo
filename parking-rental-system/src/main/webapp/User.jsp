<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User</title>
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
	<div class="d-flex justify-content-center">
		<h1>This is User page</h1>
	</div>
	<div class="d-flex justify-content-center">
		<h3 style="color: green">${parkingInfoSuccess}</h3>
	</div>
	<div class="d-flex justify-content-center">
		<div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">
			<form action="userSignIn" method="post" id="form">
				<div class="form-outline mb-3">
					<label class="form-label">Name:</label> <input type="text"
						class="form-control" name="name">
				</div>
				<div class="form-outline mb-3">
					<label class="form-label">Email:</label> <input type="text"
						class="form-control" name="email">
				</div>
				<div class="form-outline mb-3">
					<label class="form-label">Mobile:</label> <input type="text"
						class="form-control" name="mobile">
				</div>
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

				<div class="form-outline mb-3">
					<label class="form-label">Total:</label> <input type="number"
						placeholder="total" name="total" class="form-control">
				</div>


				<div class="d-flex justify-content-center">
					<input type="submit" value="Submit">
				</div>
			</form>
		</div>
	</div>
	<!-- <div class="d-flex justify-content-center">
		<div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">
			<form  action="userSignIn" method="post" id="form">

				<div class="form-outline mb-3">
					<label class="form-label" for="registerName">Name</label> <input
						type="text" id="registerName" class="form-control" name="name" />
				</div>

					<!-- Username input
				<div class="form-outline mb-3">
					<input type="text" id="registerUsername" class="form-control" /> <label
						class="form-label" for="registerUsername">Username</label>
				</div> 

				Email input
				<div class="form-outline mb-3">
					<label class="form-label" for="registerEmail">Email</label> <input
						type="email" id="form3Example3"
						class="form-control form-control-lg"
						placeholder="Enter a valid email address" name="email" />
				</div>
				<div class="form-outline mb-3">
					<label class="form-label" for="registerUsername">Mobile:</label> <input
						type="text" name="mobile" class="form-control">

				</div>
				<!-- Password input
					<-- <div class="form-outline mb-4">
					<input type="password" id="registerPassword" class="form-control" />
					<label class="form-label" for="registerPassword">Password</label>
				</div>

				Repeat Password input
				<div class="form-outline mb-3">
					<label class="form-label">Location </label> <select name="location"
						class="form-control">
						<option value="">--select option--</option>
						<option value="Rajajinagar">Rajajinagar</option>
						<option value="Marathahalli">Marathahalli</option>
						<option value="WhiteField">WhiteField</option>
						<option value="Electronic City">Electronic City</option>
					</select>
				</div>
				<div class="form-outline mb-4">
					<label class="form-label">Vehical Type </label> <select
						name="vehicalType" class="form-control">
						<option value="">--select option--</option>
						<option value="TWO WHEELER">TWO WHEELER</option>
						<option value="fOUR WHEELER">fOUR WHEELER</option>
						<option value="ELECTRIC">ELECTRIC</option>
					</select>
				</div>
				<div class="form-outline mb-3">
					<label class="form-label">Vehical Class</label><select
						name="vehicalClass" class="form-control">
						<option value="">--select option--</option>
						<option value="Apache">Apache</option>
						<option value="Pulser">Pulser</option>
						<option value="Skoda">Skoda</option>
						<option value="Swift">Swift</option>
					</select>
				</div>
				<div class="form-outline mb-3">
					<label class="form-label">Terms </label><select name="terms"
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
					<label class="form-label">Price </label> <input type="number"
						placeholder="Price" name="price" class="form-control">
				</div>
				<div class="form-outline mb-3">
					<label class="form-label">Discount </label> <input type="number"
						placeholder="Price" name="discount" class="form-control">
				</div>
				<div class="form-outline mb-3">
					<label class="form-label">Total </label> <input type="number"
						placeholder="Price" name="total" class="form-control">
				</div>


				Checkbox
				<div class="form-check d-flex justify-content-center mb-4">
					<input class="form-check-input me-2" type="checkbox" value=""
						id="registerCheck" checked
						aria-describedby="registerCheckHelpText" /> <label
						class="form-check-label" for="registerCheck"> I have read
						and agree to the terms </label>
				</div>

				Submit button
				<div>
					<input type="submit" value="SignIn">
				</div>

			</form>
			</div>
		</div>
	</div> -->

	<footer>
		<div
			class="d-flex flex-column flex-md-row text-center text-md-start justify-content-between py-4 px-4 px-xl-5 bg-secondary">
			<!-- Copyright -->
			<div class="text-white mb-3 mb-md-0">Copyright © 2020. All
				rights reserved.</div>
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