<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
body {
	background-color: CornflowerBlue;
}

.details {
	font-size: 30px;
	font-style: italic;
}

.option {
	font-size: 10px;
	font-style: italic;
}

.ans {
	color: white;
}
</style>
<meta charset="ISO-8859-1">
<title>Information page</title>
</head>
<body>
	<h1>Favorite Informations</h1>
	<h1>Company Name:${company} </h1>
	<ol class="details">
		<li>
			<div class="details">
				Favorite Food is:<u class="ans"><%=request.getAttribute("food")%></u>
			</div>
		</li>
		<li>
			<div class="details">
				Favorite Place is:<u class="ans"><%=request.getAttribute("place")%></u>
			</div>
		</li>
		<li>
			<div class="details">
				Favorite Person is:<u class="ans"><%=request.getAttribute("person")%></u>
			</div>
		</li>
		
		<li>
			<div class="details">
				Favorite color is:<u class="ans">${color}</u>
			</div>
		</li>
		
		<li>
			<div class="details">
				<label>Select Laptop:</label> <select class="details">
					<option value="0" class="option">---select laptop-----</option>
					<option class="option">${laptop1}</option>
					<option class="option">${laptop2}</option>
					<option class="option">${laptop3}</option>
					<option class="option">${laptop4}</option>
					<option class="option">${laptop5}</option>
				</select>
			</div>
		</li>
	</ol>
	<a href="NextFile.jsp">ClickNext</a>



</body>
</html>