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
				
				$("#supprEvent").append($('<option>', {
					text: element.informationEvent.nomEvent.toUpperCase(),
					id: element.uniqueID
				}));
			
			});
		}
	});
});


$("#deleteEvent").submit(function(event){
	event.preventDefault();
	$data = "idEvent="+ encodeURIComponent($("#supprEvent option:selected").attr('id'));
	$.ajax({
		method:"POST",
		url:"SupprimerEvent",
		data: $data,
		success:function(donnee,statut){
			if(donnee == "ok"){
				$(location).attr('href','AdminChoix.jsp');
			}
			
		}
	})
	
});




$("#deleteLieu").submit(function(event){
	event.preventDefault();
	$data = "idLieu="+ encodeURIComponent($("#lieuxEvent option:selected").attr('id'));
	$.ajax({
		method:"POST",
		url:"SupprimerLieu",
		data: $data,
		success:function(donnee,statut){
			if(donnee == "ok"){
				$(location).attr('href','AdminChoix.jsp');
			}
			
		}
	})
	
});
