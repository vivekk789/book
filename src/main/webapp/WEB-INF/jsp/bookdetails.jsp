<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>book</title>
</head>
<body>
<form Action="saveBook" method="post">
<pre>
BookTitle <input type="text" name="bookTitle"/> 
Isbn <input type="text" name="isbn"/>
PublisherId <input type="text" name="publisherId"/>
bookFileName <input type="text" name="bookFileName"/>
borrowDuration <input type="text" name="borrowDuration"/>
borrowPrice <input type="text" name="borrowPrice"/>
<input type="submit" value="save"/>

</pre>
</form>
</body>
</html>