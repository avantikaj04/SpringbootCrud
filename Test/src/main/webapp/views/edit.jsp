<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2 style="color: red">Edit Form</h2>
<form action="update">
<input type="number" name="userid" placeholder="Enter id" value="${us.userid}"><br><br>
<input type="text" name="username" placeholder="Enter your username" value="${us.username}"><br><br>
<input type="text" name="password" placeholder="Enter your password" value="${us.password}"><br><br>
<input type="number" name="userage" placeholder="Enter your userage" value="${us.userage}"><br><br>
<input type="number" name="usermobileno" placeholder="Enter yourmobileno" value="${us.usermobileno}"><br><br>
<input type="text" name="userAddress" placeholder="Enter your userAddress" value="${us.userAddress}"><br><br>
<input type="submit" value="Update">







</form>
</body>
</html>