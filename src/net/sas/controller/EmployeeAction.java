package net.sas.controller;

import java.io.File;
import java.util.List;

import net.sas.model.bo.Employee;
import net.sas.model.service.EmployeeService;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class EmployeeAction extends ActionSupport implements
		ModelDriven<Employee> {
	private static final long serialVersionUID = 1L;
	
	private static EmployeeService employeeService = new EmployeeService();
	private Employee employee = new Employee();
	private File image;

	@Override
	public String execute() {
		return Action.INPUT;
	}

	public String view() {
		int index = Integer.parseInt(ServletActionContext.getRequest()
				.getParameter("index"));
		employeeService.view(index);
		return Action.INPUT;
	}

	public String save() {
		employeeService.save(employee, image);
		return Action.INPUT;
	}

	public String delete() {
		int id = Integer.parseInt(ServletActionContext.getRequest()
				.getParameter("id"));
		employeeService.delete(id);
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

	@Override
	public Employee getModel() {
		return employee;
	}
	
	public List<Employee> getEmployees() {
		return employeeService.getEmployees();
	}
	
	public Employee getCurrentEmployee() {
		return employeeService.getCurrentEmployee();
	}

	public File getImage() {
		return image;
	}
	public void setImage(File image) {
		this.image = image;
	}
}
