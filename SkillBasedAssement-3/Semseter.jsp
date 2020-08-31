<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>College Attendance Portal</title>
<body bgcolor="skyblue">
<center>
<br>
<br>
<br>
<br>
<form action="MarkAttendance">
<select name="Semester">
<option> Select Semester: </option>
<option value="Semester-1"> Semester-1 </option>
<option value="Semester-2"> Semester-2 </option>
<option value="Semester-3"> Semester-3 </option>
<option value="Semester-4"> Semester-4 </option>
<option value="Semester-5"> Semester-5 </option>
<option value="Semester-6"> Semester-6 </option>
</select>
<input type="submit" value="MarkAttendance">
</form>
</center>
</body>
</html>