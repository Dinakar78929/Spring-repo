<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UserSignIn Page</title>
</head>
<body>

	<h4>
		<a href="UserSignUp.jsp">SignUp</a>
	</h4>

	<h4 style="color: green">${success}</h4>
	<h4 style="color: red">${failure }</h4>
	<form action="UserSignIn" method="post">
		<div>
			<label>Email:</label> <input type="email" name="email">
		</div>

		<div>
			<label>Password:</label><input type="password" name="password">
		</div>
		<div>
			<input type="submit" value="SignIn">
		</div>
	</form>
</body>
</html>