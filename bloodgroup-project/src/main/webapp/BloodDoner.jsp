<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<style type="text/css">
label {
	width: 100px;
	display: inline-block;
	margin: 4px;
}

#form {
	border-radius: 10px;
	background: lightblue;
	color: black;
	width: 500px;
	padding: 20px;
}
</style>
<title>Registration Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<ul class="nav nav-tabs">
		<li class="nav-item"><a class="nav-link active"
			aria-current="page" href="StartingPage.jsp">Home</a></li>
		<li class="nav-item"><a class="nav-link">Register</a></li>
		<li class="nav-item"><a class="nav-link" href="DonerDetails.jsp">ViewDetails</a>
		</li>
	</ul>
		<h1>Please register here by filling required details</h1>
		<br> <span style="color: green">${msg}</span>
		<c:forEach items="${errors}" var="item">
			<span style="color: red;">${item.defaultMessage} </span>
			<br>
		</c:forEach>
		<div id="form">

			<form action="register" method="post" enctype="multipart/form-data">
				<div>
					<label>Doner name:</label> <input type="text" name="name"/>
				</div>
				<div>
					<label>Blood Group:</label> <select name="group">
						<option value="0">Select group</option>
						<option value="O+ve">O+ve</option>
						<option value="B+ve">B+ve</option>
						<option value="A+ve">A+ve</option>
						<option value="AB+ve">AB+ve</option>
						<option value="O-ve">O-ve</option>
						<option value="A-ve">A-ve</option>
						<option value="B-ve">B-ve</option>
						<option value="AB-ve">AB-ve</option>
					</select>
				</div>
				<div>
					<label>Weight:</label> <input type="text" name="weight"/>
				</div>
				<div>
					<label>Age:</label> <input type="text" name="age"/>
				</div>
				<div>
					<label>Contact:</label> <input type="text" name="contact"/>
				</div>
				<div>
				<label>Address:</label>
				<textarea name="address"></textarea>
		</div>
				<div>
					<label>Upload Image:</label> <input type="file" name="files"/>
				</div>
				<br>
				<div>
						<input type="submit" value="Add Details"/> <input
							type="reset" value="Clear"/>
				</div>
			</form>
		</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>