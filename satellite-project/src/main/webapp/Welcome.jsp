<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
label {
	width:100px;
	display: inline-block;
	margin: 4px;
}
#form{
border-radius: 10px;
background:lightblue;
color:black;
width: 500px;
padding: 4px;
} 
</style>
<meta charset="ISO-8859-1">
<title>Satelite Form Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container">
  <nav class="navbar navbar-expand-lg navbar-light bg-dark">
    <div class="container-fluid">
      <a class="navbar-brand" href="#" style="color:white;">Navbar</a>
      <a href="view">Go to view table</a>
    </div>
  </nav>
</div>
	<h1>Enter Satelite Details:</h1>
	<h4 style="color:red;">${msg}</h4>
	<c:forEach items="${errors}" var="item">
	 <span style="color:red;">${item.defaultMessage} </span>
	<br>
	</c:forEach>
	<div id="form">
	<form action="save" method="post">
	<div><label>Satellite Name:</label> 
		<input type="text"  name="satelliteName" required></div>
		<br>
		<div><label>Launch Date:</label> 
		<input type="date" name="launchDate" required></div> 
		<br> 
		<div><label for="orbit_type">Orbit Type:</label>
		 <select  name="orbitType" required>
			<option value="">Select Orbit Type</option>
			<option value="LEO">Low Earth Orbit (LEO)</option>
			<option value="GEO">Geostationary Orbit (GEO)</option>
			<option value="MEO">Medium Earth Orbit (MEO)</option>
		</select></div>
		<br> 
		<div>
		<label>Mission Type:</label>
		<select name="missionType">
		<option value="">Select Orbit Type</option>
			<option value="Flyby spacecraft">Flyby spacecraft </option>
			<option value="Orbiter spacecraft">Orbiter spacecraft</option>
			<option value="Atmospheric spacecraft">Atmospheric spacecraft</option>
			<option value="Lander spacecraft">Lander spacecraft </option>
			<option value="Penetrator spacecraft">Penetrator spacecraft </option>
			<option value="Rover spacecraft">Rover spacecraft </option>
			<option value="Observatory spacecraft ">Observatory spacecraft </option>
			<option value="Communications & Navigation spacecraf">Communications & Navigation spacecraf </option>	
		</select>
		</div>
		<div>
		<label>Mission duration:</label>
		<input type="text" name="duration" required>
		</div>
		<div>
		<label>Country Name:</label>
		<input type="text" name="country" required>
		</div>
		<div>
		<label>Launched:</label>
		<input type="radio" name="launched" value="Yes">Yes
		<input type="radio" name="launched"  value="No">No
		</div>
		<div><label>Purpose:</label>
		<textarea name="purpose"  required></textarea></div>
		<br> 
		<div>
		<label>Agreement</label>
		<input type="checkbox" name="agreement" value="agreed">
		</div>
		<center><input type="submit" value="Save" ></center> 
	</form>
	</div>

</body>
</html>