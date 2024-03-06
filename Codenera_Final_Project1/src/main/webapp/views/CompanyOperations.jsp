<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/CSS/DashBoard.css">
</head>
<body>
<br>
<a href="/company"><button>logout</button></a>

<% Integer idd=(Integer)session.getAttribute("idd"); %>
 
 
 
 
 <div>
<ul>
  <li><a href="/getjbs">Get Jobs</a></li><br>
  <li><a href="/addjob">Add Job</a></li><br>
  <li><a href="/jobsAppliedByUsers">View Applied Jobs by Users</a></li>
</ul>
</div>
</body>
</html>