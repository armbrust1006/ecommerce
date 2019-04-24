<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="kr">

<head>
<!-- Common Header -->
<%@include file="common/header.jsp"%>

<title>심플 옥션 - 이메일 인증</title>

</head>

<body class="bg-dark">

	<div class="container">
		<div class="card card-login mx-auto mt-5">
			<div class="card-header">이메일 인증</div>
			<div class="card-body">
				<div class="text-center mb-4">
					<h4>인증 번호를 확인</h4>
					<p>입력하신 이메일 주소로 인증 번호가 전송되었습니다. 인증 번호를 입력해 주세요.</p>
				</div>
				<form action="/pinCheck" method="post">
					<div class="form-group">
						<div class="form-label-group">
							<input type="number" id="inputPinNum" name="pinNum" class="form-control" placeholder="인증 번호" required="required" autofocus="autofocus"> <label for="inputPinNum">인증 번호</label>
						</div>
					</div>
					<a class="btn btn-primary btn-block" id="checkBtn">인증</a>
				</form>
				<div class="text-center">
					<a class="d-block small mt-3" href="/regist">회원등록</a> <a class="d-block small" href="/login">로그인</a>
				</div>
			</div>
		</div>
	</div>
	<!-- Common Script -->
	<%@include file="common/script.jsp"%>

</body>

</html>