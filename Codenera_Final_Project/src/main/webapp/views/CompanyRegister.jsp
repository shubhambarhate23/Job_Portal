<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>


</head>
<body>

	<% String message=(String)session.getAttribute("msg"); 
	
			if(message!=null)
			{
				out.println(message);
			}
			else
			{
				out.print("");
			}
	session.invalidate();
	
	%>
	

<form action="/RegisterComData" method="post">

		<table>
			<th>Registration Form for Company</th>
			<tr>


				<td><a href="/userReg">user</a>/<a href="/companyReg">company</a></td>
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

	</form>
	
	
	
	
	<a href="/Login">login here</a>
</body>
</html>