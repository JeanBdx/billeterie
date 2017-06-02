<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ page session="true" %>
<!DOCTYPE html>
<html lang="fr">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">



<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700"
	rel="stylesheet" type="text/css">
<link href='https://fonts.googleapis.com/css?family=Kaushan+Script'
	rel='stylesheet' type='text/css'>
<link
	href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic'
	rel='stylesheet' type='text/css'>
<link
	href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700'
	rel='stylesheet' type='text/css'>

<!-- Theme CSS -->
<link href="css/agency.min.css" rel="stylesheet">
<link href="css/agency.css" rel="stylesheet">


</head>
<% if(session.getAttribute("sessionUtilisateur") != null){ %>
<body id="page-top" class="index">

	<nav id="mainNav"
		class="navbar navbar-default navbar-custom navbar-fixed-top">
		<div class="container">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header page-scroll">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> Menu <i
						class="fa fa-bars"></i>
				</button>
				<a class="navbar-brand page-scroll" href="index.html">MyLittleTicket</a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav navbar-right">
					<li class="hidden"><a href="#page-top"></a></li>
					<li><a class="page-scroll" href="AdminChoix.jsp">Accueil
							administrateur</a></li>
					<li><a class="page-scroll" href="Deconnexion">Deconnexion</a>
					</li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid -->
	</nav>

	<!-- Portfolio Grid Section -->
	<section id="portfolio" class="bg-light-gray">
		<div class="container">
			<h4>Creation d'un lieu</h4>
			<BR />
			<form action="CreationLieu" method="post">

				<div class="form-group row">
					<label for="example-text-input" class="col-2 col-form-label">Lieu</label>
					<div class="col-10">
						<input class="form-control" type="text" value="" id="label_lieu"
							name="localisation" required>
					</div>
				</div>

				<div class="form-group row">
					<label for="example-number-input" class="col-2 col-form-label">Nombre
						de catégories</label>
					<div class="col-10">
						<input class="form-control" type="number" name="nbCategorie"
							id="input_categories" name="nbCategorie" min="1" required>
					</div>
				</div>

				<!--Bloc crÃ©ation catÃ©gorie-->
				<div class="col-10">

					<div class="form-group row" id="blocs"></div>
					<div class="text-center">
						<input type="submit" class="btn btn-warning" id="submitLieux">
					</div>
			</form>


		</div>
	</section>





	<!-- jQuery -->
	<script src="vendor/jquery/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>

	<!-- Plugin JavaScript -->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"
		integrity="sha384-mE6eXfrb8jxl0rzJDBRanYqgBxtJ6Unn4/1F7q4xRRyIw7Vdg9jP4ycT7x1iVsgb"
		crossorigin="anonymous"></script>

	<!-- Contact Form JavaScript -->
	<script src="js/jqBootstrapValidation.js"></script>
	<script src="js/contact_me.js"></script>

	<!-- Theme JavaScript -->
	<script src="js/agency.min.js"></script>
	<script src="lieu.js"></script>

</body>
<% }; %>
</html>
