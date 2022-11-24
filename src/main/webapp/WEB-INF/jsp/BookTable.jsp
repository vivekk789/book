<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Table</title>
</head>
<body>
	<table border="1">
	<tr>
	<th>bookTitle</th>
	<th>isbn</th>
	<th>publisherId</th>
	<th>bookFileName</th>
	<th>borrowDuration</th>
	<th>borrowPrice</th>
	<th>Delete</th>
	<th>Update</th>
	</tr>
	<c:forEach var="books" items="${books}">
	<tr>
	<td>${books.bookTitle}</td>
	<td>${books.isbn}</td>
	<td>${books.publisherId}</td>
	<td>${books.bookFileName}</td>
	<td>${books.borrowDuration}</td>
	<td>${books.borrowPrice}</td>
	<td><a href="delete?id=${books.id}">delete</a></td>
	<td><a href="update?id=${books.id}">update</a></td>
	</tr>
	
	</c:forEach>
	</table>
</body>
</html>