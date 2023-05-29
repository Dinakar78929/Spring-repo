<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
body {
	background-color: lightblue;
	margin: 50px 0px;
	padding: 0px;
	text-align: center;
	align: center
}

.input {
	width: 100%;
	font-size: 1.2em;
	box-shadow: 2px;
	border-radius: 8px;
	padding: 3px 3px;
	box-sizing: border-box;
	margin: 5px 0px 15px;
}

input:focus {
	background-color: aquamarine;;
}

#fm {
	border: 1px solid black;
	width: 300px;
	margin: 20px auto;
	padding: 10px 20px 30px;
	color: black;
	border-radius: 10px;
}

.btn input {
	color: brown;
}
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Favorites List</h1>
	<div id="fm">
		<form method="post" action="fav">
			<div class="inputbrder">
				<div class="input">
					<label>Fav Food:</label> <input type="text" name="favfood">
				</div>
				<div class="input">
					<label>Fav Place:</label> <input type="text" name="favplace">
				</div>
				<div class="input">
					<label>Fav Person:</label> <input type="text" name="favperson">
				</div>
				<div class="input">
					<label>Fav Color:</label> <input type="text" name="favcolor">
				</div>
			</div>
			<div class="btn">
				<input type="submit" value="Send"> <input type="reset"
					value="Clear">
			</div>
		</form>
	</div>
</body>
</html>