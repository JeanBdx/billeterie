$('#input_categories').bind('input', function(){
	boucle = 1;
	$("#blocs").empty();
	while(boucle <= $(this).val()){
		$("#blocs").append('<hr />');
		$("#blocs").append("<div class='col-10' id='"+boucle+"'> <h6> Informations de la catégorie "+boucle+" </h6><label for='example-number-input_"+boucle+"' class='col-2 col-form-label'>Nom de la catégorie</label><div class='col-10'><input class='form-control' type='text' value='' name='label_categorie_"+boucle+"' id='label_categorie_"+boucle+"'></div><label for='example-number-input_"+boucle+"' class='col-2 col-form-label'>Nombre de zones</label><div class='col-10'><input class='form-control' type='number' value='0' id='nrb_zones_"+boucle+"' name='nrb_zones_"+boucle+"' min='0'><div id='prix_zone_"+boucle+"'></div></div><label for='example-number-input_"+boucle+"' class='col-2 col-form-label'>Nombre de rangs</label><div class='col-10'><input class='form-control' type='number' value='0' id='nrb_rangs_"+boucle+"' name='nrb_rangs_"+boucle+"' min='0'></div><label for='example-number-input_"+boucle+"' class='col-2 col-form-label'>Nombre de places</label><div class='col-10'><input class='form-control' type='number' value='0' id='nrb_places_"+boucle+"' name='nrb_places_"+boucle+"' min='0'></div></div>")
		boucle++;

	}
});

$(document).on('input',"input[name^='nrb_zones']",function(){
	idBloc = document.activeElement.id;
	idBloc = idBloc.substr(-1,1);
	boucle = 1;
	
	$("#prix_zone_"+idBloc).empty();
	while(boucle <= $(this).val()){
	console.log(document.activeElement.id)

	$("#prix_zone_"+idBloc).append("<div class='col-5' id='prix_zone_"+boucle+"'><label for='prix_place_"+boucle+"' class='col-2 col-form-label'>Prix de la zone "+boucle+" </label><div class='col-10'><input class='form-control' type='text' value=' ' name='prix_place_"+boucle+"' id='prix_place_"+boucle+"'></div></div>");
	boucle++;
	
	}


});

