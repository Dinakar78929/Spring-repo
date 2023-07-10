<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
<style type="text/css">
#footer {
	position: absolute;
	bottom: 0;
	width: 100%;
}

.ff {
	text-align: center;
}
</style>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body class="text-center">

	<!-- <div class="cover-container d-flex h-100 p-3 mx-auto flex-column"> -->
	<header class="masthead mb-auto">
		<div class="inner">

			<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
				<span class="container-fluid"> <a class="navbar-brand"
					href="#"> <img
						src="https://img.freepik.com/premium-vector/parking-space-icon-where-you-can-park-your-car-flat-vector-illustration-isolated-white-background_124715-1477.jpg?w=2000"
						alt="Parking Logo" style="width: 60px;" class="rounded-pill">
				</a>
				</span> <a class="nav-link" href="Home.jsp">Home</a>

			</nav>
		</div>
	</header>
	<h4 style="color: green">${success}</h4>
	<h4 style="color: red">${failure}</h4>
	<section class="vh-100">
		<div class="container-fluid h-custom">
			<div
				class="row d-flex justify-content-center align-items-center h-100">
				<div class="col-md-9 col-lg-6 col-xl-5">
					<img
						src="https://www.tekrevol.com/blogs/wp-content/uploads/2022/03/6-1-1024x639.jpg"
						class="img-fluid" alt="Sample image">
				</div>
				<div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">
					<form action="adminLogin" method="post">
						<!-- <div
								class="d-flex flex-row align-items-center justify-content-center justify-content-lg-start">
								<p class="lead fw-normal mb-0 me-3">Sign in with</p>
								<button type="button" class="btn btn-primary btn-floating mx-1">
									<i class="fab fa-facebook-f"></i>
								</button>

								<button type="button" class="btn btn-primary btn-floating mx-1">
									InstaGram <i class="fab fa-twitter"></i>
								</button>

								<button type="button" class="btn btn-primary btn-floating mx-1">
									<i class="fab fa-linkedin-in"></i>
								</button>
							</div>

							<div class="divider d-flex align-items-center my-4">
								<p class="text-center fw-bold mx-3 mb-0">Or</p>
							</div> -->

						<!-- Email input -->
						<div class="form-outline mb-4">
							<input type="email" id="form3Example3"
								class="form-control form-control-lg"
								placeholder="Enter a valid email address" name="email" /> <label
								class="form-label" for="form3Example3">Email address</label>
						</div>

						<!-- Password input -->
						<div class="form-outline mb-3">
							<input type="password" id="form3Example4"
								class="form-control form-control-lg"
								placeholder="Enter password" name="password" /> <label
								class="form-label" for="form3Example4">Password</label>
						</div>

						<div class="d-flex justify-content-between align-items-center">
							<!-- Checkbox -->
							<!-- <div class="form-check mb-0">
								<input class="form-check-input me-2" type="checkbox" value=""
									id="form2Example3" name=""/> <label class="form-check-label"
									for="form2Example3"> Remember me </label>
							</div> -->
							<a href="#!" class="text-body">Forgot password?</a>
						</div>

						<div class="text-center text-lg-start mt-4 pt-2">
							<!-- <button type="button" class="btn btn-primary btn-lg"
									style="padding-left: 2.5rem; padding-right: 2.5rem;">Login</button> -->
							<input type="submit" value="Login">
							<!-- <p class="small fw-bold mt-2 pt-1 mb-0">
								Don't have an account? <a href="#!" class="link-danger">Register</a>
							</p> -->
						</div>

					</form>
				</div>
			</div>
		</div>
	</section>
	<footer id="footer">
		<div
			class="d-flex flex-column flex-md-row text-center text-md-start justify-content-between py-4 px-4 px-xl-5 bg-secondary">
			<!-- Copyright -->
			<div class="container">
				<div class="row justify-content-center">

					<h5 class="ff">Copyright © 2020. All rights reserved.</h5>



				</div>
			</div>
			<!-- Copyright -->

			<!-- Right -->
			<div>
				<a href="#!" class="text-white me-4"> <i
					class="fab fa-facebook-f"></i>
				</a> <a href="#!" class="text-white me-4"> <i class="fab fa-twitter"></i>
				</a> <a href="#!" class="text-white me-4"> <i class="fab fa-google"></i>
				</a> <a href="#!" class="text-white"> <i class="fab fa-linkedin-in"></i>
				</a>
			</div>
			<!-- Right -->
		</div>
	</footer>
</body>
</html>