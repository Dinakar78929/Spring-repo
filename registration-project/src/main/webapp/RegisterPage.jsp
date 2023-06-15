<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<style type="text/css">
label {
	width: 100px;
	display: inline-block;
	margin: 4px;
}

#form {
	border-radius: 10px;
	background: hsl(240, 25%, 50%);
	color: black;
	width: 600px;
	padding: 20px;
	left: 50%;
	top: 50%;
	margin-left: -25%;
	position: absolute;
	margin-top: -8%;
}
</style>
<script>
	function forChar() {
		var firstName = document.getElementById("name");
		console.log(firstName.value);
		var errFirstName = document.getElementById("errName");
		/* errFirstName.innerHTML = '' */
		if (firstName.value != '' && firstName.value.length > 3
				&& firstName.value.length < 30) {
			errFirstName.innerHTML = ''

		} else {

			errFirstName.innerHTML = "please enter first name"
			errFirstName.style.color = 'red'
		}
	}

	function forNum() {
		var numAge = document.getElementById("age");
		console.log(numAge.value);
		var errAge = document.getElementById("errAge");
		/* errFirstName.innerHTML = '' */
		if (numAge.value != '' && numAge.value != 0 && numAge.value > 3
				&& numAge.value < 30) {
			errAge.innerHTML = ''

		} else {

			errAge.innerHTML = "please enter valid number"
			errAge.style.color = 'red'
		}
	}

	function forLocation() {
		var charLocation = document.getElementById("location");
		console.log(charLocation.value);
		var errLocation = document.getElementById("errLocationMsg");
		/* errFirstName.innerHTML = '' */
		if (charLocation.value != '' && charLocation.value.length > 3
				&& charLocation.value.length < 30) {
			errLocation.innerHTML = ''

		} else {

			errLocation.innerHTML = "please enter valid location"
			errLocation.style.color = 'red'
		}
	}

	function forAddress() {
		var charAddress = document.getElementById("address");
		console.log(charAddress.value);
		var errAddress = document.getElementById("errAddressMsg");
		/* errFirstName.innerHTML = '' */
		if (charAddress.value != '' && charAddress.value.length > 3
				&& charAddress.value.length < 30) {
			errAddress.innerHTML = ''

		} else {

			errAddress.innerHTML = "please enter valid address"
			errAddress.style.color = 'red'
		}
	}
	/* function forContact() {
	var numContact = document.getElementById("contact");
	console.log(numContact.value);
	var errContact = document.getElementById("errContactMsg");
	 errFirstName.innerHTML = '' 
	if (numContact.value != '' && numContact.value != 0
			&& numContact.value > 3 && numContact.value < 30) {
		errContact.innerHTML = ''

	} else {

		errContact.innerHTML = "please enter valid contact"
		errContact.style.color = 'red'
	}
	} */
</script>
</head>
<body style="background-color: lightblue;">

	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
		<span class="container-fluid"> <a class="navbar-brand" href="#">
				<img
				src="https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/b09f3422542809.563146973698f.jpg"
				alt="Avatar Logo" style="width: 60px;" class="rounded-pill">
		</a>
		</span> <span><a class="nav-link active" aria-current="page"
			href="Home.jsp"> Home</a></span> <span><a class="nav-link">Register</a></span>
		<span><a class="nav-link" href="CurrentSaved.jsp">Download</a></span>
		<span><a class="nav-link" href="showDetails">ViewDetails</a></span>

	</nav>
	<h1 class="d-flex justify-content-center" style="color: red">Please
		enter the required details</h1>


	<c:forEach items="${errors}" var="item">
		<span style="color: red;">${item.defaultMessage} </span>
		<br>
	</c:forEach>

	<span class="d-flex justify-content-center" style="color: green">${successmsg}</span>

	<div id="form" class="d-flex justify-content-center">
		<form action="save" method="post" enctype="multipart/form-data">
			<h3 class="d-flex justify-content-center">Register Form</h3>
			<div>
				<label>Name:</label> <input type="text" onchange="forChar()"
					name="name" id="name"> <span id="errName"></span>
			</div>
			<div>
				<label>Age:</label> <input type="number" onchange="forNum()"
					name="age" id="age"> <span id="errAge"></span>
			</div>
			<div>
				<label>NativeLocation:</label> <input type="text"
					onchange="forLocation()" name="location" onchange="forAddress()"
					id="location"> <span id="errLocationMsg"></span>
			</div>
			<div>
				<label>ContactNo:</label> <input type="number"
					onchange="forContact()" name="contact" id="contact"> <span
					id="errContactMsg"></span>
			</div>
			<div>
				<label>Address:</label>
				<textarea name="address" onchange="forAddress()" id="address"></textarea>
				<span id="errAddressMsg"></span>
			</div>
			<div>
				<label>Upload File:</label> <input type="file" name="file">

			</div>
			<br>
			<div class="d-flex justify-content-center">
				<input type="submit" value="Save"> <input type="reset"
					value="Clear">
			</div>
		</form>
	</div>

</body>
</html>