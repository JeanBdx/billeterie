$(document).ready(function(){
	alert("jo")
	if ($("#Bouton_Different").checked() == true){
		$("#Detenteur_Billet").css('visibility', 'visible');
	}
	else {
		$("#Detenteur_Billet").css('visibility', 'hidden');
	}
})
