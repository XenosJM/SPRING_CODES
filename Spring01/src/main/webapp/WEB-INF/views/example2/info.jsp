<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터가 가네요</title>
</head>
<body>
	<h1>보낼 데이터</h1>
	<form action="info" method="POST">
		<input type="text" name="name"><br>
		<input type="email" name="email"><br>
		<input type="date" name="birthDate"><br>
		<input type="submit" value="전송">
	</form>
</body>
</html>