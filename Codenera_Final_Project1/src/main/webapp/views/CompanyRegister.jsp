<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>

  <link rel="stylesheet" type="text/css" href="/CSS/register.css">
</head>
<body>

	<% String message=(String)session.getAttribute("msg"); 
	
			
	session.invalidate();
	
	%>
	

<form action="/RegisterComData" method="post">

		<table>
			<th>Registration Form for Company</th>
			<div class ="m">
			<%if(message!=null)
			{
				out.println(message);
			}
			else
			{
				out.print("");
			} %>
			</div>
			<tr>
			
			


				<td><div id=i><a href="/userReg">user</a> / <a href="/companyReg">company</a></div></td>
			</tr>
			<tr>
				<td>
					<label>Name</label> <input type="text" name="name"
						placeholder="Enter Name">
				</td>
			</tr>
			<tr>
				<td>
					<label>Email</label> <input type="email" name="email"
						placeholder="Enter email">
				</td>
			</tr>
			<tr>
				<td>
					<label>Mobile</label> <input type="number" name="mobile"
						placeholder="Enter mobile">
				</td>
			</tr>
			<tr>
				<td>
					<label>Password</label> <input type="text" name="password"
						placeholder="Enter Password">
				</td>
			</tr>
			<tr>	
				<td>
					<label>Confirm Password</label> <input type="text" name="password1"
						placeholder="ReEnter Password">
				</td>
			</tr>
			<tr>
				<td>
					<button type="submit">Submit</button>
				</td>
			</tr>
		
		</table>
		<a href="/Login">login here</a>

	</form>
	
	
	
	
	
</body>
</html>