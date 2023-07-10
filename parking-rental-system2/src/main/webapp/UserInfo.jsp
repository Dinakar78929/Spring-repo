<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Page</title>
<style type="text/css">
.footer {
	position: relative;
	bottom: 0px;
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
	<!-- <script type="text/javascript">
		function ajaxFunction() {
			var location = document.getElementById("location").value;
			var vType = document.getElementById("vehicalType").value;
			var vClass = document.getElementById("vehicalClass").value;
			var terms = document.getElementById("terms").value;

			const httpRequest = new XMLHttpRequest();
			httpRequest.open("GET",
					"http://localhost:8080/parking-rental-system2/userAjax"
							+ location + "/" + vType + "/" + vClass + "/"
							+ terms);

			httpRequest.send();
			httpRequest.onload = function() {
				console.log(this.responseText);
				const object = JSON.parse(this.responseText);
				console.log(object);
				console.log(object.price)
				console.log(object.discount)
				console.log(object.total)

				var p = document.getElementById("price").value = object.price;
				var d = document.getElementById("discount").value = object.discount;
				var t = d / 100;
				var d = p * t;
				var f = p - d;
				document.getElementById("total").value = f;
			}
		}
	</script> -->
	<!-- <div class="cover-container d-flex h-100 p-3 mx-auto flex-column"> -->
	<script>
		function findPrice() {
			var location = document.getElementById("location").value;
			var vtype = document.getElementById("vtype").value;
			var classification = document.getElementById("vclassification").value;
			var term = document.getElementById("term").value;
			const httpRequest = new XMLHttpRequest();
			httpRequest.open("GET", "http://localhost:8080/parking-rental-system2/userAjax/"
					+ location + "/" + vtype + "/" + classification + "/"
					+ term);
			httpRequest.send();
			httpRequest.onload = function() {
				console.log(this.responseText);
				const obj = JSON.parse(this.responseText);
				console.log(obj)
				console.log(obj.price)
				console.log(obj.discount)
				console.log(obj.total)
				var p = document.getElementById("price").value = obj.price;
				var d = document.getElementById("discount").value = obj.discount;
				var t = d / 100;
				var d = p * t;
				var f = p - d;
				document.getElementById("total").value = f;
			}
		}
	</script>
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
	<h1>This is UserInfo Page</h1>
	<h2 style="color: green">${success}</h2>
	<h2 style="color: red">${failure}</h2>
	<%-- <h4 style="color: green">${success}</h4>
	<h4 style="color: red">${failure}</h4>
	<h4 style="color: red">${nullMsg}</h4> --%>
	<div class="d-flex justify-content-center">
		<div class="col-md-8 col-lg-4 col-xl-4 offset-xl-1">
			<form action="userParkingLogin" method="post" id="form">
				<div class="form-outline mb-3">
					<label class="form-label">Name:</label> <input type="text"
						placeholder="name" name="name" class="form-control">
				</div>

				<div class="form-outline mb-3">
					<label class="form-label">Email:</label> <input type="text"
						placeholder="email" name="email" class="form-control">
				</div>

				<div class="form-outline mb-3">
					<label class="form-label">Mobile:</label> <input type="number"
						placeholder="mobile" name="mobile" class="form-control">
				</div>


				<div class="form-outline mb-3">
					<label class="form-label">Location:</label> <select name="location"
						class="form-control" id="location">
						<option value="">--select option--</option>
						<option value="Rajajinagar">Rajajinagar</option>
						<option value="Marathahalli">Marathahalli</option>
						<option value="WhiteField">WhiteField</option>
						<option value="Electronic City">Electronic City</option>
					</select>
				</div>
				<div class="form-outline mb-3">
					<label class="form-label">Vehical Type:</label> <select
						name="vehicalType" class="form-control" id="vtype">
						<option value="">--select option--</option>
						<option value="TWO WHEELER">TWO WHEELER</option>
						<option value="FOUR WHEELER">FOUR WHEELER</option>
						<option value="ELECTRIC">ELECTRIC</option>
					</select>
				</div>
				<div class="form-outline mb-3">
					<label class="form-label">Vehical Class:</label> <select
						name="vehicalClass" class="form-control" id="vclassification">
						<option value="">--select option--</option>
						<option value="Mahindra Thar">MAHINNDRA THAR</option>
						<option value="Tata Nexon">TATA NEXON</option>
						<option value="BMW">BMW</option>
						<option value="Swift">Swift</option>
						<option value="AUDI">AUDI</option>
						<option value="MERCIDUZ BENZ">MERCIDUZ BENZ</option>
						<option value="SKODA">SKODA</option>
						<option value="PULSER">PULSER</option>
						<option value="FZ">FZ</option>
						<option value="PLATINA">PLATINA</option>
						<option value="HONDA">HONDA</option>
						<option value="NINJA">NINJA</option>
						<option value="ACTIVA">ACTIVA</option>
						<option value="DIO">DIO</option>
						<option value="PEP-T">PEP-T</option>
						<option value="Ola">Ola</option>
						<option value="TVS iQube Electric">TVS iQube Electric</option>
						<option value="Ather 450X">Ather 450X</option>
						<option value="Ola S1 Pro">Ola S1 Pro</option>
						<option value="Bajaj Chetak">Bajaj Chetak</option>
						<option value="Tesla Model S">Tesla Model S</option>
						<option value="Nissan Leaf">Nissan Leaf</option>
						<option value="Tesla">Tesla</option>
						<option value="BMW i3">BMW i3</option>
						<option value="BMW i4">BMW i4</option>
						<option value="Egolf">Egolf</option>
					</select>
				</div>
				<div class="form-outline mb-3">

					<label class="form-label">Terms:</label> <select name="terms"
						class="form-control" id="term" onchange="findPrice()">
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
						placeholder="Price" name="price" class="form-control" id="price">
				</div>

				<div class="form-outline mb-3">
					<label class="form-label">Discount:</label> <input type="number"
						placeholder="discount" name="discount" class="form-control"
						id="discount">
				</div>

				<div class="form-outline mb-3">
					<label class="form-label">Total:</label> <input type="number"
						placeholder="total" name="total" class="form-control" id="total">
				</div>

				<div class="d-flex justify-content-center">
					<input type="submit" value="Update">
				</div>
			</form>
		</div>
	</div>
	<footer class="footer">
		<div
			class="d-flex flex-column flex-md-row text-center text-md-start justify-content-between py-4 px-4 px-xl-5 bg-secondary">
			<!-- Copyright -->


			<div class="container">
				<div class="row justify-content-center">
					<div class="footer">
						<h5 class="ff">Copyright © 2020. All rights reserved.</h5>

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