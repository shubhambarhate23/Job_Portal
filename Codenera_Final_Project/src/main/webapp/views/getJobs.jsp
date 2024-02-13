<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- <button type="submit">Log Out</button> -->
<h1>Welcome to Your Posted Jobs</h1>
<%Integer id1=(Integer)session.getAttribute("id1");

Object l=request.getAttribute("loj");

%>

<table border="1px solid black">
	<thead>
		<tr>
			<th>ID</th>
			<th>Job</th>
			<th>Discription</th>
			<th>Salary</th>
			<th>Department</th>
		</tr>	
	</thead>
	<tbody>
	<c:forEach var="data" items="${loj}">
		<tr>
		
			<td>${data.id}</td>
			<td>${data.jname}</td>
			<td>${data.discription}</td>
			<td>${data.salary}</td>
			<td>${data.department}</td>
			
		</tr>
	</c:forEach>
		
	</tbody>
</table>







</body>
</html>