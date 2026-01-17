<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 style="color: red">Successfully Regsitered..!!</h1>

<table border="2">

<thead>

<tr>
<th>UserId</th>
<th>UserName</th>
<th>Password</th>
<th>UserAge</th>
<th>UserMobileno</th>
<th>UserAddress</th>
<th>Edit</th>
<th>Delete</th>

</tr>
</thead>

<tbody>
<c:forEach items="${data}" var="us">


<tr>
<td>${us.userid}</td>
<td>${us.username}</td>
<td>${us.password}</td>
<td>${us.userage}</td>
<td>${us.usermobileno }</td>
<td>${us.userAddress}</td>
<td><a href="delete?id=${us.userid}">Delete</a></td>
<td><a href="edit?id=${us.userid}">Edit</a></td>

</tr>




</c:forEach>


</tbody>







</table>






</body>
</html>