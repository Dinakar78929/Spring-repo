<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User</title>
</head>
<body>
	<h1>This is User page</h1>
	<h3>${parkingInfoSuccess}</h3>
	<form action="userSignIn" method="post">
		<div>
			<label>Name:</label> <input type="text" name="name">
		</div>
		<div>
			<label>Email:</label> <input type="text" name="email">
		</div>
		<div>
			<label>Mobile:</label> <input type="text" name="mobile">
		</div>
		<div>
			<label>Location</label> <select name="location">
				<option value="">--select option--</option>
				<option value="Rajajinagar">Rajajinagar</option>
				<option value="Marathahalli">Marathahalli</option>
				<option value="WhiteField">WhiteField</option>
				<option value="Electronic City">Electronic City</option>
			</select>
		</div>
		<div class="input-group mb-3">
			<label>Vehical Type:</label> <select name="vehicalType">
				<option value="">--select option--</option>
				<option value="TWO WHEELER">TWO WHEELER</option>
				<option value="fOUR WHEELER">fOUR WHEELER</option>
				<option value="ELECTRIC">ELECTRIC</option>
			</select>
		</div>
		<div class="input-group mb-3">
			<!-- <label>Vehical Class:</label> class="btn btn-outline-secondary
			dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false"  -->
			<label>Vehical Class</label> <select name="vehicalClass">
				<option value="">--select option--</option>
				<option value="Apache">Apache</option>
				<option value="Pulser">Pulser</option>
				<option value="Skoda">Skoda</option>
				<option value="Swift">Swift</option>
			</select>
		</div>
		<div class="input-group mb-3">
			<label class="visually-hidden" for="inlineFormInputGroupUsername">Terms:</label>
			<label class="col-form-label">Terms</label> <select name="terms">
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
			<label class="col-form-label">Price:</label> <input type="number"
				placeholder="Price" name="price">
		</div>

		<div class="input-group mb-3">
			<label class="col-form-label">Discount:</label> <input type="number"
				placeholder="discount" name="discount">
		</div>

		<div class="input-group mb-3">
			<label class="col-form-label">Total:</label> <input type="number"
				placeholder="total" name="total">
		</div>


		<div class="d-flex justify-content-center">
			<input type="submit" value="Submit">
		</div>
	</form>
</body>
</html>