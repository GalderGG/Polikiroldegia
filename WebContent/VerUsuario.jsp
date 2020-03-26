<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

<title>VerUsuario</title>
</head>
<body style="background:rgb(53, 53, 53)">
	<div class="container">
		<div class="row justify-content-center mt-5 text-light text-center">
			<div class="col">
				<div class="jumbotron jumbotron-fluid rounded bg-secondary">
					<div class="row">
						<div class="col">
   						 	<h1 class="display-4 ">${usuario.getNombreApellido()}</h1>
   						 </div>
   						 <div class="col">
   						 	<h1 class="display-4 "><b>ID: </b>${usuario.getId()}</h1>
   						 </div>
   					</div>
   					<br>
   					<div class="row">
   						<div class="col">
   							<div class="text-center mt-3">
                    		    <h1>DNI: ${usuario.getDni()}</h1>
                     		</div>
                     	</div>
                     	<br>
   						<div class="col">
   							<div class="text-center mt-3">
                    		    <h1>CODIGO: ${usuario.getCodigo()}</h1>
                     		</div>
                        </div>
                     </div>
                    <a class="btn btn-primary btn-lg mt-4" href="ActualizarUsuario?id=${usuario.getId()}" role="button">Editar</a>
                    <a class="btn btn-danger btn-lg mt-4" href="EliminarUsuario?id=${usuario.getId()}" role="button">Borrar</a>
  				</div>
  					<a class="btn btn-info btn-lg mt-4" href="VerUsuarios" role="button">Volver</a>
			</div>
		</div>	
	</div>
	</div>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>