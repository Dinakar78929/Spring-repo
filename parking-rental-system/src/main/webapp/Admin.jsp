<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
	width: 300px;
	padding: 20px;
	left: 60%;
	top: 50%;
	margin-left: -25%;
	position: absolute;
	margin-top: -8%;
}
</style>
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
					</a></span> <span><a class="nav-link" href="Home.jsp">Home</a></span>
				<!-- <span><a class="nav-link" href="CurrentSaved.jsp">Download</a></span>
				<span><a class="nav-link" href="showDetails">ViewDetails</a></span> -->

			</nav>
		</div>
	</header>
	<h1>This is Admin page</h1>
	<h4 style="color: red;">${errmsg}</h4>
	<h4 style="color: red;">${success}</h4>
	<div id="form">
		<form action="adminLogin" method="get">
			<div>
				<label>Admin Email:</label> <input type="email" name="email">
			</div>
			<div>
				<label>Password:</label> <input type="password" name="password">
			</div>
			<br>
			<div class="d-flex justify-content-center">
				<input type="submit" value="Login">
			</div>
		</form>
	</div>
</body>
</html>