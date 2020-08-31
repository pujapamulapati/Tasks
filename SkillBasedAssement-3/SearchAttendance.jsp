<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Attendance Data Of Semester</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
 <script>
 $(document).ready(function(){
 	var dtToday = new Date();
 	var month = dtToday.getMonth() + 1;
 	var day = dtToday.getDate();
 	var year = dtToday.getFullYear();
 	if(month < 10)
 		month = '0' + month.toString();
 	if(day < 10)
 		day = '0' + day.toString();
 	var maxDate = year + '-' + month + '-' + day;
 	$('#dateControl').attr('max', maxDate);
 })
 </script>

</head>
<body bgcolour="skyblue">
<center>
<form action="StudentServlet">
<h1> Search Attendance Record...</h1>
<br><br><br><br>
<select name="Semester">
<option> Select Semester: </option>
<option value="Semester-1"> Semester-1 </option>
<option value="Semester-2"> Semester-2 </option>
<option value="Semester-3"> Semester-3 </option>
<option value="Semester-4"> Semester-4 </option>
<option value="Semester-5"> Semester-5 </option>
<option value="Semester-6"> Semester-6 </option>
</select>
<br>
<br>
<input type="Date" name="Date" id="dateControl" />
<br><br>
<input type="submit" value="SearchRecord">
</form>
</center>
</body>
</html>