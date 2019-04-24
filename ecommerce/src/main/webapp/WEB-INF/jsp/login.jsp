<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
			<div class="card-header">Login</div>
			<div class="card-body">
				<c:if test="${failMessage != null}">
					<label class="form-controll">${failMessage}</label>
				</c:if>
				<form action="/login" method="post">
					<div class="form-group">
						<div class="form-label-group">
							<input type="email" id="inputEmail" name="account" class="form-control"
								placeholder="Email address" required="required" autofocus="autofocus"> <label
								for="inputEmail">Email address</label>
						</div>
					</div>
					<div class="form-group">
						<div class="form-label-group">
							<input type="password" id="inputPassword" name="password" class="form-control"
								placeholder="Password" required="required"> <label for="inputPassword">Password</label>
						</div>
					</div>
					<div class="form-group">
						<div class="checkbox">
							<label> <input type="checkbox" value="remember-me"> Remember Password
							</label>
						</div>
					</div>
					<a class="btn btn-primary btn-block" href="#" id="loginBtn">Login</a>
				</form>
				<div class="text-center">
					<a class="d-block small mt-3" href="register">Register an Account</a> <a class="d-block small"
						href="forgotPassword">Forgot Password?</a>
				</div>
			</div>
		</div>
	</div>
	<!-- Common Script -->
	<%@include file="common/script.jsp"%>

	<!-- Custom JavaScript-->
	<script src="/static/bootstrap/js/login.js"></script>

</body>

</html>