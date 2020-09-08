<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style><%@include file="/WEB-INF/css/CSSFile.css"%></style>
<title>PlayerDetails</title>
</head>
<body>
<table border="border" width="80%">
<tr> <td> Player Id </td> <td> Player Name </td> <td>Player Country </td> <td>Player Game </td> </tr>
<c:forEach items="${player}" var="player">
<tr>
<td> ${player.playerId}</td>
<td> ${player.playerName} </td>
<td> ${player.playerCountry} </td>
<td> ${player.playerGame} </td>
</tr>
</c:forEach>
</table>
</body>
</html>