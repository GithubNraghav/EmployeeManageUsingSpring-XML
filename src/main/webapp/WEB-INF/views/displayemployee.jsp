<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EmployeeDetails</title>
</head>
<body>



Employee details are:<br>
Name:${empdetails.getUsername()}<br>
Password:${empdetails.getPassword()}<br>
Type:${empdetails.getType()}<br>
UserId:${empdetails.getUserid()}<br>
</body>
</html>