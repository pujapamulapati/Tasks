<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<link href="/CSSFile.css" rel="stylesheet" type="text/css">
<style><%@include file="/WEB-INF/css/CSSFile.css"%></style>

<title>Player Portal</title>
<meta charset="UTF-8">

</head>
<body>
<center>
<h1>
Hello Player PLease Click The Below Button For Further Process...!
</h1>
<form action="SaveDetails">
<h1>New Player Creation......!</h1>
<br>
<input type="submit" value="CreatePlayer">
</form>
<br>
<br>
<form action="updatePage">
<h1>Player Update......!</h1>
<br>
<input type="submit" value="UpdatePlayer">
</form>
<br>
<br>
<form action="SearchDetailsByCountry">
<h1>Player Search By Country Name......!</h1>
<br>
<input type="submit" value="SearchDetailsByCountry">
</form>
<br>
<br>
<form action="SearchDetailsByName">
<h1>Player Search By Player Name......!</h1>
<br>
<input type="submit" value="SearchDetailsByName">
</form>
<br>
<br>
<form action="DeleteDetailsByName">
<h1>Player Delete Data By Player Name......!</h1>
<br>
<input type="submit" value="DeleteDetailsByName">
</form>
</center>


</body>
</html>
