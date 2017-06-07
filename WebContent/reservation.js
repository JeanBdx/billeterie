$(document).ready(function(){
	var i=1;
	$.ajax({
		type:"POST",
		url:"InfoReservation",
		contentType: "application/x-www-form-urlencoded; charset=utf-8",
		dataType: "json",
		data: {mode : 'info'},
		success:function(data,statut){
			
			$.each(data,function(index,element){
				
				$("#affichage_event").append("<div class='col-md-4 col-sm-6 portfolio-item'>"+
                "<a href='#portfolioModal"+i+"' class='portfolio-link' data-toggle='modal'>"+
                "<div class='portfolio-hover'>"+
                    "<div class='portfolio-hover-content'>"+
                        "<i class='fa fa-plus fa-3x'></i>"+
                   "</div>"+
                "</div>"+
                "<img src='img/"+element.informationEvent.typeEvent.toLowerCase()+".png' class='img-responsive' alt=''>"+
                "</a>"+
            	"<div class='portfolio-caption'>"+
               "<h4>"+element.informationEvent.nomEvent.toLowerCase()+"</h4>"+
                "<p class='text-muted'>"+element.lieux.localisation.toLowerCase()+"</p>"+
                "</div>"+
            	"</div>");
				
				
				$("#formReservationPlace").append("<div class='portfolio-modal modal fade' id='portfolioModal"+i+"' tabindex='-1' role='dialog' aria-hidden='true'>"+
				        "<div class='modal-dialog'>"+
			            "<div class='modal-content'>"+
			                "<div class='close-modal' data-dismiss='modal'>"+
			                   "<div class='lr'>"+
			                        "<div class='rl'>"+
			                        "</div>"+
			                    "</div>"+
			                "</div>"+
			               "<div class='container'>"+
			                   " <div class='row'>"+
			                        "<div class='col-lg-8 col-lg-offset-2'>"+
			                            "<div class='modal-body'>"+
			                                "<h2>"+ element.informationEvent.nomEvent.toLowerCase() +"</h2>"+
			                                "<p class='item-intro text-muted'>"+ element.lieux.localisation.toUpperCase() +"</p>"+
			                                "<p class='item-intro text-muted'>"+ element.informationEvent.dateEvent +"</p>"+
			                                "<p class='large text-muted'>"+ element.informationEvent.detailEvent.toLowerCase() +"</p>"+
			                                "<form action='Reservation' method='POST' >"+
			                                "<input type='hidden' id='id_event"+i+"' name='id_event' value='"+ element.uniqueID +"'/>"+
			                                "<select class='form-control form-control-lg' id='categorie"+i+"'  name='categorie' required>"+
			                                "<option selected disabled>Choississez votre Categorie</option>"+
			                                $.map(element.lieux.categories,function(current){
			                                	return ("<option>"+current.nomCategorie+"</option>");
			                                })                     
			                                +" </select>"+
			                               "</br>"+
			                                "<select class='form-control form-control-lg' id='zone"+i+"' name='zone' required>"+
			                                    "<option selected disabled>Choississez votre zone</option>"+
			                              " </select> "+
			                                "</br>"+
			                                 "<select class='form-control form-control-lg' id='rang"+i+"' name='rang' required >"+
			                                    "<option selected disabled>Choississez votre Rang</option>"+
			                                "</select> "+
			                                "</br>"+
			                                "<select class='form-control form-control-lg' id='place"+i+"' name='place' required>"+
			                                    "<option selected disabled>Choississez votre Place</option>"+
			                                "</select>"+ 
			                                "</br>"+
			                                "<hr></hr>"+
			                                "<h4> Informations concernant l'acheteur </h4>"+
			                                "<div class='form-group row'>"+
			                                      "<label for='example-text-input' class='col-2 col-form-label'>Civilite</label>"+
			                                      "<div class='col-10'>"+
			                                          "<input class='form-control' type='text' value='' id='Civilite_Acheteur"+i+"' name='Civilite_Acheteur' required>"+
			                                        "</div>"+
			                                    "</div>"+
			                                    "<div class='form-group row'>"+
			                                      "<label for='example-text-input' class='col-2 col-form-label'>Nom</label>"+
			                                      "<div class='col-10'>"+
			                                          "<input class='form-control' type='text' value='' id='Nom_Acheteur"+i+"' name='Nom_Acheteur' required>"+
			                                      "</div>"+
			                                  "</div>"+
			                                  "<div class='form-group row'>"+
			                                      " <label for='example-text-input' class='col-2 col-form-label'>Prénom</label>"+
			                                        "<div class='col-10'>"+
			                                            "<input class='form-control' type='text' value='' id='Prenom_Acheteur"+i+"' name='Prenom_Acheteur' required>"+
			                                        "</div>"+
			                                  "</div>"+
			                                  "<div class='form-group row'>"+
			                                      "<label for='example-text-input' class='col-2 col-form-label'>Adresse</label>"+
			                                        "<div class='col-10'>"+
			                                            "<input class='form-control' type='text' value='' id='Adresse_Acheteur"+i+"' name='Adresse_Acheteur' required>"+
			                                        "</div>"+
			                                    "</div>"+
			                                    "<div class='form-group row'>"+
			                                      "<label for='example-text-input' class='col-2 col-form-label'>Téléphone</label>"+
			                                        "<div class='col-10'>"+
			                                            "<input class='form-control'  type='tel' pattern='^((\+\d{1,3}(-| )?\(?\d\)?(-| )?\d{1,5})|(\(?\d{2,6}\)?))(-| )?(\d{3,4})(-| )?(\d{4})(( x| ext)\d{1,5}){0,1}$' value='' id='Tel_Acheteur"+i+"' name='Tel_Acheteur' >"+
			                                        "</div>"+
			                                    "</div> "+                               
			                                  "<div class='form-group row'>"+
			                                      "<label for='example-text-input' class='col-2 col-form-label'>Mail</label>"+
			                                      "<div class='col-10'>"+
			                                            "<input class='form-control' type='email' value='' id='Mail_Acheteur"+i+"' name='Mail_Acheteur' required>"+
			                                        "</div>"+
			                                    "</div>"+
			                                   "<div class='checkbox'>"+
			                                    "<label>"+
			                                      "<input type='checkbox' name='Bouton_Different' id='Bouton_Different"+i+"' value='different'> L'acheteur et le détenteur du billet sont identiques"+
			                                    "</label>"+
			                                  "</div>"+
			                                "<div id='Detenteur_Billet"+i+"' >"+
			                                    "<hr> </hr>"+
			                                    "<h4> Informations concernant le détenteur du billet </h4>"+
			                                   "<div class='form-group row'>"+
			                                            "<label for='example-text-input' class='col-2 col-form-label'>Civilite</label>"+
			                                            "<div class='col-10'>"+
			                                              "  <input class='form-control' type='text' value='' id='Civilite_Billet"+i+"' name='Civilite_Billet'>"+
			                                          "  </div>"+
			                                      "  </div>"+
			                                      "  <div class='form-group row'>"+
			                                          "  <label for='example-text-input' class='col-2 col-form-label'>Nom</label>"+
			                                          "  <div class='col-10'>"+
			                                                "<input class='form-control' type='text' value='' id='Nom_Billet"+i+"' name='Nom_Billet'>"+
			                                            "</div>"+
			                                        "</div>"+
			                                      "  <div class='form-group row'>"+
			                                          "  <label for='example-text-input' class='col-2 col-form-label'>Prénom</label>"+
			                                          "  <div class='col-10'>"+
			                                                "<input class='form-control' type='text' value='' id='Prenom_Billet"+i+"' name='Prenom_Billet'>"+
			                                            "</div>"+
			                                        "</div>"+
			                                "</div>"+
			                                "<button type='submit' class='btn btn-primary'><i class='fa fa-times'></i> Valider </button>"+
			                                  "<button type='button' class='btn btn-primary' data-dismiss='modal' href='IdentiteAcheteur.html'><i class='fa fa-times'></i> Revenir aux événèments</button>"+
			                                  "</form>"+
			                                  "</div>"+
			                        "</div>"+
			                    "</div>"+
			              "  </div>"+
			            "</div>"+
			        "</div>"+
			    "</div>");
		
			
			
			    i++;
			
				
			});
				
		}
	});


});	

