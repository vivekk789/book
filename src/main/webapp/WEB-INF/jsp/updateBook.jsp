<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>book</title>
</head>
<body>
<form Action="updatedBook" method="post">
<pre>
BookTitle <input type="text" name="bookTitle" value="${book.bookTitle }"/> 
Isbn <input type="text" name="isbn" value="${book.isbn }"/>
PublisherId <input type="text" name="publisherId" value="${book.publisherId }"/>
bookFileName <input type="text" name="bookFileName" value="${book.bookFileName }"/>
borrowDuration <input type="text" name="borrowDuration" value="${book.borrowDuration}"/>
borrowPrice <input type="text" name="borrowPrice" value="${book.borrowPrice }"/>
<input type="submit" value="save"/>

</pre>
</form>
</body>
</html>