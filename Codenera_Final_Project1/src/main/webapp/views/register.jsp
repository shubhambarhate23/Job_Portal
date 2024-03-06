<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration for User</title>
 <link rel="stylesheet" type="text/css" href="/CSS/register.css">
</head>
<body>
<% String message=(String)session.getAttribute("msg"); 
	
			
	session.invalidate();
	
	%>
	<form action="/RegisterData" method="post" >

		<table>
			<th>Registration Form for User</th>
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
				<td><label>Name</label> <input type="text" name="name"
					placeholder="Enter Name"></td>
			</tr>
			<tr>
				<td><label>Email</label> <input type="Email" name="email"
					placeholder="Enter Email"></td>
			</tr>
			<tr>
				<td><label>Mobile</label> <input type="number" name="mobile"
					placeholder="Enter Mobile"></td>
			</tr>
			<tr>
				<td><label>Password</label> <input type="password" name="password"
					placeholder="Enter Password"></td>
			</tr>
			<tr>
				<td><label>ReEnter Password</label> <input type="password" name="password1"
					placeholder="Enter password"></td>
			</tr>
			<tr>
				<td>
					<button type="submit">Submit</button>
				</td>
			</tr>

		</table>

		<a href="/Login">Login Here...</a>

	</form>
	
</body>
</html>