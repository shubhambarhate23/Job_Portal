<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	Integer i = (Integer) request.getAttribute("id1");
	out.print(i);
	%>
	<a href="/apply/<%=i%>">Apply
		Here</a>
	<a href="/viewAppliedjob/<%=i%>">ViewAppliedJob</a>
</body>
</html>