$(document).on('click','input[name="Bouton_Different"]', function() {
   $.identifiant =   $(this).attr('id');
   $.identifiantBlock = $.identifiant.substring($.identifiant.length, $.identifiant.length-1);
    if (this.checked) {
    	 $("#Detenteur_Billet"+$.identifiantBlock).hide();
    } else {
    	 $("#Detenteur_Billet"+$.identifiantBlock).show();
    }
});

$(document).on('change','select[name="categorie"]', function() {
	   $.identifiant =   $(this).attr('id');
	   $.identifiantBlock = $.identifiant.substring($.identifiant.length, $.identifiant.length-1);
	   $.idEvent = $("#id_event"+$.identifiantBlock).val();
	   $.nomCategorie = $(this).val();
	   $("#zone"+ $.identifiantBlock).empty();
	   $("#zone"+ $.identifiantBlock).append("<option selected disabled>Choississez votre Zone</option>");
	   $.ajax({
			type:"POST",
			url:"InfoReservation",
			contentType: "application/x-www-form-urlencoded; charset=utf-8",
			dataType: "json",
			data: {mode : 'getZone', idEvent : $.idEvent, nomCategorie : $.nomCategorie}, 
			success:function(data,statut){
				$.each(data,function(index,element){
					console.log(data)
					$("#zone"+ $.identifiantBlock).append($('<option>', {
						text: data[index]
					}));
				})
			
			}
	   });
	});


