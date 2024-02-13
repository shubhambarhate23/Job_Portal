<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration fro User</title>
</head>
<body>
	<form action="/RegisterData" method="post" >

		<table>
			<th>Registration Form for User</th>
			<tr>


				<td><a href="/userReg">user</a>/<a href="/companyReg">company</a></td>
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



	</form>
	<a href="/Login">Login</a>
</body>
</html>