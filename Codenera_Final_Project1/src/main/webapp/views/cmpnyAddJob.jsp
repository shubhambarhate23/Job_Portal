<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="/CSS/addjob.css">
</head>
<body>
<br>
<a href="/company"><button class="button1">logout</button></a>
<%Integer id=(Integer)session.getAttribute("id"); %>

<form action="/afterAddJob" method="post">
		
		<h2>Add Job</h2>
		
		<label>Job Name</label>
		<input type="text" name="jname" placeholder="Add job Here"><br>
		
		<label>Discription</label>
		<input type="text" name="discription" placeholder="Add Discription Here"><br>
		
		<label>salary</label>
		<input type="String" name="salary" placeholder="Add salary Here"><br>
		
		<label>department</label>
		<input type="text" name="department" placeholder="Add department Here"><br>
		
		<button type="submit" class="button2">submit</button><br>
		<div id=j><a href="/cmpnyoperations">Go Back...</a></div>
</form>



</body>
</html>