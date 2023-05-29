<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="send">
		<label for="full_name">Full Name:</label>
  <input type="text" id="full_name" name="full_name"><br>
  
  <label for="email">Email:</label>
  <input type="email" id="email" name="email"><br>
  
  <label for="phone">Phone:</label>
  <input type="tel" id="phone" name="phone"><br>
  
  <label for="address">Address:</label>
  <input type="text" id="address" name="address"><br>
  
  <label for="date_of_birth">Date of Birth:</label>
  <input type="date" id="date_of_birth" name="date_of_birth"><br>
  
  <label for="gender">Gender:</label>
  <select id="gender" name="gender">
    <option value="male">Male</option>
    <option value="female">Female</option>
    <option value="other">Other</option>
  </select><br>
  
  <label for="nationality">Nationality:</label>
  <input type="text" id="nationality" name="nationality"><br>
  
  <label for="occupation">Occupation:</label>
  <input type="text" id="occupation" name="occupation"><br>
  
  <label for="education">Education:</label>
  <input type="text" id="education" name="education"><br>
  
  <label for="marital_status">Marital Status:</label>
  <select id="marital_status" name="marital_status">
    <option value="single">Single</option>
    <option value="married">Married</option>
    <option value="divorced">Divorced</option>
    <option value="widowed">Widowed</option>
    <option value="separated">Separated</option>
  </select><br>
  
  <label for="height">Height:</label>
  <input type="text" id="height" name="height"><br>
  
  <label for="weight">Weight:</label>
  <input type="number" id="weight" name="weight"><br>
  
  <label for="eye_color">Eye Color:</label>
  <input type="text" id="eye_color" name="eye_color"><br>
  
  <label for="hair_color">Hair Color:</label>
  <input type="text" id="hair_color" name="hair_color"><br>
  
  <label for="bio">Biography:</label>
  <textarea id="bio" name="bio"></textarea><br>
  
  <label for="interests">Interests:</label>
  <textarea id="interests" name="interests"></textarea><br>
  
  <label for="hobbies">Hobbies:</label>
  <textarea id="hobbies" name="hobbies"></textarea><br>
  
  <label for="languages">Languages:</label>
  <input type="text" id="languages" name="languages"><br>
  
  <label for="social_media">Social Media Profiles:</label>
  <input type="text" id="social_media" name="social_media"><br>
  
		<input type="submit" value="Submit">
	</form>
</body>
</html>