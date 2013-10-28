
//Expense.jsp conditional input showing
function showInput(){
	var cbox = document.getElementById("expenseType");
	var str = cbox.options[cbox.selectedIndex].value;
	$("#component").addClass('hide');
	$("#labor").addClass('hide');
	$("#other").addClass('hide');
	$("#" + str.toLowerCase()).removeClass('hide');
};

//Update price in Expense.jsp
function updatePrice(elemId){
	//get current component id, then get the corresponding hidden field price
	var id = $("#" + elemId).val();
	var cost = $("#price_" + id).val();
	$("#cost").val(cost);
};
//Update salary in Expense.jsp
function updateSalary(elemId){
	//get current employee id, then get the corresponding hidden field salary
	var id = $("#" + elemId).val();
	var cost = $("#salary_" + id).val();
	$("#cost").val(cost);
};

//Update total cost in Expense.jsp
function updateTotalCost(elemId){
	var cost = $("#cost").val();
	var qtty = $("#quantity").val();
	$("#totalCost").val(cost * qtty);
};
