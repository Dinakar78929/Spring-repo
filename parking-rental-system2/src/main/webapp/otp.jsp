<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>OTP page</title>
</head>
<body>
	<form action="verifyOtp" method="post">
		<div>
			<label>Enter OTP:</label> <input type="text" name="otp">

		</div>
		<div>
			<input type="submit" value="Verify">
		</div>
	</form>
</body>
</html>