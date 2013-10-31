package net.sas.controller;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import net.sas.model.bo.Expense;
import net.sas.model.bo.Maintenance;
import net.sas.model.service.MaintenanceService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public class MaintenanceAction implements Action, ModelDriven<Maintenance> {

	private static MaintenanceService maintenanceService = new MaintenanceService();
	private Maintenance maintenance = new Maintenance();
	private String expenseList;

	@Override
	public Maintenance getModel() {
		return maintenance;
	}

	@Override
	public String execute() {
		return Action.INPUT;
	}

	public String list() {
		return execute();
	}

	public String view() {
		Integer index = Integer.parseInt(ServletActionContext.getRequest()
				.getParameter("index"));
		maintenanceService.view(index);
		return Action.INPUT;
	}

	public String save() {
		maintenanceService.save(maintenance, expenseList);
		return Action.INPUT;
	}

	public String delete() {
		maintenanceService.delete();
		return Action.INPUT;
	}

	public String clear() {
		maintenanceService.clear();
		return Action.INPUT;
	}

	public String previous() {
		maintenanceService.previous();
		return Action.INPUT;
	}

	public String next() {
		maintenanceService.next();
		return Action.INPUT;
	}

	public String first() {
		maintenanceService.first();
		return Action.INPUT;
	}

	public String last() {
		maintenanceService.last();
		return Action.INPUT;
	}

	public List<Maintenance> getMaintenances() {
		return maintenanceService.getList();
	}

	public Maintenance getCurrentMaintenance() {
		return maintenanceService.getCurrentEntry();
	}

	public List<Expense> getAllExpenses() {
		return maintenanceService.getAllExpenses();
	}

	public void setExpenseList(String expenseList) {
		this.expenseList = expenseList;
	}
}
