<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body style="width:1000px;height:800px ;background:rgb(225, 233, 235)">
<!-- in this project I have to 
create a employee management oage, 

which can accept two kind of suers 

1.admin
2.users


 --> 
 <div style="margin-left:550px;">
 <h1>Employee Management </h1>
 </div>
 <div style="text-align:center;width:100%;height:100%">
 
 <form action="verifyServlet" method="post" style="margin:20px; height:95%;">
 
<div style="margin-top:150px;margin-left:380px; margin-right:200px; width:60%;height:40%;background: rgb(170, 187, 187)">

 <table style="width:100%; height:100%"> 
 
 <tr >
 <td style="width:40%">
 <lable>
 <h2 style="size:15px">Enter Username</h1>
 </lable>
 </td>
 <td>
 <input type="text" name="username" style="width:80% ;size:30px;height:35% "><br>
 </td>
 </tr>
 
 <tr>
 <td >
 <lable><h2 style="size:15px">Enter Password</h1></lable>
 </td>
 <td >
 <input type="password" name="password" style="width:80% ;size:30px;height:35% "><br>
 </td>
 </tr>
 
 <tr >
  <td >
 <lable><h2 style="size:15px">Enter UserId</h1></lable>
  </td>
  <td >
 <input type="text" name="userid" style="width:80% ;size:30px;height:35% "><br>
  </td>
 </tr>
 
 </table>
 </div>
 <br>
 <br>
 
 <div style="margin-left:500px;">
 <button type="submit" style="width:100px ;height:50px;background: rgb(5, 143, 197)"><h3>Login</h3></button>
 </div>
 </form>
 
 
 </div>
 

</body>
</html>