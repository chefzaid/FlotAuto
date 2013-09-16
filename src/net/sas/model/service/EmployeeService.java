package net.sas.model.service;

import java.io.File;
import java.util.List;

import net.sas.model.bo.Employee;
import net.sas.model.dao.EmployeeDao;
import net.sas.util.ContextUtil;
import net.sas.util.ImageUtil;

public class EmployeeService {
	private EmployeeDao dao;
	private List<Employee> employees;
	private Employee currentEmployee;
	private Integer index;
	
	public EmployeeService(){
		dao  = (EmployeeDao) ContextUtil.getInstance().getBean(
				"employeeDao");
		employees = dao.read();
	}

	public void view(Integer index) {
		this.index = index;
		currentEmployee = employees.get(index);
	}

	public void save(Employee employee, File image) {
		if (image != null) {
			employee.setPicture(ImageUtil.getImageBytes(image));
		} else { // if updating employee, keep old image if it hasnt changed
			Employee e = employees.get(index);
			if (e != null) { // if existing employee
				employee.setPicture(e.getPicture());
			}
		}
		employee.getDrivingLicense().setEmployee(employee);
		employee.getHealthCheck().setEmployee(employee);
		dao.createOrUpdate(employee);

		refresh();
	}

	public void delete(Integer id) {
		dao.delete(id);
		refresh();
	}

	public void clear() {
		currentEmployee = new Employee();
	}

	public void previous() {
		index--;
		if (index > 0) {
			currentEmployee = employees.get(index);
		}
	}

	public void next() {
		index++;
		if (index < employees.size()) {
			currentEmployee = employees.get(index);
		}
	}

	public void first() {
		index = 0;
		if (employees.size() > 0) {
			currentEmployee = employees.get(index);
		}
	}

	public void last() {
		index = employees.size() - 1;
		if (employees.size() > 0) {
			currentEmployee = employees.get(index);
		}
	}

	public void refresh() {
		employees = dao.read();
		currentEmployee = employees.get(index);
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public Employee getCurrentEmployee() {
		return currentEmployee;
	}
}