$(document).on('change','select[name="zone"]', function() {
	   $.identifiant =   $(this).attr('id');
	   $.identifiantBlock = $.identifiant.substring($.identifiant.length, $.identifiant.length-1);
	   $.idEvent = $("#id_event"+$.identifiantBlock).val();
	   $.nomCategorie = $("#categorie"+$.identifiantBlock).val();
	   $.nomZone =  $(this).val();
	   $("#rang"+ $.identifiantBlock).empty();
	   $("#rang"+ $.identifiantBlock).append("<option selected disabled>Choississez votre Rang</option>");
	   $.ajax({
			type:"POST",
			url:"InfoReservation",
			contentType: "application/x-www-form-urlencoded; charset=utf-8",
			dataType: "json",
			data: {mode : 'getRang', idEvent : $.idEvent, nomCategorie : $.nomCategorie, nomZone : $.nomZone }, 
			success:function(data,statut){
				$.each(data,function(index,element){
					console.log(data)
					$("#rang"+ $.identifiantBlock).append($('<option>', {
						text: data[index]
					}));
				})
			
			}
	   });
	});


$(document).on('change','select[name="rang"]', function() {
	   $.identifiant =   $(this).attr('id');
	   $.identifiantBlock = $.identifiant.substring($.identifiant.length, $.identifiant.length-1);
	   $.idEvent = $("#id_event"+$.identifiantBlock).val();
	   $.nomCategorie = $("#categorie"+$.identifiantBlock).val();
	   $.nomZone = $("#zone"+$.identifiantBlock).val(); 
	   $.nomRang = $(this).val();
	   $("#place"+ $.identifiantBlock).empty();
	   $("#place"+ $.identifiantBlock).append("<option selected disabled>Choississez votre Place</option>");
	  
	   $.ajax({
			type:"POST",
			url:"InfoReservation",
			contentType: "application/x-www-form-urlencoded; charset=utf-8",
			dataType: "json",
			data: {mode : 'getPlace', idEvent : $.idEvent, nomCategorie : $.nomCategorie, nomZone : $.nomZone, nomRang : $.nomRang}, 
			success:function(data,statut){
				$.each(data,function(index,element){
					console.log(data)
					$("#place"+ $.identifiantBlock).append($('<option>', {
						text: data[index]
					}));
				})
			
			}
	   });
	});

