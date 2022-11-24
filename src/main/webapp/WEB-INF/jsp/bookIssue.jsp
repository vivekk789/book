<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BookIssue</title>
</head>
<body>
<div align="center">

<form action="saveBookIssue" method="post">
<pre>
BookId <input type="text" name="bookId"/>
MemberId <input type="text" name="memberId"/>
IssueDate <input type="text" name="issuedate"/>
ReturnDate <input type="text" name="returnDate"/>
DateReturned <input type="text" name="dateReturned"/>
BorrowAmount <input type="text" name="borrowAmount"/>
LateReturnFeeAmount <input type="text" name="lateReturnFeeAmount"/>
<input type="submit" value="save"/>
</pre>
</form>



</div>

</body>
</html>