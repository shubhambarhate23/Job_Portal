
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Apply for a job</title>
</head>
<body>

<h1>Apply for a job</h1>
${i}
<%
	
%>
${jobs}

<table border="1px solid black">
	<thead >
	
			<tr>
				<th>
					ID
				</th>
				<th>
					Jname
				</th>
				<th>Description</th>
				<th>Salary</th>
				<th>Department</th>
				<th>Apply To job</th>
			</tr>
	
	</thead>
	
		<tbody>
		<c:forEach var="data" items="${jobs}">
			<tr>
			
				<td>
					${data.id}
				</td>
				<td>${data.jname}</td>
				<td>${data.discription}</td>
				<td>${data.salary}</td>
				<td>${data.department}</td>
				<td>
				<form action="/savetoUserApplied/${i}" method="post">
				<input type="hidden" name="id" value="${data.id}">
				
				<button type="submit" style="color:blue">Apply</button>
				</form></td>
				
			
			</tr>
			</c:forEach>
		</tbody>
</table>

</body>
</html>