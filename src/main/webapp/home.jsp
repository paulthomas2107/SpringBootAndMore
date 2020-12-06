<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add an Alien	</title>
</head>
<body>
	
	Add....
	<form action="addAlien">
	
	ID <input type="text" name="aid"><br>
	NAME <input type="text" name="aname"><br>
	TECH <input type="text" name="atech"><br>
	<input type="submit"><br><br><br><br><br>
	</form>

	Get....
	<form action="getAlien">
	
	ID <input type="text" name="aid"><br>
	<input type="submit"><br>
	</form>
	
	Delete....
	<form action="deleteAlien">
	
	ID <input type="text" name="aid"><br>
	<input type="submit"><br>
	</form>

</body>
</html>