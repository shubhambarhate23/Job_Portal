<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>viewAppliedJobsForCompany</title>
<link rel="stylesheet" type="text/css" href="/CSS/Companygetjobs.css">
</head>
<body>

<a href="/company"><button>logout</button></a>

 <table border="1">
    <thead>
        <tr>
            <th>Job Name</th>
            <th>Applied Users</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="job" items="${finalUserList}">
            <tr>
                <td>${job.jname}</td>
                <td>
                    <table border="1">
                        <thead>
                            <tr>
                                <th>Name</th>
                                <th>Email</th>
                                <th>Mobile</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="user" items="${job.applicants}">
                                <tr>
                                    <td>${user.name}</td>                                     
                                    <td><a href="mailto:${user.email}">${user.email}</a></td>
                                    <td>${user.mobile}</td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>