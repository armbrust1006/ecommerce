<%@include file="common/setting.jsp"%>
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
			<div class="card-header">Register an Account</div>
			<div class="card-body">
				<form>
					<div class="form-group">
						<div class="form-label-group">
							<input type="text" id="inputName" name="name" class="form-control" placeholder="Name" required="required" autofocus="autofocus"> <label for="inputName">* Name</label>
						</div>
					</div>
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-2 text-center">
								<label class="col-form-label">* Birthday</label>
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
							<input type="email" id="inputEmail" name="email" class="form-control" placeholder="Email address" required="required"> <label for="inputEmail">* Email address</label>
						</div>
					</div>
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<div class="form-label-group">
									<input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" required="required"> <label for="inputPassword">* Password</label>
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-label-group">
									<input type="password" id="confirmPassword" name="password" class="form-control" placeholder="Confirm password" required="required"> <label for="confirmPassword">* Confirm password</label>
								</div>
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="form-label-group">
							<input type="text" id="inputAddress" name="address" class="form-control" placeholder="Address" required="required"> <label for="inputAddress">Address</label>
						</div>
					</div>
					<a class="btn btn-primary btn-block" id="regist">Register</a>
				</form>
				<div class="text-center">
					<a class="d-block small mt-3" href="/login">Login Page</a> <a class="d-block small" href="/forgot-password">Forgot Password?</a>
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
