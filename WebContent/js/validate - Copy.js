$(document).ready(function() {
	
	/*
	var response;
	$.get( "index.html", function ( r ) {
		response = r;
		console.log( r );
	});
	*/
	/*
	$("#frmApply").click (function() {
		/* stop form from submitting normally */
	/*
		  event.preventDefault();
		$.ajax ({
			url: "apply",
			data: $("#frmApply").serialize(),
			type: "GET",
			dataType : "json",
			
			success: function ( json ) {
				alert(json);
			},
			
			error: function ( xhr, status) {
				alert("Sorry, there was a problem");
			},
			
			complete: function ( xhr, status ){
				alert("The request is complete");
			}
		});
		
	});
	*/
    $('#frmApply').click(function(event) {
    	    	//var dataString = {"txtCompanyName": $("#txtCompanyName").val()};
    	//var dataString ={"amount":amount,"from":from,"to":to};
    	var txtCompanyName = $("#txtCompanyName").val();
    	var txtEmail = $("txtEmail").val();
    	var txtWebSite = $("txtWebSite").val();
    	var txtPhoneNo = $("txtPhoneNo").val();
    	var txtContactPerson = $("txtContactPerson").val();
    	var txtAddress = $("txtAddress").val();
    	var txtSalary = $("txtSalary").val();    	
    	
    	/*
    	var dataString = {
    			"txtCompanyName" : txtCompanyName, "txtEmail" : txtEmail, "txtWebSite" : txtWebSite, "txtPhoneNo" : txtPhoneNo, "txtContactPerson" : txtContactPerson,
    			"txtAddress" : txtAddress, "txtSalary" : txtSalary
    			 }    
       */	
    	//alert($('#frmApply').serialize());
    	var dataString = "txtCompanyName=aa&txtEmail=bb";
    	//e.preventDefault();
    	$.ajax({
    		url: "apply",
    	    type: "POST",    	
    	    async: false,
    	    data: dataString,
    	    success: function(data) {
    	    	alert(data);
    	        //$('#results').show();
    	       // $('#results').html(data);
    	    }
    	});
    	 
    	
    });  
      
      
    	
	
});