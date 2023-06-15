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
<script type="text/javascript">
	function forName() {
		var firstName = document.getElementById("name");
		console.log(firstName.value);
		var errFirstName = document.getElementById("errName");
		/* errFirstName.innerHTML = '' */
		if (firstName.value != '' && firstName.value.length > 3
				&& firstName.value.length < 30) {
			errFirstName.innerHTML = ''

		} else {

			errFirstName.innerHTML = "name should be >3 & <30"
			errFirstName.style.color = 'red'
		}
	}

	function forEmail() {
		var firstName = document.getElementById("email");
		console.log(firstName.value);
		var errFirstName = document.getElementById("errEmail");
		/* errFirstName.innerHTML = '' */
		if (firstName.value != '' && firstName.value.length > 7
				&& firstName.value.length < 30) {
			errFirstName.innerHTML = ''

		} else {

			errFirstName.innerHTML = "email should be >7 & <30"
			errFirstName.style.color = 'red'
		}
	}

	/* 	function forMobile() {
	 var numContact = document.getElementById("mobile");
	 console.log(numContact.value);
	 var errContact = document.getElementById("errMobile");
	 errFirstName.innerHTML = ''
	 if (numContact.value != '' && numContact.value != 0
	 && numContact.value > 3 && numContact.value < 30) {
	 errContact.innerHTML = ''

	 } else {

	 errContact.innerHTML = "please enter valid Number"
	 errContact.style.color = 'red'
	 }
	 } */

	function forComment() {
		var comment = document.getElementById("comments");
		console.log(comment.value);
		var errText = document.getElementById("errText");
		/* errFirstName.innerHTML = '' */
		if (comment.value != '' && comment.value.length > 3
				&& comment.value.length < 30) {
			errText.innerHTML = ''

		} else {

			errText.innerHTML = "name should be >3 & <80"
			errText.style.color = 'red'
		}
	}
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
			href="Home.jsp"> Home</a></span> <span><a class="nav-link">Save
				Contact</a></span>
		<!-- <span><a class="nav-link" href="CurrentSaved.jsp">Download</a></span>
		<span><a class="nav-link" href="showDetails">ViewDetails</a></span> -->

	</nav>
	<h1 class="d-flex justify-content-center" style="color: blue">Please
		enter the required details</h1>
	<div class="d-flex justify-content-center">
		<span> <c:forEach items="${errors}" var="item">
				<span style="color: red;">${item.defaultMessage} </span>
				<br>
			</c:forEach>
		</span>
	</div>
	<div class="d-flex justify-content-center">
		<h5 style="color: green">${successmsg}</h5>
	</div>

	<div id="form" class="d-flex justify-content-center">
		<form action="save" method="post" enctype="multipart/form-data">
			<div>
				<h3 class="d-flex justify-content-center">Register Form</h3>
			</div>
			<div>
				<label>Name:</label> <input type="text" onchange="forName()"
					name="fname" id="name"> <span id="errName"></span>

			</div>
			<div>
				<label>Email:</label> <input type="email" onchange="forEmail()"
					name="email" id="email"> <span id="errEmail"></span>
			</div>
			<div>
				<label>Mobile No:</label> <input type="number"
					onchange="forMobile()" name="mobile" id="mobile"> <span
					id="errMobile"></span>
			</div>
			<div>
				<label>Comments:</label>
				<textarea name="comment" onchange="forComment()" id="comments"></textarea>
				<span id="errText"></span>
			</div>
			<div>
				<label>File:</label> <input type="file" name="file">
			</div>
			<div class="d-flex justify-content-center">
				<input type="submit" value="Save"> <input type="reset"
					value="Clear">
			</div>
		</form>
	</div>
</body>
</html>