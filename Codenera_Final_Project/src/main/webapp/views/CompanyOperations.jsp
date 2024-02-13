<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% Integer idd=(Integer)session.getAttribute("idd"); %>
 ${idd} 
 <br>
<a href="/getjbs">GetJobs</a>
<a href="/addjob">Add Job</a>

</body>
</html>