
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="fr">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">


    <!-- Bootstrap Core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>

    <!-- Theme CSS -->
    <link href="css/agency.min.css" rel="stylesheet">
    <link href="css/agency.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js" integrity="sha384-0s5Pv64cNZJieYFkXYOTId2HMA2Lfb6q2nAcx2n0RTLUnCAoTTsS0nKEO27XyKcY" crossorigin="anonymous"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js" integrity="sha384-ZoaMbDF+4LeFxg6WdScQ9nnR1QC2MIRxA1O9KWEXQwns1G8UNyIEZIQidzb0T1fo" crossorigin="anonymous"></script>
    <![endif]-->

</head>

<body id="page-top" class="index">

<nav id="mainNav" class="navbar navbar-default navbar-custom navbar-fixed-top">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header page-scroll">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span> Menu <i class="fa fa-bars"></i>
                </button>
                <a class="navbar-brand page-scroll" href="index.html">MyLittleTicket</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li class="hidden">
                        <a href="#page-top"></a>
                    </li>
                    <li>
                        <a class="page-scroll" href="Reservation.html">Réservation</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="Contact.html">Qui sommes nous ?</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="Connexion.html">Connexion</a>
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
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2 class="section-heading">Evènements</h2>
                    <h3 class="section-subheading text-muted">Les évènements au plus près de chez vous</h3>
                </div>
            </div>
            <div class="row">
                <div class="col-md-4 col-sm-6 portfolio-item">
                    <a href="#portfolioModal1" class="portfolio-link" data-toggle="modal">
                        <div class="portfolio-hover">
                            <div class="portfolio-hover-content">
                                <i class="fa fa-plus fa-3x"></i>
                            </div>
                        </div>
                        <img src="img/americain.png" class="img-responsive" alt="">
                    </a>
                    <div class="portfolio-caption">
                        <h4>FOOTBALL AMERICAIN</h4>
                        <p class="text-muted">Toulouse</p>
                    </div>
                </div>
                <div class="col-md-4 col-sm-6 portfolio-item">
                    <a href="#portfolioModal2" class="portfolio-link" data-toggle="modal">
                        <div class="portfolio-hover">
                            <div class="portfolio-hover-content">
                                <i class="fa fa-plus fa-3x"></i>
                            </div>
                        </div>
                        <img src="img/ballet.png" class="img-responsive" alt="">
                    </a>
                    <div class="portfolio-caption">
                        <h4>LES 4 SAISONS DE VIVALDI</h4>
                        <p class="text-muted">Bordeaux</p>
                    </div>
                </div>
                <div class="col-md-4 col-sm-6 portfolio-item">
                    <a href="#portfolioModal3" class="portfolio-link" data-toggle="modal">
                        <div class="portfolio-hover">
                            <div class="portfolio-hover-content">
                                <i class="fa fa-plus fa-3x"></i>
                            </div>
                        </div>
                        <img src="img/natation.png" class="img-responsive" alt="">
                    </a>
                    <div class="portfolio-caption">
                        <h4>CHAMPIONNAT DE NATATION</h4>
                        <p class="text-muted">Schiltighein</p>
                    </div>
                </div>
                <div class="col-md-4 col-sm-6 portfolio-item">
                    <a href="#portfolioModal4" class="portfolio-link" data-toggle="modal">
                        <div class="portfolio-hover">
                            <div class="portfolio-hover-content">
                                <i class="fa fa-plus fa-3x"></i>
                            </div>
                        </div>
                        <img src="img/velo.png" class="img-responsive" alt="">
                    </a>
                    <div class="portfolio-caption">
                        <h4>ARRIVEE DU TOUR DE FRANCE</h4>
                        <p class="text-muted">Paris - Champs Elysées</p>
                    </div>
                </div>
                <div class="col-md-4 col-sm-6 portfolio-item">
                    <a href="#portfolioModal5" class="portfolio-link" data-toggle="modal">
                        <div class="portfolio-hover">
                            <div class="portfolio-hover-content">
                                <i class="fa fa-plus fa-3x"></i>
                            </div>
                        </div>
                        <img src="img/foot.png" class="img-responsive" alt="">
                    </a>
                    <div class="portfolio-caption">
                        <h4>FOOTBALL : LYON - NICE</h4>
                        <p class="text-muted">Lyon</p>
                    </div>
                </div>
                <div class="col-md-4 col-sm-6 portfolio-item">
                    <a href="#portfolioModal6" class="portfolio-link" data-toggle="modal">
                        <div class="portfolio-hover">
                            <div class="portfolio-hover-content">
                                <i class="fa fa-plus fa-3x"></i>
                            </div>
                        </div>
                        <img src="img/concert.png" class="img-responsive" alt="">
                    </a>
                    <div class="portfolio-caption">
                        <h4>CONCERT DE JUSTIN BIEBER</h4>
                        <p class="text-muted">???</p>
                    </div>
                </div>
            </div>
        </div>
    </section>

  

    <!-- Portfolio Modals -->
    <!-- Use the modals below to showcase details about your portfolio projects! -->

    <!-- Portfolio Modal 1 -->
    <div class="portfolio-modal modal fade" id="portfolioModal1" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="close-modal" data-dismiss="modal">
                    <div class="lr">
                        <div class="rl">
                        </div>
                    </div>
                </div>
                <div class="container">
                    <div class="row">
                        <div class="col-lg-8 col-lg-offset-2">
                            <div class="modal-body">
                                <!-- Project Details Go Here -->
                                <h2>FOOTBALL AMERICAIN</h2>
                                <p class="item-intro text-muted">Stade de Toulouse</p>
                                <p class="item-intro text-muted">Le 18 Aout 2017</p>
                                <p> METTRE UNE DESCRIPTION EVENEMENT</p>


                                <form>
                                <input type="hidden" id="id_event" name="id_event" value="A DETERMINER DANS LE CODE"/>
                                <select class="form-control form-control-lg" id="categorie">
                                    <option>Choississez votre catégorie</option>
                                </select>  
                                </br>
                                <select class="form-control form-control-lg" id="zone">
                                    <option>Choississez votre zone</option>
                                </select> 
                                </br>
                                 <select class="form-control form-control-lg" id="place">
                                    <option>Choississez votre Rang</option>
                                </select> 
                                </br>
                                <select class="form-control form-control-lg" id="place">
                                    <option>Choississez votre Place</option>
                                </select> 
                                </br>
                                </form>

                                <hr> </hr>

                                <h4> Informations concernant l'acheteur </h4>
                                <form>
                                	<div class="form-group row">
                                        <label for="example-text-input" class="col-2 col-form-label">Civilite</label>
                                        <div class="col-10">
                                            <input class="form-control" type="text" value="" id="Civilite_Acheteur">
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label for="example-text-input" class="col-2 col-form-label">Nom</label>
                                        <div class="col-10">
                                            <input class="form-control" type="text" value="" id="Nom_Acheteur">
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label for="example-text-input" class="col-2 col-form-label">Prénom</label>
                                        <div class="col-10">
                                            <input class="form-control" type="text" value="" id="Prenom_Acheteur">
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label for="example-text-input" class="col-2 col-form-label">Adresse</label>
                                        <div class="col-10">
                                            <input class="form-control" type="text" value="" id="Adresse_Acheteur">
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label for="example-text-input" class="col-2 col-form-label">Téléphone</label>
                                        <div class="col-10">
                                            <input class="form-control" type="text" value="" id="Tel_Acheteur">
                                        </div>
                                    </div>                                
                                    <div class="form-group row">
                                        <label for="example-text-input" class="col-2 col-form-label">Mail</label>
                                        <div class="col-10">
                                            <input class="form-control" type="text" value="" id="Mail_Acheteur">
                                        </div>
                                    </div>


                                    <div class="form-check">
                                        <label class="form-check-label">
                                            <input type="radio" class="form-check-input" name="Bouton_Different" id="Bouton_Different" value="different">
                                            L'acheteur et le détenteur du billet sont différents
                                        </label>
                                    </div>
                                </form>


                                <div id="Detenteur_Billet" >
                                    <hr> </hr>
                                    <h4> Informations concernant le détenteur du billet </h4>

                                    <form>
                                     <div class="form-group row">
                                            <label for="example-text-input" class="col-2 col-form-label">Civilite</label>
                                            <div class="col-10">
                                                <input class="form-control" type="text" value="" id="Civilite_Billet">
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label for="example-text-input" class="col-2 col-form-label">Nom</label>
                                            <div class="col-10">
                                                <input class="form-control" type="text" value="" id="Nom_Billet">
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label for="example-text-input" class="col-2 col-form-label">Prénom</label>
                                            <div class="col-10">
                                                <input class="form-control" type="text" value="" id="Prenom_Billet">
                                            </div>
                                        </div>
                                    </form>
                                </div>

                                <button type="button" class="btn btn-primary"><i class="fa fa-times"></i> Valider </button>

                                <button type="button" class="btn btn-primary" data-dismiss="modal" href="IdentiteAcheteur.html"><i class="fa fa-times"></i> Revenir aux événèments</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Portfolio Modal 2 -->
    <div class="portfolio-modal modal fade" id="portfolioModal2" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="close-modal" data-dismiss="modal">
                    <div class="lr">
                        <div class="rl">
                        </div>
                    </div>
                </div>
                <div class="container">
                    <div class="row">
                        <div class="col-lg-8 col-lg-offset-2">
                            <div class="modal-body">
                                <h2>LES 4 SAISONS DE VIVALDI</h2>
                                <p class="item-intro text-muted">Grand Théâtre de Bordeaux</p>
                                <p class="item-intro text-muted">Le 13 Octobre 2017</p>
                                <!--<img class="img-responsive img-centered" src="img/portfolio/startup-framework-preview.png" alt="">-->
                                <p> METTRE UNE DESCRIPTION EVENEMENT</p>
                                <button type="button" class="btn btn-primary" data-dismiss="modal"><i class="fa fa-times"></i> Revenir aux événèments</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Portfolio Modal 3 -->
    <div class="portfolio-modal modal fade" id="portfolioModal3" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="close-modal" data-dismiss="modal">
                    <div class="lr">
                        <div class="rl">
                        </div>
                    </div>
                </div>
                <div class="container">
                    <div class="row">
                        <div class="col-lg-8 col-lg-offset-2">
                            <div class="modal-body">
                                <!-- Project Details Go Here -->
                                <h2>CHAMPIONNAT DE FRANCE DE NATATION</h2>
                                <p class="item-intro text-muted">Schiltigheim</p>
                                <p class="item-intro text-muted">Du 23 au 28 Mai 2017</p>
                                <p> METTRE UNE DESCRIPTION EVENEMENT</p>
                                <button type="button" class="btn btn-primary" data-dismiss="modal"><i class="fa fa-times"></i> Revenir aux événèments</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Portfolio Modal 4 -->
    <div class="portfolio-modal modal fade" id="portfolioModal4" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="close-modal" data-dismiss="modal">
                    <div class="lr">
                        <div class="rl">
                        </div>
                    </div>
                </div>
                <div class="container">
                    <div class="row">
                        <div class="col-lg-8 col-lg-offset-2">
                            <div class="modal-body">
                                <!-- Project Details Go Here -->
                                <h2>ARRIVEE DU TOUR DE FRANCE SUR LES CHAMPS ELYSEES</h2>
                                <p class="item-intro text-muted"> Paris</p>
                                <p class="item-intro text-muted"> METTRE LA DATE</p>
                                <p> METTRE UNE DESCRIPTION EVENEMENT</p>
                                <button type="button" class="btn btn-primary" data-dismiss="modal"><i class="fa fa-times"></i> Revenir aux événèments</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Portfolio Modal 5 -->
    <div class="portfolio-modal modal fade" id="portfolioModal5" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="close-modal" data-dismiss="modal">
                    <div class="lr">
                        <div class="rl">
                        </div>
                    </div>
                </div>
                <div class="container">
                    <div class="row">
                        <div class="col-lg-8 col-lg-offset-2">
                            <div class="modal-body">
                                <!-- Project Details Go Here -->
                                <h2>CONCERT DE </h2>
                                <p class="item-intro text-muted"> LIEU</p>
                                <p class="item-intro text-muted"> DATE</p>
                                <p> METTRE UNE DESCRIPTION EVENEMENT</p>
                                <button type="button" class="btn btn-primary" data-dismiss="modal"><i class="fa fa-times"></i> Revenir aux événèments</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Portfolio Modal 6 -->
    <div class="portfolio-modal modal fade" id="portfolioModal6" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="close-modal" data-dismiss="modal">
                    <div class="lr">
                        <div class="rl">
                        </div>
                    </div>
                </div>
                <div class="container">
                    <div class="row">
                        <div class="col-lg-8 col-lg-offset-2">
                            <div class="modal-body">
                                <!-- Project Details Go Here -->
                                <h2>Project Name</h2>
                                <p class="item-intro text-muted">Lorem ipsum dolor sit amet consectetur.</p>
                                <p> METTRE UNE DESCRIPTION EVENEMENT</p>
                                <button type="button" class="btn btn-primary" data-dismiss="modal"><i class="fa fa-times"></i> Revenir aux événèments</button>
                            </div>
                        </div>
                    </div>
                    <button type="button" class="btn btn-primary" data-dismiss="modal"><i class="fa fa-times"></i> Revenir à l'accueil</button>
                </div>
            </div>
        </div>
    </div>


    <!-- Acheteur / Détenteur du billet -->
    
    <!-- jQuery -->
    <script src="vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js" integrity="sha384-mE6eXfrb8jxl0rzJDBRanYqgBxtJ6Unn4/1F7q4xRRyIw7Vdg9jP4ycT7x1iVsgb" crossorigin="anonymous"></script>

    <!-- Contact Form JavaScript -->
    <script src="js/jqBootstrapValidation.js"></script>
    <script src="js/contact_me.js"></script>

    <!-- Theme JavaScript -->
    <script src="js/agency.min.js"></script>
    <script src="script.js"></script>
    
    <SCRIPT type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js"></SCRIPT>
 
<script type="text/javascript">
 
$(document).ready( function () { 
		$.ajax({ // fonction permettant de faire de l'ajax
		   type: "POST",
		   url: "/InfoReservation",
		   success: function(data){
			alert(data)
		   }
		});
		return false; // permet de rester sur la même page à la soumission du formulaire

});
 
</script>
    
    

</body>

</html>
