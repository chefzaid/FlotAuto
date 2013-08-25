package net.sas.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import net.sas.model.bo.Employee;
import net.sas.model.dao.EmployeeDao;
import net.sas.model.service.ContextUtil;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class EmployeeAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	private EmployeeDao dao = (EmployeeDao) ContextUtil.getInstance().getBean("employeeDao");
	private List<Employee> employees;
	private Employee currentEmployee;
	
	public String load(){
		
		employees = dao.read();
		
		Employee e1 = new Employee();
		e1.setFirstName("aze");
		employees.add(e1);
		Employee e2 = new Employee();
		e2.setFirstName("foo");
		employees.add(e2);
		Employee e3 = new Employee();
		e3.setFirstName("abcdef");
		employees.add(e3);
		
		return Action.SUCCESS;
	}
	
	public String view(){
		
		HttpServletRequest request = ServletActionContext.getRequest();
		int id = Integer.parseInt(request.getParameter("id"));
		currentEmployee = dao.findById(id);
		
		return Action.SUCCESS;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
