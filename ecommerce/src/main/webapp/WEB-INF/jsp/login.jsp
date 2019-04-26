<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<!-- Common Header -->
<%@include file="common/header.jsp"%>

<title>SB Admin - Login</title>

</head>

<body class="bg-dark">


	<div class="container">
		<div class="card card-login mx-auto mt-5">
			<div class="card-header">로그인</div>
			<div class="card-body">
				<c:if test="${failMessage != null}">
					<label class="form-controll">${failMessage}</label>
				</c:if>
				<form action="/login" method="post">
					<div class="form-group">
						<div class="form-label-group">
							<input type="email" id="inputEmail" name="account" class="form-control" placeholder="이메일(아이디)" required="required" autofocus="autofocus"> <label for="inputEmail">이메일(아이디)</label>
						</div>
					</div>
					<div class="form-group">
						<div class="form-label-group">
							<input type="password" id="inputPassword" name="password" class="form-control" placeholder="비밀번호" required="required"> <label for="inputPassword">비밀번호</label>
						</div>
					</div>
					<div class="form-group">
						<div class="checkbox">
							<label> <input type="checkbox" value="remember-me"> 아이디 비밀번호 기억하기
							</label>
						</div>
					</div>
					<a class="btn btn-primary btn-block" id="loginBtn">로그인</a>
				</form>
				<div class="text-center">
					<a class="d-block small mt-3" href="register">회원등록</a> <a class="d-block small" href="forgotPassword">비밀번호 찾기</a>
				</div>
			</div>
		</div>
	</div>
	<!-- Common Script -->
	<%@include file="common/script.jsp"%>

	<!-- Custom JavaScript-->
	<script type="text/javascript">
		var session = '${pageMessage}';
		var message1 = '${loginConfirm}';
	</script>
	<script src="/static/bootstrap/js/login.js"></script>

</body>

</html>