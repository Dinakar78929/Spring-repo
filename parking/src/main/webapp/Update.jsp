<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
	
	<!-- <style type="text/css">
	
	   footer {
    position: fixed;
    height: 100px;
    bottom: 0;
    width: 100%;
	}
</style> -->
</head>
<body>
<nav class="navbar navbar-dark bg-dark">
		<div class="container-fluid">
		<span><a><img
					src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQxSbWEXybH5NSxDD1zRaImFMoXk2miwB2Wy5HGNNkfMw&s"
					style="width: 50px"></a> </span>
			<!-- <a class="navbar-brand" href="#">X-Workz</a> -->
			<a class="btn btn-primary" href="Admin.jsp" role="button">LogOut</a>
			<p class="navbar-text" style="color: white; font-size: 17px;">Admin: ${dto.name}</p>
		</div>
	</nav><br>
	
	
<!-- <h1>Update Page</h1> -->

<a class="btn btn-secondary" href="AdminParkingInfo.jsp" role="button">Parking
		Info</a>

	<a class="btn btn-secondary" href="AdminDataSearch.jsp" role="button">Search
		By Location</a>

<footer class="bg-light text-center text-lg-start">
		<!-- Copyright -->
		<div class="footer fixed-bottom"
			style="background-color: black;color: white;">
			© 2023 Copyright: <a style="color: white;"
				href="https://mdbootstrap.com/">X-workz</a>
				<a>login : ${dto.loginTime}</a>
		</div>
		<!-- Copyright -->
	</footer>
</body>
</html>