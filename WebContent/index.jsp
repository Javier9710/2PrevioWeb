<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<!-- CSS only -->

<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">

<!-- JS, Popper.js, and jQuery -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
	integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
	integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"
	integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
	crossorigin="anonymous"></script>

<link REL=StyleSheet HREF="css.css" TYPE="text/css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div id="login">
		<h3 class="text-center text-white pt-5">FORMULARIO DE LOGIN</h3>
		<div class="container">
			<div id="login-row"
				class="row justify-content-center align-items-center">
				<div id="login-column" class="col-md-6">
					<div id="login-box" class="col-md-12">
						<form id="login-form" class="form" action="AccesoControl" method="post">
							<h3 class="text-center text-info">Login</h3>
							<div class="form-group">
								<label for="username" class="text-info">Usuario:</label><br>
								<input type="text" name="usuario" id="username"
									class="form-control">
							</div>
							<div class="form-group">
								<label for="password" class="text-info">Contraseña:</label><br>
								<input type="password" name="pass" id="password"
									class="form-control">
							</div>
							<div class="form-group">

								<input type="submit"  name="accion" class="btn btn-info btn-md"
									value="ingreso">
								<div id="register-link" class="text-right">
									<br> <br> <a href="registro.jsp" class="text-info">Registrarse</a><br>
								</div>
							</div>

						</form>
					</div>
				</div>
			</div>
		</div>
	</div>


</body>
<nav>
	<footer class="page-footer font-small blue">
		<div class="footer-copyright text-center py-3">© 2020 Copyright:
			Javier Moncada Contacto: Javierandresmd@ufps.edu.co</div>
	</footer>
</nav>
</html>