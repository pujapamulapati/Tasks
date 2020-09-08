<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
<%@include file="/WEB-INF/css/CSSFile.css"%>
</style>
</head>
<body>
<h2>Search Players by Country</h2>
<form action="playersByCountry">
<h1>Player By Country: </h1>
<select name="playerCountry">
<option value="Indian">Indian</option>
<option value="Australia">Australia</option>
<option value="Bangladesh">Bangladesh</option>
<option value="South Africa">South Africa</option>
</select>
<input type="submit">
</form>
</body>
</html>