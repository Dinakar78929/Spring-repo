<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Matrimony Page</title>
 <link rel="stylesheet" href="matrimony.css">
</head>
<body>
<div id="regform">

	<form method="post" action="send" id="form">
	<div class="input">
	 <label for="full_name">Full Name:</label>
  <input type="text" id="full_name" name="full_name">
  </div>
  <br>
  <div class="input">
  <label for="age">Age:</label>
  <input type="number" id="age" name="age">
  </div>
  <br>
  <div>
   <label for="color">Color:</label>
    <input type="color" name="color">
  </div>
  
   <div class="input">
            <label class="textlabel" for="DOB"> DOB:</label>
            <input type="date" name="DOB" id="DOB" min="1900-01-01" max="2024-12-31">
        </div>
  
  <label for="gender">Gender:</label>
   <input type="radio"  name="gender" value="male">male
    <input type="radio"  name="gender" value="female">female
     <input type="radio"  name="gender" value="others">others


  <br>
  <div class="input">
  <label for="religion">Religion:</label>
  <input type="text" id="religion" name="religion">
  </div>
  <br>
  <div class="input">
  <label for="caste">Caste:</label>
  <input type="text" id="caste" name="caste">
  </div>
  <br>
  <div class="input">
  <label for="education">Education:</label>
  <input type="text" id="education" name="education">
  </div>
  <br>
  <div class="input">
  <label for="occupation">Occupation:</label>
  <input type="text" id="occupation" name="occupation">
  </div>
  <br>
  <div class="input">
  <label for="income">Income:</label>
  <input type="number" id="income" name="income">
  </div>
  <br>
  <div class="input">
  <label for="height">Height:</label>
  <input type="text" id="height" name="height">
  </div>
  <br>
  <div class="input">
  <label for="marital_status">Marital Status:</label>
  <select id="marital_status" name="marital_status">
  <option value="0">--Select Status---</option>
    <option value="single">Single</option>
    <option value="divorced">Divorced</option>
    <option value="widowed">Widowed</option>
    <option value="separated">Separated</option>
  </select>
  </div>
  <br>
  <div class="input">
  <label for="ethnicity">Ethnicity:</label>
  <input type="text" id="ethnicity" name="ethnicity">
  </div>
  <br>
  <div class="input">
  <label for="nationality">Nationality:</label>
  <input type="text" id="nationality" name="nationality">
  </div>
  <br>
  <div class="input">
  <label for="language">Language:</label>
  <input type="text" id="language" name="language">
  </div>
  <br>
  <div class="input">
  <label for="residence">Residence:</label>
  <input type="text" id="residence" name="residence">
  </div>
  <br>
  <div class="input">
  <label for="family_background">Family Background:</label>
  <textarea id="family_background" name="family_background"></textarea>
  </div>
  <br>
  <div class="input">
  <label for="hobbies">Hobbies:</label>
  <textarea id="hobbies" name="hobbies"></textarea>
  </div>
  <br>
  <div class="input">
  <label for="interests">Interests:</label>
  <textarea id="interests" name="interests"></textarea>
  </div>
  <br>
  <div class="input">
  <label for="expectations">Expectations:</label>
  <textarea id="expectations" name="expectations"></textarea>
  </div>
  <br>
  
        <div class="alert">
            <input type="checkbox" name="smsalert" id="smsalert">
            <label for="smsalert">SMS Alert</label>
        </div>
       
        <div class="alert">
            
            <input type="checkbox" name="emailalert" id="emailalert">
            <label for="emailalert">Email Alert</label>
        </div>
  <div class="input">
   <label for="image">Image:</label>
  <input type="file" name="image"> 
  </div>
  <br>
  <div class="btn">
  <input type="submit" value="Send" class="click">
  <input type="reset" value="Clear" class="click">
  </div>
  
  
	</form>
	</div>
</body>
</html>