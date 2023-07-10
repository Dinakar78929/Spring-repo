<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<body>
<script>
		function findPrice() {
			var location = document.getElementById("location").value;
			var vtype = document.getElementById("vtype").value;
			var classification = document.getElementById("vclassification").value;
			var term = document.getElementById("term").value;
			const httpRequest = new XMLHttpRequest();
			httpRequest.open("GET",
					"http://localhost:8080/parking/userAjax/"+location + "/" + vtype + "/" + classification + "/" + term);
			httpRequest.send();
			httpRequest.onload = function() {
				console.log(this.responseText);
				const obj=JSON.parse(this.responseText);
				console.log(obj)
				console.log(obj.price)
				console.log(obj.discount)
				console.log(obj.total)
				var p =document.getElementById("price").value=obj.price;
				var d =document.getElementById("discount").value=obj.discount;
				var t=d/100;
				var d=p*t;
				var f=p-d;
				document.getElementById("total").value=f;
			}
		}
	</script>
	
	<nav class="navbar navbar-dark bg-dark">
		<div class="container-fluid">
		<span><a><img
					src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQxSbWEXybH5NSxDD1zRaImFMoXk2miwB2Wy5HGNNkfMw&s"
					style="width: 50px"></a> </span>
			<!-- <a class="navbar-brand" href="#">X-Workz</a> -->
			<a class="btn btn-primary" href="Admin.jsp" role="button">LogOut</a>
			<%-- <p class="navbar-text" style="color: white; font-size: 17px;">Admin: ${dto.name}</p> --%>
		</div>
	</nav><br>
	<form action="userSave" method="post"  >

		<div class="form-group">
			<label for="exampleInputEmail1"></label> <input type="text"
				name="userName" class="form-control" placeholder="Enter username"
				required>
		</div>

		<!-- <div class="form-group">
			<label for="exampleInputEmail1"></label> <input type="number"
				name="parkingId" class="form-control" placeholder="Enter parkingId"
				required>
		</div> -->
		<!-- <div class="form-group">
			<label for="exampleInputPassword1"></label> <input type="number"
				name="userId" class="form-control" id="exampleInputEmail"
				placeholder="Enter userId" required>
		</div> -->

		<div class="form-group">
			<label for="exampleInputEmail1"></label> <input type="email"
				name="userEmail" class="form-control" placeholder="Enter email" required>
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1"></label> <input type="number"
				name="userMobileNo" class="form-control" id="exampleInputEmail"
				placeholder="Enter mobile number" required>
		</div>
		Location:<select name="location" id="location" ><br>
			<option value="0">Select</option>
			<br>

			
		<option value="Rajajinagar">Rajajinagar</option>
		<option value="BTM">BTM</option>
		<option value="Vijaynagar">Vijaynagar</option>
		<option value="Basavangudi">Basavangudi</option>
		<option value="Kormangala">Kormangala</option>
		</select>

		</select>

		<div class="form-group">
			Vehicle Type: <select name="vtype" class="form-control" id="vtype" required>
				<option value="">---Select---</option>
				<option value="twoWheeler-electrical">Two-wheeler(Electrical)</option>
			<option value="twoWheeler-fuel">Two-wheeler(Fuel)</option>
			<option value="fourWheeler-electrical">Four-wheeler(Electrical)</option>
			<option value="fourWheeler-fuel">Four-wheeler(Fuel)</option>
			</select>
		</div>

		<div class="form-group">
			Vehicle Classification: <select name="vclassification" id="vclassification"
				class="form-control" required>
				<option value="">---Select---</option>
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
		</div>
		Term:<select name="term" id="term"  onchange="findPrice()" ><br>
			<option value="0">Select</option>
			<br>

			<option value="1day">1day</option>
			<option value="1week">1week</option>
			<option value="15days">15days</option>
			<option value="1month">1month</option>
			<option value="3months">3months</option>
			<option value="HalfYear">HalfYear</option>
			<option value="1year">1year</option>


		</select> 
		<br>
		Price:<input type="number" name="price" id="price"> <br>

		Discount:<input type="text" name="discount" id="discount"><br>
		
		 Total Amount:<input type="number" name="totalAmount" id="total"> <br>
		 
		 <input type="submit" value="Save">

	</form>
	
	<br>
	<br>
	
	<br>
	
	

	<footer class="bg-light text-center text-lg-start">
		<!-- Copyright -->
		<div class="footer fixed-bottom"
			style="background-color: black; color: white;">
			© 2023 Copyright: <a style="color: white;"
				href="https://mdbootstrap.com/">X-workz</a> <%-- <a>login :
				${dto.loginTime}</a> --%>
		</div>
		<!-- Copyright -->
	</footer>
	
	
	

</body>
</html>