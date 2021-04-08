<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p align="center">좋은삼정병원</p>
	<table border="1" align="center">
		<tr>
			<th bgcolor="" width="40">번호</th>
			<th bgcolor="" width="36"><input type="checkbox"/></th>
			<th bgcolor="" width="400">제목</th>
			<th bgcolor="" width="145">글쓴이</th>
			<th bgcolor="" width="57">날짜</th>
			<th bgcolor="" width="36">조회</th>
		</tr>
		<c:choose>
			<c:when test="${!empty boardList}">
				<c:forEach items="${boardList }" var="board">
					<tr>
						<td align="center">${board.idx }</td>
						<td align="center"><input type="checkbox"/></td>
						<td align="left"><a href="getContent.do?idx=${board.idx }">
								${board.title }</a></td>
						<td>${board.writer }</td>
						<td align="center"><fmt:formatDate value="${board.regDate }" pattern="MM-dd"/></td>
						<td align="center">${board.cnt }</td>
					</tr>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<tr>
					<td colspan="5">등록된 글이 없습니다.</td>
				</tr>
			</c:otherwise>
		</c:choose>
	</table>
	<br>
	<div align="center">
		<button onclick="window.location.href='/board/write'">글쓰기</button>
	</div>
</body>
</html>