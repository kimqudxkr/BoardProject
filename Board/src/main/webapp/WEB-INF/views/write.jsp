<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p align="center">좋은삼정병원 글쓰기</p>
<table border="1" align="center">
	<tr>
		<th>옵션</th>
		<td width="630"><input type="checkbox">공지<input type="checkbox">html</td>
	</tr>
	<tr>
		<th>분류</th>
		<td>
			<select name="selectBox">
				<option value="">미처리</option>
				<option value="">처리완료</option>
				<option value="">처리중</option>
				<option value="">보류</option>
				<option value="">공지</option>
			</select>
		</td>
	</tr>
	<tr>
		<th>제목</th>
		<td><input type="text"/></td>
	</tr>
	<tr>
		<th>내용</th>
		<td><textarea rows="10" cols="80" id="content"></textarea></td>
	</tr>
	<tr>
		<th>링크#1</th>
		<td><input type="text"/></td>
	</tr>
	<tr>
		<th>링크#2</th>
		<td><input type="text"/></td>
	</tr>
	<tr>
		<th>파일#2</th>
		<td>
			<button value="file">파일 선택</button><input type="text"/>
			<br>용량 100 MB 이하만 업로드 가능
		</td>
	</tr>
	<tr>
		<th>파일#2</th>
		<td>
			<button value="file">파일 선택</button><input type="text"/>
			<br>용량 100 MB 이하만 업로드 가능
		</td>
	</tr>
	</table>
	<br>
	<div align="center">
		<button value="submit">작성완료</button>
		<button value="cancel">취소</button>
	</div>
</body>
</html>