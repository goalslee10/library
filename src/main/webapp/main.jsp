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
<h3>도서 관리 시스템</h3>
<div>
    <form action="bookLookup.jsp">
    	<input type="submit" value="도서 조회">
  	</form>
  	<form action="bookEnroll.jsp">
    	<input type="submit" value="도서 등록">
    </form>
</div>
<br><button type = "button" class = "logout">로그인</button>
</body>
</html>