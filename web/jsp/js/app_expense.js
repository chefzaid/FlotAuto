
//Expense.jsp conditional input showing
function showInput(){
	var cbox = document.getElementById("expenseType");
	var str = cbox.options[cbox.selectedIndex].value;
	$("#component").addClass('hide');
	$("#labor").addClass('hide');
	$("#other").addClass('hide');
	$("#" + str.toLowerCase()).removeClass('hide');
};

//Update cost in Expense.jsp
function updateCost(elemId){
	//get the element value "id:price", splits it, assign the cost
	var cost = $("#" + elemId).val().split(":")[1];
	$("#cost").val(cost);
};

//Update total cost in Expense.jsp
function updateTotalCost(elemId){
	var cost = $("#cost").val();
	var qtty = $("#quantity").val();
	$("#totalCost").val(cost * qtty);
};
