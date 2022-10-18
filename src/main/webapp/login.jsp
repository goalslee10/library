<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="" method="post">
		아이디:<input type ="text" class ="userId" id = "userId" placeholder="아이디를 입력하세요."><br>
		비밀번호:<input type = "text" class="userPassword" id = "userPassword" placeholder="비밀번호를 입력하세요."><br><br>
		<input type="submit" value = "로그인">
	</form>
	<form action="membership.jsp" method="get">
		<input type = "submit" value="회원가입">
	</form>
</body>
</html>