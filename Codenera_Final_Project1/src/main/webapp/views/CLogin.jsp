<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="/CSS/form.css">
</head>
<body>

	<form action="/loginComdata" method="post">

		<table>
			<th>Company Login Form</th>
			<tr>


				<td><div id=i><a href="/Login">user</a> / <a href="/company">company</a></div></td>
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

	<a href="/companyReg">register here...</a>

	</form>

</body>
</html>