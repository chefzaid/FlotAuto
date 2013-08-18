package net.sas.controller;

import java.util.List;

import net.sas.model.bo.Employee;
import net.sas.model.dao.EmployeeDao;
import net.sas.model.service.ContextUtil;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class EmployeeLoad extends ActionSupport {
	private static final long serialVersionUID = 1L;
	

	private List<Employee> employees;
	
	@Override
	public String execute(){
		EmployeeDao dao = (EmployeeDao) ContextUtil.getInstance().getBean("employeeDao");
		employees = dao.read();
		
//		employees = new ArrayList<Employee>();
		
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

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}
