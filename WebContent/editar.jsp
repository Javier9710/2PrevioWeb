<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
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
		<h3 class="text-center text-white pt-5">FORMULARIO DE EDICION</h3>
		<div class="container">
			<div id="login-row"
				class="row justify-content-center align-items-center">
				<div id="login-column" class="col-md-6">
					<div id="login-box" class="col-md-12">
						<form id="login-form" class="form" action="EstudianteControl" method="post">
							<h3 class="text-center text-info">REGISTRO</h3>
							<div class="form-group">
								<label for="username" class="text-info">Usuario:</label> <input
									type="text" value="${estudiante.getInEstudiante()}" name="usuario" id="username" class="form-control">
							</div>

							<div class="form-group">
								<label for="username" class="text-info">Nombre:</label> <input
									type="text" value="${estudiante.getNombre()}" name="nombre" id="username" class="form-control">
							</div>


							<div class="form-group">
							<label for="username" class="text-info">Elige Tu Ciudad:</label>
								<jsp:useBean id="PS" class="Dao.CiudadDao" scope="request"></jsp:useBean>
								<select name="ciudad" class="form-control">
									<option>${estudiante.ciudad.id}</option>
									<c:forEach var="p" items="${PS.listar()}">

										<option value="<c:out value="${p.id}"/>"><c:out
												value="Cedula: ${p.id} Nombre: ${p.nombre}" /></option>
									</c:forEach>
								</select>
							</div>



							<div class="form-group">
								<label for="password" class="text-info">Contraseña:</label> <input
									type="text" name="pass" id="password" class="form-control">
							</div>
							<div class="form-group">

								<input type="submit" name="accion" class="btn btn-info btn-md"
									value="update">
							
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