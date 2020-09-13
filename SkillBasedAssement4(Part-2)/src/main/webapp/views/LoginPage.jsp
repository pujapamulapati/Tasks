<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page session="false" %>
<html> 
<title>Login</title>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/style.css" media="screen" type="text/css" />
</head>
<body>
<div class="container">
<div class="row">
<div class="col-md-6">
<div class="card">
<div class="box">
<form  action="loginValidation"">
<h2>Enter User Name:</h2>
<input type="text" name="user_Name" placeholder="Enter User Name"  required="required">
<br>
<br>
<h2> Enter Password:</h2>
<input type="password" name="user_password" placeholder="Enter Password" required="required">  
<br>
<br>  
<input type="submit" value="Sign in" href="#">
</form>
</div>
</div>
</div>
</div>
</div>
</body>
</html>