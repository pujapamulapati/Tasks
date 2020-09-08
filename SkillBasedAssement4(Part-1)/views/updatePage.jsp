<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Update</title>
<style><%@include file="/WEB-INF/css/CSSFile.css"%></style>
</head>
<body>
<form action="searchForUpdate">
<h1> Please Provide Your PlayerID Number To Update Details</h1>
Player Id:<input type="text" name="playerId" value="${player.playerId}">
<br>
<br>
<input type="submit" value="SearchDetails">
</form>
<form action="updateData">
<h1>Player Name:</h1>
<input type="text" name="playerName" value="${player.playerName}">
<br>
<br>
<h1>Player Country: </h1>
<input type="text" name="playerCountry" value="${player.playerCountry}">
<br>
<br>
<h1> Player Game:</h1>
<input type="text" name="playerGame" value="${player.playerGame}">
<br>
<br>
<input type="submit" value="UpdatePlayerDetails">
</form>
</body>
</html>


