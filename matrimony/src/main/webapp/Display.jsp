<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="FontSize.css">
</head>
<body bgcolor:lightpink>

<h1>Person Informations are:</h1>
<div class="display">1.Name: <u><%=request.getParameter("full_name")%></u>
	<br></div>
	 
	<div class="display">2. About Family Background: <u><%=request.getParameter("family_background")%></u>
	<br> </div>
	
	<div class="display">3. Gender: <u><%=request.getParameter("gender")%></u>
	<br></div>
	
	<div class="display">4. Age: <u><%=request.getParameter("age")%></u>
	<br></div>
	 
	<div class="display">5. Religion: <u><%=request.getParameter("religion")%></u>
	<br> </div>
	
	<div class="display">6. Caste: <u><%=request.getParameter("caste")%></u>
	<br> </div>
	
	<div class="display">7. Education: <u><%=request.getParameter("education")%></u>
	<br> </div>
	
	<div class="display">8. Occupation: <u><%=request.getParameter("occupation")%></u>
	<br></div>
	 
	<div class="display">9. Income: <u><%=request.getParameter("income")%></u>
	<br> </div>
	
	<div class="display">10. Height: <u><%=request.getParameter("height")%></u>
	<br> </div>
	
	<div class="display">11. Marital_status: <u><%=request.getParameter("marital_status")%></u>
	<br></div>
	 
	<div class="display">12. Ethnicity: <u><%=request.getParameter("ethnicity")%></u>
	<br> </div>

	<div class="display">13. Nationality: <u><%=request.getParameter("nationality")%></u>
	<br></div>
	 
	<div class="display">14. Language: <u><%=request.getParameter("language")%></u>
	<br> </div>
	
	<div class="display">15.Residence: <u><%=request.getParameter("residence")%></u>
	<br></div>
	
	 <div class="display">16.Family_background: <u><%=request.getParameter("family_background")%></u>
	<br> </div>
	
	<div class="display">17.Hobbies: <u><%=request.getParameter("hobbies")%></u>
	<br> </div>
	
	<div class="display">18.Interests: <u><%=request.getParameter("interests")%></u>
	<br></div>
	
	<div class="display">19.Expectations: <u><%=request.getParameter("expectations")%></u>
	<br></div>
	
	<div class="display">20.Image: <u><%=request.getParameter("image")%></u>
	<br></div>
	
	
	<div class="display">21. Smsalert: <u><%=request.getParameter("smsalert")%></u>
	<br></div>
	
	
	<div class="display">22. Emailalert: <u><%=request.getParameter("emailalert")%></u>
	<br></div>
	
	<div class="display">23. Color: <u><%=request.getParameter("color")%></u>
	<br></div>
	
	<div class="display">24. DOB: <u><%=request.getParameter("DOB")%></u>
	<br></div>
	
</body>
</html>