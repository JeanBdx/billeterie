$(document).ready(function(){
	$.ajax({
		method:"POST",
		url:"InfoLieux",
		success:function(data,statut){
			$.each(data,function(index,element){
				console.log(data)
				$("#lieuxEvent").append($('<option>', {
					text: element.localisation,
					id: element.uniqueID
				}));
			})
		}
	})
});	

$("#formCreateEvent").submit(function(event){
	event.preventDefault();
	$data = ($(this).serialize())
	$data += "&idLieux="+ encodeURIComponent($("#lieuxEvent option:selected").attr('id'));
	$.ajax({
		method:"POST",
		url:"CreationEvent",
		data: $data,
		success:function(donnee,statut){
			if(donnee == "ok"){
				$(location).attr('href','AdminChoix.html');
			}
			
		}
	})
	
});

