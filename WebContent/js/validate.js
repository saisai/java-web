$(document).ready(function() {

   $('form[name="frmApply"]').submit(function(){
	var data_form = $(this).serialize();
	$.ajax({
	       type: 'POST',
	       url:'apply',
	       data:data_form,
	       success:function(response){
		   if(response=="error") {
		     $('#content').html('Error processing the form!');
		   }
		   else {
		     $('#content').html('Insert ID: '+ response);
		   }
	       }
	});		
	return false;
    });
 
});
