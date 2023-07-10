<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
	
	
	<style type="text/css">
	footer{
	   margin-top: 200px;
	}
	
	</style>
<!-- <style type="text/css">
label {
	width: 100px;
	display: inline-block;
	margin: 4px;
}
#form {
	border-radius: 10px;
	background: aqua;
	color: black;
	width: 400px;
	padding: 20px;
	left: 50%;
	top: 50%;
	margin-left: -23%;
	position: absolute;
	margin-top: -10%;
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
			
			<a class="btn btn-primary" href="Home.jsp" >Home</a>
		</div>
	</nav>
	
<h4 class="d-flex justify-content-center" >Admin Page</h4>
	<h5 style="color: red;" class="d-flex justify-content-center">${error}</h5>

	<div id="form" class="d-flex justify-content-center">
		<form action="Login" method="get">
			<div class="form-group">
				<label>Email:</label><input type="email" name="email" class="form-control" onchange="validEmail()" id="email"><span id="emailError" style="color: red;"></span> 
			</div>
			<br>
			<div class="form-group">
				<label>Password:</label><input type="password" name="password" class="form-control" id="password" onchange="validPassword()"><span id="passwordError" style="color: red;"></span>
			</div>
			<br>
			<div class="d-flex justify-content-center">
				<input type="submit" value="login" class="btn btn-primary" >
			</div>
		</form>
	</div>

	<!-- <script type="text/javascript"></script>
	<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
	
	<div class="footer">
	<small>@2023 Copyright &copy;xworkz.com</small>
	<p><a></a></p>
	</div> -->
	<footer class="bg-light text-center text-lg-start" >
		<!-- Copyright -->
		<div class="footer fixed-bottom"
			style="background-color: black;color: white;">
			© 2023 Copyright: <a style="color: white;"
				href="https://mdbootstrap.com/">X-workz</a>
		</div>
		<!-- Copyright -->
	</footer>
</body>

<script>
 
 function validEmail(){
	 var userEmail=document.getElementById("email");
		var userEmailValue=userEmail.value;
		console.log(userEmailValue);
		if(userEmailValue!=null && userEmailValue!=""&& userEmailValue.length>3&& userEmailValue.length<50){
			document.getElementById("emailError").innerHTML="";
		}else{
			document.getElementById("emailError").innerHTML="Email length should be >3 and <50";
		}
	
 }
 
 
 function validPassword(){
	 var userPassword=document.getElementById("password");
		var userPasswordValue=userPassword.value;
		console.log(userPasswordValue);
		if(userPasswordValue!=null && userPasswordValue!=""&& userPasswordValue.length>3&& userPasswordValue.length<30){
			document.getElementById("passwordError").innerHTML="";
		}else{
			document.getElementById("passwordError").innerHTML="Password length should be >3 and <30";
		}
	
 }
</script>
</html>