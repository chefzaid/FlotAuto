package net.sas.controller;

import java.util.List;

import net.sas.model.bo.Employee;
import net.sas.model.dao.EmpDao;
import net.sas.model.dao.EmployeeDao;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class EmployeeLoad extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private List<Employee> employees;
	
	@Override
	public String execute(){
		EmpDao dao = new EmpDao();
		employees = dao.read();
		System.out.println(employees.size());
//		employees = new ArrayList<Employee>();
	
		
		return Action.SUCCESS;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}
