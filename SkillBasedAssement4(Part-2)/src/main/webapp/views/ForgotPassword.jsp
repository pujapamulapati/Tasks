<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forgot Password</title>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/style.css" media="screen" type="text/css" />
</head>
<body>
<div class="container">
<div class="row">
<div class="col-md-6">
<div class="card">
<div class="box">
<h1>Account Recovery Process</h1>
<form action="Validate">
<h2>Enter User ID:</h2>
<input type="number"  name="user_ID"  placeholder="Enter User ID" required="required">
<br>
<br>      
<h2>Select Security Question:</h2>
<select name="user_SecurityQuestion"  required="required">
<option value="Select Question">Select Question</option>
<option value="What was your childhood nickname?">What was your childhood nickname?</option>
<option value="What primary school did you attend?">What primary school did you attend?</option>
<option value="What is the name of the company of your first job?">What is the name of the company of your first job?</option>
<option value="What time of the day were you born?">What time of the day were you born?</option>
<option value="What is your grandmother's name?">What is your grandmother's name?</option>
<option value="What is your mother's name?">What is your mother's name?</option>
<option value="What year did you graduate from High School?">What year did you graduate from High School?</option>
<option value="What is the name of the first school you attended?">What is the name of the first school you attended?</option>
<option value="Where did you vacation last year?">Where did you vacation last year?</option>
<option value="Where did you vacation last place?">Where did you vacation last place?</option>
</select>
<br>
<br>
<h2>Enter the Security Answer</h2>
<input type="text" name="user_SecurityAnswer" placeholder="Enter the Security Answer" required="required">
<br>
<br>
<input type="submit"  value="Validate" href="#">
</form>
</div>
</div>
</div>
</div>
</div>
</body>
</html>