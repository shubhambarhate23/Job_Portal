<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h4>${msg}</h4> 
	
	<form action="/logindata" method="post">

		<table>
			<th>Login Form</th>
			<tr>


				<td><a href="/Login">user</a>/<a href="/company">company</a></td>
			</tr>
			<tr>
				<td><label>Email</label> <input type="email" name="email"
					placeholder="Enter email"></td>
			</tr>
			<tr>
				<td><label>Password</label> <input type="password"
					name="password" placeholder="Enter password"></td>
			</tr>
			<tr>
				<td>
					<button type="submit">Submit</button>
				</td>
			</tr>

		</table>



	</form>
</body>
</html>