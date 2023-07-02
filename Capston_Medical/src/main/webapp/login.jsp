<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
form{
text-align: center;background-color: purple;}
</style>
</head>
<body>
<form action="LoginServlet" method="post">
username:<input type="text" name="username"><br>
password:<input type="password" name="password"><br>
<br><br><br>
<button type="submit">login</button>
</form>
</body>
</html>