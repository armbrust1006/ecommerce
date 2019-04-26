<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<!-- Common Header -->
<%@include file="common/header.jsp"%>
<meta http-equiv="refresh" content="5; url=/login">

<title>SB Admin - change</title>

</head>

<body class="bg-dark">

	<div class="container">
		<div class="card card-login mx-auto mt-5">
			<div class="card-header">페이지 이동 테스트 페이지</div>
			<div class="card-body">
				<label id="countNum" class="form-controll"></label> <label id="message" class="form-controll"></label>
			</div>
		</div>
	</div>
	<!-- Common Script -->
	<%@include file="common/script.jsp"%>

	<script type="text/javascript">
		var pageName = '${pageName}';
	</script>
	<!-- Custom JavaScript-->
	<script src="/static/bootstrap/js/change.js"></script>

</body>

</html>