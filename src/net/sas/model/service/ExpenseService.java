package net.sas.model.service;

import java.util.List;
import java.util.StringTokenizer;

import net.sas.model.bo.Component;
import net.sas.model.bo.Employee;
import net.sas.model.bo.Expense;
import net.sas.model.bo.ExpenseComponent;
import net.sas.model.bo.ExpenseLabor;
import net.sas.model.bo.ExpenseOther;

public class ExpenseService extends GenericService<Expense> {

	public ExpenseService() {
		super("expenseOtherDao");
	}

	public ExpenseService(String dao) {
		super(dao);
	}

	@Override
	public void save(Expense e) {
		saveExpenseOther("", 0.0, 0.0);
	}

	public void saveExpenseComponent(String componentStr, Double quantity) {
		Integer id = extractId(componentStr);
		Component c = new ComponentService().findById(id);

		ExpenseComponent ec = new ExpenseComponent();
		ec.setComponent(c);
		ec.setQuantity(quantity);
		ec.setTotalCost(quantity * c.getPrice());

		new ExpenseService("expenseComponentDao");
		dao.createOrUpdate(ec);
		refresh();
	}

	public void saveExpenseLabor(String employeeStr, Double quantity) {
		Integer id = extractId(employeeStr);
		Employee emp = new EmployeeService().findById(id);

		ExpenseLabor el = new ExpenseLabor();
		el.setEmployee(emp);
		el.setQuantity(quantity);
		el.setTotalCost(quantity * emp.getSalary());

		new ExpenseService("expenseLaborDao");
		dao.createOrUpdate(el);
		refresh();
	}

	public void saveExpenseOther(String description, Double cost,
			Double quantity) {
		ExpenseOther eo = new ExpenseOther();
		eo.setDescription(description);
		eo.setCost(cost);
		eo.setQuantity(quantity);
		eo.setTotalCost(quantity * cost);

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

	private Integer extractId(String str) {
		StringTokenizer st = new StringTokenizer(str, ":");
		return Integer.parseInt(st.nextToken());
	}
}
