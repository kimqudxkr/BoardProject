<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<p>처리완료 ${bordList.title } ??</p>
		<p>작성자 ${boardList.writer } ${boardList.regDate } 조회 ${boardList.cnt } 댓글 0건</p>
	</div>
	<br>
	<div>
		<p>파일 관련</p>
	</div>
	<div>
		<p>버튼들</p>
	</div>
	<p>${boardList.content }</p>
</body>
</html>