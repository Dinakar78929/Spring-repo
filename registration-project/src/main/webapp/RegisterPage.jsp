<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
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
	<h1>This is register page</h1>

	<a href="Home.jsp">Home</a> Register

	<a href="showDetails"> All Details</a>
	<br>

	<c:forEach items="${errors}" var="item">
		<span style="color: red;">${item.defaultMessage} </span>
		<br>
	</c:forEach>

	<span style="color: green">${successmsg}</span>

	<div id="form">
		<form action="save" method="post" enctype="multipart/form-data">
			<div>
				<label>Name:</label> <input type="text" name="name">
			</div>
			<div>
				<label>Age:</label> <input type="number" name="age">
			</div>
			<div>
				<label>NativeLocation:</label> <input type="text" name="location">
			</div>
			<div>
				<label>ContactNo:</label> <input type="number" name="contact">
			</div>
			<div>
				<label>Address:</label>
				<textarea name="address"></textarea>
			</div>
			<div>
				<label>Upload File:</label> <input type="file" name="file">
			</div>
			<br>
			<div>
				<input type="submit" value="Save">
			</div>
		</form>
	</div>

</body>
</html>