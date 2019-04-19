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
							<input type="text" id="name" class="form-control" placeholder="Name" required="required" autofocus="autofocus"> <label for="name">Name</label>
						</div>
					</div>
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-3">
								<label class="col-form-label">Birthday</label>
							</div>
							<div class="col-md-3">
								<select id="year" name="brithdayYear" class="form-control">
									<option value=""></option>
								</select>
							</div>
							<div class="col-md-2">
								<select id="month" name="brithdayMonth" class="form-control">
									<option value=""></option>
									<option value="1">01</option>
									<option value="2">02</option>
									<option value="3">03</option>
									<option value="4">04</option>
									<option value="5">05</option>
									<option value="6">06</option>
									<option value="7">07</option>
									<option value="8">08</option>
									<option value="9">09</option>
									<option value="10">10</option>
									<option value="11">11</option>
									<option value="12">12</option>
								</select>
							</div>
							<div class="col-md-2">
								<select id="date" name="brithdayDate" class="form-control">
									<option value=""></option>
								</select>
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="form-label-group">
							<input type="email" id="email" class="form-control" placeholder="Email address" required="required"> <label for="email">Email address</label>
						</div>
					</div>
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<div class="form-label-group">
									<input type="password" id="inputPassword" class="form-control" placeholder="Password" required="required"> <label for="inputPassword">Password</label>
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-label-group">
									<input type="password" id="confirmPassword" class="form-control" placeholder="Confirm password" required="required"> <label for="confirmPassword">Confirm password</label>
								</div>
							</div>
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
