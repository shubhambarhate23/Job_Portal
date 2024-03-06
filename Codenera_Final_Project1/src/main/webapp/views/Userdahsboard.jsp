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
<a href="/Login"><button>logout</button></a>
	<%
	Integer i = (Integer) request.getAttribute("id1");
	Integer i1=(Integer)request.getAttribute("i");%>
	<%-- if(i==null && i1!=null)
	{
		i=i1;
	}
	
	if(i!=null)
	{
		out.print(i);
	}
	else
	{
		out.println();
	}
	
	
	
	--%>
	 <div>
	<ul>
  <li><a href="/apply/<%=i%>">Apply Here</a></li><br>
  <li><a href="/viewAppliedjob/<%=i%>">View Applied Job</a></li>
</ul>
</div>
	
</body>
</html>