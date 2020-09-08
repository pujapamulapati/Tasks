<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style><%@include file="/WEB-INF/css/CSSFile.css"%></style>

<meta charset="ISO-8859-1">
<title>Create Player</title>
</head>
<body>
<h1>
Hello Player PLease Provide Below Details to Create Your Name In Player List!  
</h1>
<form action="display">
<h1> Player ID:</h1>
<input type="number" name="playerId">
<br>
<br>
<h1> Player Name: </h1>
<input type="text" name="playerName">
<br>
<br>
<<h1> Player Country: </h1>
<input type="text" name="playerCountry"></p>
<br>
<br>
<h1> Player Game: </h1>
<input type="text" name="playerGame">
<br>
<br>
<input type="submit" name="savePlayer">
</form>
</body>
</html>