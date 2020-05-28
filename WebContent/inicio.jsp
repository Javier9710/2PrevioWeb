<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	<h1>Este es el inicio</h1>
	
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Opciones</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item">
        <a class="nav-link" href="prueba.jsp">Link</a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Ejemplo
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="prueba.jsp">Action</a>
          <a class="dropdown-item" href="#">Another action</a>
        </div>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>

	

	<jsp:useBean id="cD1" class="Dao.EstudianteDao" scope="request"></jsp:useBean>
	<table class="table">
		<thead class="thead-dark">
			<tr>
				<th scope="col">Identificacion</th>
				<th scope="col">Nombre</th>
				<th scope="col">Ciudad</th>
				<th scope="col">Aciones</th>
				
			</tr>
		</thead>
		<tbody>
		<c:forEach var="c" items="${cD1.listar()}">
			<tr>
				
				<td><c:out value="${c.inEstudiante}"/></td>
				<td><c:out value="${c.nombre}"/></td>
				<td><c:out value="${c.ciudad.getNombre()}"/></td>
				<td>
				  <form action="EstudianteControl" method="post">
            <input type="hidden" name="id" value="${c.inEstudiante}">
            <div style="text-align: center" class="form-group row">
              <div class="col-sm-12">
                <button type="submit" name="accion" value="editar"
                  class="btn btn-primary">Editar</button>
                <button type="submit" name="accion" value="eliminar"
                  class="btn btn-primary">Eliminar</button>
              </div>
            </div>
          </form>
          </td>
			</tr>

   </c:forEach>
		</tbody>
	

</body>

<nav>
	<footer class="page-footer font-small blue">
		<div class="footer-copyright text-center py-3">© 2020 Copyright:
			Javier Moncada Contacto: Javierandresmd@ufps.edu.co</div>
	</footer>
</nav>
</html>