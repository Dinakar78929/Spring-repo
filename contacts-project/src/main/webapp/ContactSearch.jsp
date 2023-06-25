<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script type="text/javascript">
	
</script>
</head>
<body>
	<h1>This is search page</h1>
	<div>
		<form action="search" method="get">
			<input placeholder="search" type="text" name="name" required
				>
			<!-- <span id="errmsg"></span> -->
			<input type="submit" value="Search">
		</form>
	</div>
	<h1 class="d-flex justify-content-center" style="color: red;">${msg}</h1>
	<table class="table">
		<tr>
			<th>Contact Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Comment</th>
			<th>Uploaded file</th>
		</tr>

		<c:forEach items="${lists}" var="dto">
			<tr>
				<%-- <td>${dto.getId}</td> --%>
				<td>${dto.fname}</td>
				<td>${dto.email}</td>
				<td>${dto.mobile}</td>
				<td>${dto.comment}</td>
				<td>${dto.fileName}</td>
				<td><a href="delete?id=${id}"></a></td>

			</tr>
		</c:forEach>
	</table>
</body>
</html>