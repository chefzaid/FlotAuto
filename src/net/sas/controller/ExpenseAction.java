package net.sas.controller;

import java.util.List;

import net.sas.model.bo.Component;
import net.sas.model.bo.Employee;
import net.sas.model.bo.Expense;
import net.sas.model.bo.ExpenseType;
import net.sas.model.service.ExpenseService;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;

public class ExpenseAction implements Action {

	private static ExpenseService expenseService = new ExpenseService();

	private String expenseType;
	private String componentStr;
	private String employeeStr;
	private String description;
	private Double cost;
	private Double quantity;
	private Double totalCost;

	@Override
	public String execute() {
		expenseService = new ExpenseService();
		return Action.INPUT;
	}

	public String list() {
		return execute();
	}

	public String view() {
		Integer index = Integer.parseInt(ServletActionContext.getRequest()
				.getParameter("index"));
		expenseService.view(index);
		return Action.INPUT;
	}

	public String save() {
		System.out.println(expenseType);
		if (expenseType.equals(ExpenseType.COMPONENT.toString())) {
			expenseService.saveExpenseComponent(componentStr, quantity);
		} else if (expenseType.equals(ExpenseType.LABOR.toString())) {
			expenseService.saveExpenseLabor(employeeStr, quantity);
		} else {
			expenseService.saveExpenseOther(description, cost, quantity);
		}
		return Action.INPUT;
	}

	public String delete() {
		expenseService.delete();
		return Action.INPUT;
	}

	public String clear() {
		expenseService.clear();
		return Action.INPUT;
	}

	public String previous() {
		expenseService.previous();
		return Action.INPUT;
	}

	public String next() {
		expenseService.next();
		return Action.INPUT;
	}

	public String first() {
		expenseService.first();
		return Action.INPUT;
	}

	public String last() {
		expenseService.last();
		return Action.INPUT;
	}

	public List<Expense> getExpenses() {
		return expenseService.getList();
	}

	public Expense getCurrentExpense() {
		return expenseService.getCurrentEntry();
	}

	public List<Employee> getAllEmployees() {
		return expenseService.getAllEmployees();
	}

	public List<Component> getAllComponents() {
		return expenseService.getAllComponents();
	}

	/* ------------------------------ GET/SET ------------------------------ */

	public String getExpenseType() {
		return expenseType;
	}

	public void setExpenseType(String expenseType) {
		this.expenseType = expenseType;
	}

	public String getComponentStr() {
		return componentStr;
	}

	public void setComponentStr(String componentStr) {
		this.componentStr = componentStr;
	}

	public String getEmployeeStr() {
		return employeeStr;
	}

	public void setEmployeeStr(String employeeStr) {
		this.employeeStr = employeeStr;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}
}
