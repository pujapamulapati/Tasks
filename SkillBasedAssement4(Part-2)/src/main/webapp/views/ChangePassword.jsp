<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change Password</title>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/style.css" media="screen" type="text/css" />
</head>
<body>
<div class="container">
<div class="row">
<div class="col-md-6">
<div class="card">
<div class="box">
<h1>CHANGE PASSWORD</h1>
<form action="ChangePassword">
<br>
<h2>Enter User ID:</h2>
<input type="number"  name="user_ID" placeholder="Enter User ID" required="required">
<br>
<br>
<h2>Enter New Password:</h2>
<input type="password" name="user_password" placeholder="Enter New Password" required="required">
<br>
<br>
<h2>Enter Password To Confirm Password:</h2>
<input type="password"  name="user_confirmPassword"placeholder=" Enter To Confirm New Password" required="required">
<br>
<br>
<input type="submit" value="ChangePassword" href="#">
</form>
</div>
</div>
</div>
</div>
</div>
</body>
</html>