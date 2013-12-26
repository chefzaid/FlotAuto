package net.sas.model.service;

import java.util.List;

import net.sas.model.bo.Component;
import net.sas.model.bo.Expense;
import net.sas.model.bo.ExpenseComponent;
import net.sas.model.bo.ExpenseLubricant;
import net.sas.model.bo.ExpenseOther;
import net.sas.model.bo.Lubricant;

public class ExpenseService extends GenericService<Expense> {

	public ExpenseService() {
		super("expenseDao");
	}

	public ExpenseService(String dao) {
		super(dao);
	}

	@Override
	public void save(Expense e) {
		saveExpenseOther(0, "", 0.0, 0);
	}

	public void saveExpenseComponent(Integer expenseId, Integer componentId,
			Integer quantity) {
		Component c = new ComponentService().findById(componentId);

		ExpenseComponent ec = new ExpenseComponent();
		ec.setId(expenseId);
		ec.setComponent(c);
		ec.setQuantity(quantity);

		new ExpenseService("expenseComponentDao");
		if(expenseId == null){
			dao.create(ec);
			index++;
		}else if(expenseId != null){
			dao.update(ec);
		}

		refresh();
	}

	public void saveExpenseLubricant(Integer expenseId, Integer lubricantId,
			Integer quantity) {
		Lubricant lub = new LubricantService().findById(lubricantId);

		ExpenseLubricant el = new ExpenseLubricant();
		el.setId(expenseId);
		el.setLubricant(lub);
		el.setQuantity(quantity);

		new ExpenseService("expenseLubricantDao");
		if(expenseId == null){
			dao.create(el);
			index++;
		}else if(expenseId != null){
			dao.update(el);
		}
		
		refresh();
	}

	public void saveExpenseOther(Integer expenseId, String description,
			Double cost, Integer quantity) {
		ExpenseOther eo = new ExpenseOther();
		eo.setId(expenseId);
		eo.setDescription(description);
		eo.setCost(cost);
		eo.setQuantity(quantity);

		new ExpenseService("expenseOtherDao");
		if(expenseId == null){
			dao.create(eo);
			index++;
		}else if(expenseId != null){
			dao.update(eo);
		}
		
		refresh();
	}

	public List<Component> getAllComponents() {
		return new ComponentService().getList();
	}

	public List<Lubricant> getAllLubricants() {
		return new LubricantService().getList();
	}
}
