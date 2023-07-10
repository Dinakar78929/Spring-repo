<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Parking info</title>
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

			<!-- <a style="margin-right: 750px" class="btn btn-warning"
				href="Update.jsp" role="submit">Home</a> -->



		
	

	<h3 style="text-align: center;">Parking Information</h3>

	<form
		id="form" class="d-flex justify-content-center"
		action="save" method="post">
		<pre>
		
Location :<select class="form-select" name="location">
		<option>Select</option>
		<option value="Rajajinagar">Rajajinagar</option>
		<option value="BTM">BTM</option>
		<option value="Vijaynagar">Vijaynagar</option>
		<option value="Basavangudi">Basavangudi</option>
		<option value="Kormangala">Kormangala</option>
		</select>
		
Vehicle-Type :<select class="form-select" name="vehicleType">
		    <option>Select</option>
			<option value="twoWheeler-electrical">Two-wheeler(Electrical)</option>
			<option value="twoWheeler-fuel">Two-wheeler(Fuel)</option>
			<option value="fourWheeler-electrical">Four-wheeler(Electrical)</option>
			<option value="fourWheeler-fuel">Four-wheeler(Fuel)</option>
		</select>
		
Vehicle Classification :<select class="form-select"
				name="vehicleClassification">
		<option>Select</option>
		<option value="Bike">Bike</option>
		<option value="Scooty">Scooty</option>
		<option value="BMW">BMW</option>
		<option value="MarutiSuzuki">MarutiSuzuki</option>
		<option value="Ford">Ford</option>
		<option value="Eretica">Eretica</option>
		<option value="Skoda">Skoda</option>
		<option value="Audi">Audi</option>
		<option value="Creta">Creta</option>
		<option value="Toyota">Toyota</option>
		<option value="Hyundai">Hyundai</option>
		</select>
				
Term :<select class="form-select" name="term">
	        <option>Select</option>
			<option value="1day">1day</option>
			<option value="1week">1week</option>
			<option value="15days">15days</option>
			<option value="1month">1month</option>
			<option value="3months">3months</option>
			<option value="HalfYear">HalfYear</option>
			<option value="1year">1year</option>
			</select>
	 		
Price :<input class="form-control" type="number" name="price" />
	  		
Discount :<input class="form-control" type="text" name="discount" />
		
		<input class="btn btn-primary" type="submit" value="Save" />
		</pre>
	</form>

	<footer class="bg-light text-center text-lg-start">
		<!-- Copyright -->
		<div class="footer fixed-bottom"
			style="background-color: black; color: white;" >
			© 2023 Copyright: <a style="color: white;"
				href="https://mdbootstrap.com/">X-workz</a>
				<a>login : ${dto.loginTime}</a>
		</div>
		<!-- Copyright -->
	</footer>

</body>
</html>