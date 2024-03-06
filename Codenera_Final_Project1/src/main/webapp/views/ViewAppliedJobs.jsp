<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ViewAppliedJob</title>
<link rel="stylesheet" type="text/css" href="/CSS/Companygetjobs.css">
</head>
<body>
<h1>ViewAppliedJob</h1>
<a href="/Login"><button>logout</button></a>
<%--${i} --%>

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
			
			</tr>
			</c:forEach>
		</tbody>
</table>
<%--<a href="/goBackTOUserDashBoard/${i}">go back</a> --%>
<br>

</body>
</html>