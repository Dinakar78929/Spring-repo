<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	
	
	<h1 style="color: brown;">Landing Page</h1>
	<h4 style="color: green">${model}</h4>
	
	<form method="post" action="send">
 <div class="row g-3 align-items-center">
  <div class="col-auto">
    <label for="firstName" class="col-form-label">FirstName:</label>
  </div>
  <div class="col-auto">
    <input type="text" id="userName" class="form-control" aria-describedby="firstNameHelpInline" name="firstName">
  </div>
</div>
		
		<div class="row g-3 align-items-center">
  <div class="col-auto">
    <label for="lastName" class="col-form-label">SecondName:</label>
  </div>
  <div class="col-auto">
    <input type="text" id="lastName" class="form-control" aria-describedby="lastNameHelpInline" name="lastName">
  </div>
</div>
	
		<div class="row g-3 align-items-center">
  <div class="col-auto">
    <label for="email" class="col-form-label">Email:</label>
  </div>
  <div class="col-auto">
    <input type="text" id="email" class="form-control" aria-describedby="emailHelpInline" name="email">
  </div>
</div>
		
		<div class="row g-3 align-items-center">
  <div class="col-auto">
    <label for="password" class="col-form-label">Password:</label>
  </div>
  <div class="col-auto">
    <input type="password" id="email" class="form-control" aria-describedby="passwordHelpInline" name="password">
  </div>
</div>
		
		<div class="row g-3 align-items-center">
  <div class="col-auto">
    <label for="confirmPassword" class="col-form-label">ConfirmPassword:</label>
  </div>
  <div class="col-auto">
    <input type="confirmPassword" id="email" class="form-control" aria-describedby="confirmPasswordHelpInline" name="confirmPassword">
  </div>
</div>
		<input	type="submit" value="Submit">
	</form> 
	
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</body>
</html>