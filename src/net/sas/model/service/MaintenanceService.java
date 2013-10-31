package net.sas.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import net.sas.model.bo.Expense;
import net.sas.model.bo.Maintenance;

public class MaintenanceService extends GenericService<Maintenance> {

	public MaintenanceService() {
		super("maintenanceDao");
	}

	@Override
	public void save(Maintenance m) {
		save(m, "");
	}

	public void save(Maintenance m, String expenseList) {
		m.setExpenses(extractExpenses(expenseList));
		dao.createOrUpdate(m);
		refresh();
	}

	public List<Expense> getAllExpenses() {
		return new ExpenseService().getList();
	}

	private List<Expense> extractExpenses(String expenseList) {
		StringTokenizer st = new StringTokenizer(expenseList, ", ");
		List<Expense> expenses = new ArrayList<Expense>();
		while (st.hasMoreTokens()) {
			Integer id = Integer.parseInt(st.nextToken());
			Expense e = new ExpenseService().findById(id);
			expenses.add(e);
		}
		return expenses;
	}
}
