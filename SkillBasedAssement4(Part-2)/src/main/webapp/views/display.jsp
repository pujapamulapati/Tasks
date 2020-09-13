<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Created Account Result </title>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/style.css" media="screen" type="text/css" />
</head>
<body>
<div class="container">
<div class="row">
<div class="col-md-6">
<div class="card">
<div class="box">
<h1>  ${status} </h1>
<br>
<br>
<h1> To Login To Your Account Please Login To Return To Login Page</h1>
<h1>SignIn</h1>
<form action="LoginPage">
<h2>Login Page......!</h2>
<br>
<input type="submit" value="SIGN IN" href="#">
</form>
<h1> Return to Home Page For Any Details</h1>
<h1>Home Page......!</h1>
<form action="PortalPage">
<br>
<input type="submit" value="HOME PAGE" href="#">
</form>
</div>
</div>
</div>
</div>
</div>
</body>
</html>