//data table
$(document).ready(function() {
	    $('#example').DataTable();
	    //$("#txtPid").val('');
} );


//check status for alert	
var status = $('#status').val();
//console.log("status 2 : = "+status);
if(status == 'save'){
	showAlert("data is saved properly");
}else if(status == 'update'){
	showAlert("data is update properly");
}else if(status == 'delete'){
	showAlert("data is delete properly");
}else if(status == 'error'){
	showErrorAlert("unable to complete transaction");
}

//get table row data when click td
$(document).on('click', '.action', function(){ 
	var count =0;
    var $row = $(this).closest("tr");    // Find the row
    var $tds = $row.find("td");
    $.each($tds, function() {
    	//console.log("val : "+count+"\t"+$(this).text());
        if(count == 1){
        	$("#pid").val($(this).text());
        }else if(count == 3){
        	$("#two").val($(this).text());
        }else if(count == 4){
        	$("#three").val($(this).text());
        }else if(count == 5){
        	$("#four").val($(this).text());
        }else if(count == 6){
        	$("#five").val($(this).text());
        }else if(count == 7){
        	$("#six").val($(this).text());
        }else if(count == 8){
        	$("#seven").val($(this).text());
        }else if(count == 9){
        	$("#eight").val($(this).text());
        }else if(count == 10){
        	$("#nine").val($(this).text());
        }else if(count == 11){
        	$("#ten").val($(this).text());
        }else if(count == 12){
        	$("#eleven").val($(this).text());
        }
        count++;
    });
});


//alert message
function showAlert(msg) {
	var dom = '<div class="top-alert"><div class="alert alert-success alert-dismissible fade show"><button type="button" class="close" data-dismiss="alert">&times;</button><strong>Success!</strong> ' + msg + ' </div></div>';
	var jdom = $(dom);
	jdom.hide();
	$("body").append(jdom);
	jdom.fadeIn();
	setTimeout(function() {
		jdom.fadeOut(function() {
			jdom.remove();
		});
	}, 3000);
}
function showErrorAlert(msg) {
	var dom = '<div class="top-alert"><div class="alert alert-danger alert-dismissible fade show"><button type="button" class="close" data-dismiss="alert">&times;</button><strong>Error!</strong> ' + msg + ' </div></div>';
	var jdom = $(dom);
	jdom.hide();
	$("body").append(jdom);
	jdom.fadeIn();
	setTimeout(function() {
		jdom.fadeOut(function() {
			jdom.remove();
		});
	}, 3000);
}

$('#isAutoPid').click(function() {
    if($(this).is(':checked')){
    	$("#dpid").hide(1000);
    	$("#txtPid").val('a');
    }else{
    	$("#dpid").show(1000);
    	$("#txtPid").val('');
    }
});
    
