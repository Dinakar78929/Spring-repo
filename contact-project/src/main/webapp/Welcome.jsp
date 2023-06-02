<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome page</title>
</head>
<body>
	<h1>Welcome Page</h1>
	<form method="post" action="send">
		<div class="input">
			<label>Name<span style="color: brown">*</span>:
			</label> <input type="text" name="name" required>
			
		</div>
		<br>
		<div class="input">
		<label>Email<span style="color: brown">*</span>:</label>
			      <input type="text" name="email" required>
			<br>
		</div>
		<br>
		<div class="input">
		<label>Mobile<span style="color: brown">*</span>:</label>
			<input type="text" name="mobile" required>
		</div>
		<br>
		<div class="input">
			<label>Country<span style="color: brown">*</span>:</label>
			<select name="country" required>
				<option value="0">---Select Country---</option>
				<option value=india>India</option>
				<option value="paksitan">Pakistan</option>
				<option value="america">America</option>
				<option value="russia">Russia</option>
				<option value="england">England</option>
			</select>
		</div>
		<br>
		<div class="input">
			<label>Type<span style="color: brown">*</span>:</label>
			<select name="type" required>
				<option value="0">---Select Country</option>
				<option value="family">Family</option>
				<option value="friend">Friend</option>
				<option value="collegue">Colleague</option>
			</select>
		</div>
		<br>
		<div class="input">
			<label>Description<span style="color: brown">*</span>:</label>
			<textarea name="description" placeholder="tell us about yourself" required></textarea>
		</div>
		<br>
		<input type="submit" value="Save"> <input type="reset"
			value="Clear">
	</form>



	<!-- <style>
.input{
	text-align: center;
} -->
</style>
</body>
</html>