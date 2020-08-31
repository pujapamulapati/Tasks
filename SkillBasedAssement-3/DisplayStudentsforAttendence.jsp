<%@page import="mypackage.College.StudentDetails.StudentsData"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
td
{
background-color: white;
font-family:comic sans ms;
font-size: 25px;
}
</style>
</head>
<body bgcolor="skyblue">
<form action="markAttendence">
<center>
<h2>Mark the Attendance Of the Student</h2>
</center>
<br>
<table id="students" align="center">
<tr> <td> Student ID Number </td> <td> Name Of Student </td>  <td> Select Attendance (Present/Absent)  </td> </tr>
<%
ArrayList<StudentsData> studentList=(ArrayList<StudentsData>)session.getAttribute("studentdata");
for(StudentsData stud:studentList)
{
	out.print("<tr>");
	out.print("<td>"+stud.getStudentID()+"</td>");
	out.print("<td>"+stud.getStudentName()+"</td>");
	out.print("<td> <input type='checkbox' name='status' value='"+stud.getStudentID()+"'> </td>");
	out.print("</tr>");
}
%>
</table>
<center>
<br>
<br>
<input type="submit" value="SUBMIT">
</center>
</form>
</body>
</html>