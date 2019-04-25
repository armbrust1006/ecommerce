<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<!-- Common Header -->
<%@include file="common/header.jsp"%>

<title>SB Admin - Register</title>

</head>

<body class="bg-dark">

	<div class="container">
		<div class="card card-register mx-auto mt-5">
			<div class="card-header">회원 등록</div>
			<div class="card-body">
				<c:if test="${failMessage != null}">
					<label class="form-controll">${failMessage}</label>
				</c:if>
				<form action="/regist" method="post">
					<div class="form-group">
						<div class="form-label-group">
							<input type="text" id="inputName" name="name" class="form-control" placeholder="성명" required="required" autofocus="autofocus"> <label for="inputName">* 성명</label>
						</div>
					</div>
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-2 text-center">
								<label class="col-form-label">* 생일(년/월/일)</label>
							</div>
							<div class="col-md-4">
								<select id="selectYear" name="birthdayYear" class="form-control">
								</select>
							</div>
							<div class="col-md-3">
								<select id="selectMonth" name="birthdayMonth" class="form-control">
								</select>
							</div>
							<div class="col-md-3">
								<select id="selectDate" name="birthdayDate" class="form-control">
								</select>
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="form-label-group">
							<input type="email" id="inputEmail" name="email" class="form-control" placeholder="이메일" required="required"> <label for="inputEmail">* 이메일</label>
						</div>
					</div>
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<div class="form-label-group">
									<input type="password" id="inputPassword" name="password" class="form-control" placeholder="비밀번호" required="required"> <label for="inputPassword">* 비밀번호</label>
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-label-group">
									<input type="password" id="confirmPassword" class="form-control" placeholder="비밀번호  확인" required="required"> <label for="confirmPassword">* 비밀번호 확인</label>
								</div>
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="form-label-group">
							<input type="text" id="inputAddress" name="address" class="form-control" placeholder="주소" required="required"> <label for="inputAddress">주소</label>
						</div>
					</div>
					<a class="btn btn-primary btn-block" id="regist">회원 등록</a>
				</form>
				<div class="text-center">
					<a class="d-block small mt-3" href="/login">로그인</a> <a class="d-block small" href="/forgot">비밀 번호 찾기</a>
				</div>
			</div>
		</div>
	</div>
	<!-- Common Script -->
	<%@include file="common/script.jsp"%>

	<!-- Bootstrap core JavaScript-->
	<script src="/static/bootstrap/js/regist.js"></script>

</body>

</html>