<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
</head>
<body>
	<h1>This is the Register Page</h1>
	<h5 style="color: red">${errors}</h5>
	<h5 style="color: green">${successmsg}</h5>
	<div>
		<form action="save" method="post" enctype="multipart/form-data">
			<div>
				<label>Name:</label> <input type="text" name="fname">
			</div>
			<div>
				<label>Email:</label> <input type="email" name="email">
			</div>
			<div>
				<label>Mobile No:</label> <input type="number" name="mobile">
			</div>
			<div>
				<label>Comments:</label>
				<textarea name="comment"></textarea>
			</div>
			<div>
				<label>File:</label> <input type="file" name="file">
			</div>
			<div>
				<input type="submit" value="Save"> <input type="reset"
					value="Clear">
			</div>
		</form>
	</div>
</body>
</html>