<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="addAlien" method="post">
Enter your Id:<input type="text" name="aid"><br>
Enter your Name:<input type="text" name="aname"><br>
<input type="Submit">
</form>

</body>
<hr>
<body>
<form action="getAlien" method="get">
Enter your Id:<input type="text" name="aid"><br>
<input type="Submit" value="getAlien">
</form>
</body>
<hr>
<body>
<form action="getAliens" method="get">

<input type="Submit" value="getAliens">
</form>
</body>
<hr>
<body>
<form action="getAlienByName" method="get">
Enter your Name:<input type="text" name="aname"><br>
<input type="Submit">
</form>
</body>
</html>
