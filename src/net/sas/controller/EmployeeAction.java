package net.sas.controller;

import java.io.File;
import java.util.List;

import net.sas.model.bo.Employee;
import net.sas.model.dao.EmployeeDao;
import net.sas.model.service.ContextUtil;
import net.sas.model.service.ImageUtil;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class EmployeeAction extends ActionSupport implements
		ModelDriven<Employee> {

	private static final long serialVersionUID = 1L;
	private EmployeeDao dao = (EmployeeDao) ContextUtil.getInstance().getBean(
			"employeeDao");
	private List<Employee> employees;
	private Employee currentEmployee;
	private Employee newEmployee = new Employee();
	private File image;

	public String load() {
		employees = dao.read();
		return Action.INPUT;
	}

	public String view() {
		int id = Integer.parseInt(ServletActionContext.getRequest()
				.getParameter("id"));
		currentEmployee = dao.findById(id);
		return load();
	}

	public String save() {
		newEmployee = getModel();
		if (image != null) {
			newEmployee.setPicture(ImageUtil.getImageBytes(image));
		} else { // if updating employee, keep old image if it hasnt changed
			Employee e = dao.findById(newEmployee.getId());
			if (e != null) { // if existing employee
				newEmployee.setPicture(e.getPicture());
			}
		}
		newEmployee.getDrivingLicense().setEmployee(newEmployee);
		newEmployee.getHealthCheck().setEmployee(newEmployee);
		dao.createOrUpdate(newEmployee);
		
		return load();
	}

	public String delete() {
		int id = Integer.parseInt(ServletActionContext.getRequest()
				.getParameter("id"));
		dao.delete(id);
		
		return load();
	}

	public String clear() {
		currentEmployee = new Employee();
		return Action.INPUT;
	}

	public String previous() {
		int id = Integer.parseInt(ServletActionContext.getRequest()
				.getParameter("id"));
		currentEmployee = dao.getPreviousEntry(id);
		return load();
	}

	public String next() {
		int id = Integer.parseInt(ServletActionContext.getRequest()
				.getParameter("id"));
		currentEmployee = dao.getNextEntry(id);
		return load();
	}

	public String first() {
		currentEmployee = dao.getFirstEntry();
		return load();
	}

	public String last() {
		currentEmployee = dao.getLastEntry();
		return load();
	}

	@Override
	public Employee getModel() {
		return newEmployee;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Employee getCurrentEmployee() {
		return currentEmployee;
	}

	public void setCurrentEmployee(Employee currentEmployee) {
		this.currentEmployee = currentEmployee;
	}

	public File getImage() {
		return image;
	}

	public void setImage(File image) {
		this.image = image;
	}
}
