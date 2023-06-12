<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Blood</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
<c:forEach items="${error}" var="errors">
<span style="color: red;">${errors.defaultMessage}</span><br>
</c:forEach>


<span style="color: green;">${successMsg}</span>



	<form class="row g-3" action="save" method="post" enctype="multipart/form-data" <span class="border border-5"></span>>
	<div class="p-3 mb-2 bg-dark text-white" style="text-align: center;">Blood Info!!!</div>
		<div class="col-md-6">
		
		<div><a href="Image.jsp">View Image</a></div>
		<div><a href="list">List All</a></div>
			<label for="inputEmail4" class="form-label">Name</label> <input
				type="text" class="form-control" id="name" name="name" value="${dto.name }">
		</div>
		<div class="col-md-6">
			<label for="inputPassword4" class="form-label">Age</label> <input
				type="number" class="form-control" id="age" name="age" value="${dto.age }">
		</div>
		<div class="col-md-4">
			<label for="inputState" class="form-label">BloodGroup</label> <select
				id="bloodGroup" class="form-select" name="bloodGroup">
				<option value="">Choose...</option>
				<option>A+</option>
				<option>B+</option>
				<option>O+</option>
				<option>A-</option>
				<option>B-</option>
				<option>AB+</option>
			</select>
		</div>
		<div class="col-md-6">
			<label for="inputCity" class="form-label">Weight</label> <input
				type="text" class="form-control" id="weight" name="weight" value="${dto.weight }">
		</div>
		<div class="col-12">
			<label for="inputAddress" class="form-label">Address</label>
			<textarea class="form-control" id="address" name="address" rows="3" ></textarea>
		</div>
		<div>
		Select File<input type="file" name="file">
		</div>

		<div class="col-12">
			<input type="submit" value="Save">
		</div>
		
		
	</form>

</body>
</html>