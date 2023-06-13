<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details Page</title>
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
	background: lightblue;
	color: black;
	width: 500px;
	padding: 20px;
}
</style>
</head>
<body>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
		<span class="container-fluid"> <a class="navbar-brand" href="#">
				<img
				src="https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/b09f3422542809.563146973698f.jpg"
				alt="Avatar Logo" style="width: 60px;" class="rounded-pill">
		</a>
		</span> <span><a class="nav-link active" aria-current="page" href="Home.jsp"> Home</a></span>
		<span><a class="nav-link" href="RegisterPage.jsp">Register</a></span>
		<span><a  class="nav-link">Download</a></span> <span><a class="nav-link"
			href="showDetails">ViewDetails</a></span>

	</nav>
	<br>
	<h3 class="d-flex justify-content-center">Enter FileName and ContentType to download</h3>
	<!-- <h4>
		<a href="Home.jsp">Home</a>
	</h4> -->
	<br>
	<div class="d-flex justify-content-center">
	<form action="downloadFile" method="get">

		<div>
			<label>FileName:</label> <input type="text" name="fileName">
		</div>
		<div>
			<label>ContentType:</label> <input type="text" name="contentType">
		</div>
		<br>
		<div class="d-flex justify-content-center">
			<input type="submit" value="download">
		</div>
	</form>
	</div>

</body>
</html>