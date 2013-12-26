
//Expense.jsp conditional input showing
function showInput(){
	var cbox = document.getElementById("expenseType");
	var str = cbox.options[cbox.selectedIndex].value;
	$("#component").addClass('hide');
	$("#lubricant").addClass('hide');
	$("#other").addClass('hide');
	$("#" + str.toLowerCase()).removeClass('hide');
	
	//if "other" also show cost input
	if(str.toLowerCase() == "other"){
		$("#cost").prop("disabled", false);
	}else{
		$("#cost").prop("disabled", true);
	}
	
	//clear all inputs
//	$("#cost").val('');
//	$("#quantity").val('');
//	$("#totalCost").val('');
};

//Update cost in Expense.jsp
function updateCost(field, elemId){
	//get current element id, then get the corresponding cost value (hidden)
	var elem = $("#" + elemId).val();
	var cost = $("#" + field +"_" + elem).val();
	$("#cost").val(cost);
	$("#quantity").val(1);
	$("#quantity").trigger("onchange");
};

//Update total cost in Expense.jsp
function updateTotalCost(elemId){
	var cost = $("#cost").val();
	var qtty = $("#quantity").val();
	$("#totalCost").val(cost * qtty);
};

//Trigger change events
$.subscribe('triggerChange', function(event, data) {
	$("#expenseType").trigger("onchange");
	$("#quantity").trigger("onchange");
});