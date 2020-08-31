<%@page import="mypackage.College.Attendence.Attendence"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Record Found Data</title>
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
<center>
<h1>Students Attendance Status </h1>
</center>
<br>
<table id="students" align="center">
<%
ArrayList<Attendence> attendanceList= (ArrayList<Attendence>)session.getAttribute("attendancedata");
out.print("<tr> <td> Student ID </td> <td> Name Of Student </td>  <td> StatusOfAttendance </td> </tr>");
for(Attendence atd:attendanceList)
{
	out.print("<tr>");
	out.print("<td>"+atd.getStudentID()+"</td>");
	out.print("<td>"+atd.getStudentName()+"</td>");
	out.print("<td>"+atd.getAttendenceOfStudent()+"</td>");
	out.print("</tr>");
}
%>
</table>

</body>
</body>
</html>