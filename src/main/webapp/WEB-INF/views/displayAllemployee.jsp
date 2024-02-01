<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page isELIgnored="false" %>
    <%@page import="java.util.List"%>
    
    <%@page import="com.raghav.empManagespring.Employee"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of employee</title>
</head>
<body>

<%
List<Employee>listofemp =(List<Employee>)request.getAttribute("listofemp"); 

%>
<!-- I have to traverse this array of objects using for each loop -->

<%

for(Employee emp: listofemp)
{
%>	
	
	<h3>Employee Details</h3><br>
	Name:<%=emp.getUsername() %><br>
	Password:<%=emp.getPassword() %><br>
	Type:<%=emp.getType() %><br>
	UserId:<%=emp.getUserid() %><br>
	
<% 
}

%>

</body>
</html>