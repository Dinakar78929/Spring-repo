<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Satelite Form Page</title>
</head>
<body>
	<h1>Enter Satelite Details:</h1>
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
		<input type="submit" value="Save">
	</form>

</body>
</html>