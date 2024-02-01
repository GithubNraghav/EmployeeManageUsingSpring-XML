<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: #CDDCDC;
 background-image: radial-gradient(at 50% 100%, rgba(255,255,255,0.50) 0%, rgba(0,0,0,0.50) 100%), linear-gradient(to bottom, rgba(255,255,255,0.25) 0%, rgba(0,0,0,0.25) 100%);
 background-blend-mode: screen, overlay;">


<div style="text-align:center">

<h1>Enter new Employee Details</h1>

<br><br>

<form action="Adminservlet" method="post">

Enter Username:<input type="text" name="uname"><br>
Enter password:<input type="text" name="upass"><br>
Enter Type:<input type="text" name="utype"><br>
Enter userid:<input type="text" name="userid"><br>
<br><br>
<button type="submit" value="inseretEmp" name="button" style="width:100px;height:30px;">InsertEmp</button>
</div>
</form>

</body>
</html>