package net.sas.controller;

import java.io.File;
import java.util.List;

import net.sas.model.bo.Employee;
import net.sas.model.service.EmployeeService;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public class EmployeeAction implements Action, ModelDriven<Employee> {

	private File image;
	private static EmployeeService employeeService = new EmployeeService();
	private Employee employee = new Employee();

	@Override
	public Employee getModel() {
		return employee;
	}
	
	@Override
	public String execute() {
		employeeService = new EmployeeService();
		return Action.INPUT;
	}
	
	public String list() {
		return execute();
	}

	public String view() {
		Integer index = Integer.parseInt(ServletActionContext.getRequest()
				.getParameter("index"));
		employeeService.view(index);
		return Action.INPUT;
	}

	public String save() {
		employeeService.save(employee, image);
		return Action.INPUT;
	}

	public String delete() {
		employeeService.delete();
		return Action.INPUT;
	}

	public String clear() {
		employeeService.clear();
		return Action.INPUT;
	}

	public String previous() {
		employeeService.previous();
		return Action.INPUT;
	}

	public String next() {
		employeeService.next();
		return Action.INPUT;
	}

	public String first() {
		employeeService.first();
		return Action.INPUT;
	}

	public String last() {
		employeeService.last();
		return Action.INPUT;
	}

	public List<Employee> getEmployees() {
		return employeeService.getList();
	}

	public Employee getCurrentEmployee() {
		return employeeService.getCurrentEntry();
	}

	public void setImage(File image) {
		this.image = image;
	}
}
