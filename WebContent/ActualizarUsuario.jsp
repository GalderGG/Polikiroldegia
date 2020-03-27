<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

<title>ActualizarUsuario</title>
</head>
<body style="background:rgb(53, 53, 53)">
	<div class="container">
		<h1 class="text-center text-white">Actualizar usuario</h1>
		<div class="row justify-content-center">
			<div class="col-8">
				<form action="ModificarUsuario" method="POST">
					<input type="hidden" name="id" value="${usuario.getId()}">
					<div class="form-group text-white">
						<label for="nombre">Nombre y apellido:</label> 
						<input type="text" class="form-control" id="nombreApellido" name="nombreApellido" value="${usuario.getNombreApellido()}">
					</div>
					<div class="form-group text-white">
						<label for="dias_semana">DNI:</label> 
						<input type="text" class="form-control" id="dni" name="dni" value="${usuario.getDni()}">
					</div>
					<div class="form-group text-white">
						<label for="dias_semana">Codigo:</label> 
						<input type="text" class="form-control" id="codigo" name="codigo" value="${usuario.getCodigo()}">
					</div>
					<br>
					<button type="submit" class="btn btn-success">Submit</button>
					<a class="btn btn-danger btn-md text-white" href="VerUsuarios">Cancelar</a>
				</form>
			</div>
		</div>
	</div>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" ntegrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>