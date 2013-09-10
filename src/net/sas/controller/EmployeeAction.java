package net.sas.controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import net.sas.model.bo.Employee;
import net.sas.model.dao.EmployeeDao;
import net.sas.model.service.ContextUtil;
import net.sas.model.service.ImageUtil;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class EmployeeAction extends ActionSupport implements ModelDriven<Employee> {
	
	private static final long serialVersionUID = 1L;
	private EmployeeDao dao = (EmployeeDao) ContextUtil.getInstance().getBean("employeeDao");
	private List<Employee> employees;
	private Employee currentEmployee;
	private Employee newEmployee = new Employee();
	private File image;
	
	public String load(){
		employees = dao.read();
		return Action.SUCCESS;
	}
	
	public String view(){
		HttpServletRequest request = ServletActionContext.getRequest();
		int id = Integer.parseInt(request.getParameter("id"));
		currentEmployee = dao.findById(id);
		load();
		return Action.SUCCESS;
	}
	
	public String delete(){
		HttpServletRequest request = ServletActionContext.getRequest();
		int id = Integer.parseInt(request.getParameter("id"));
		Employee e = dao.findById(id);
		dao.delete(e);
		load();
		return Action.SUCCESS;
	}
	
	public String save(){
		newEmployee = getModel();
		if(image != null){
			newEmployee.setPicture(ImageUtil.getImageBytes(image));
		}else{ //if updating employee, keep old image if it hasnt changed
			Employee e = dao.findById(newEmployee.getId());
			if(e != null){ //if existing employee
				newEmployee.setPicture(e.getPicture());
			}
		}
		newEmployee.getDrivingLicense().setEmployee(newEmployee);
		newEmployee.getHealthCheck().setEmployee(newEmployee);
		dao.createOrUpdate(newEmployee);
		load();
		return Action.SUCCESS;
	}

	public String clear(){
		currentEmployee = new Employee();
		return Action.SUCCESS;
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
	
	public void setImage(File image) {
		this.image = image;
	}
	public File getImage() {
		return image;
	}
}
