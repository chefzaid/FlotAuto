package net.sas.model.service;

import java.util.List;

import net.sas.model.bo.Component;
import net.sas.model.bo.Employee;
import net.sas.model.bo.Expense;
import net.sas.model.bo.ExpenseComponent;
import net.sas.model.bo.ExpenseLabor;
import net.sas.model.bo.ExpenseOther;

public class ExpenseService extends GenericService<Expense> {

	public ExpenseService() {
		super("expenseDao");
	}

	public ExpenseService(String dao) {
		super(dao);
	}

	@Override
	public void save(Expense e) {
		saveExpenseOther("", 0.0, 0);
	}

	public void saveExpenseComponent(Integer componentId, Integer quantity) {
		Component c = new ComponentService().findById(componentId);

		ExpenseComponent ec = new ExpenseComponent();
		ec.setComponent(c);
		ec.setQuantity(quantity);

		new ExpenseService("expenseComponentDao");
		dao.createOrUpdate(ec);
		refresh();
	}

	public void saveExpenseLabor(Integer employeeId, Integer quantity) {
		Employee emp = new EmployeeService().findById(employeeId);

		ExpenseLabor el = new ExpenseLabor();
		el.setEmployee(emp);
		el.setQuantity(quantity);

		new ExpenseService("expenseLaborDao");
		dao.createOrUpdate(el);
		refresh();
	}

	public void saveExpenseOther(String description, Double cost,
			Integer quantity) {
		ExpenseOther eo = new ExpenseOther();
		eo.setDescription(description);
		eo.setCost(cost);
		eo.setQuantity(quantity);

		new ExpenseService("expenseOtherDao");
		dao.createOrUpdate(eo);
		refresh();
	}

	public List<Component> getAllComponents() {
		return new ComponentService().getList();
	}

	public List<Employee> getAllEmployees() {
		return new EmployeeService().getList();
	}
}
