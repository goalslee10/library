<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css" type="text/css">
</head>
<body>
<h3>도서 조회</h3>
  <div>
	<form action="bookLookup" method="get">
		도서명:<input type="text" name="bookName"><br>
		저 자:<input type="text" name="authorName"><br>
		<input type="submit" value="조회">
		<input type="button" value="취소" onclick="location.href='main.jsp'">
	</form>
</div>
</body>
</html>