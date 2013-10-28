package net.sas.model.service;

import java.io.File;

import net.sas.model.bo.Employee;
import net.sas.util.ImageUtil;

public class EmployeeService extends GenericService<Employee> {

	public EmployeeService() {
		super("employeeDao");
	}

	@Override
	public void save(Employee employee) {
		save(employee, null);
	}

	public void save(Employee employee, File image) {
		if (image != null) {
			employee.setPicture(ImageUtil.getImageBytes(image));
		} else { // if updating employee, keep old image if it hasnt changed
			Employee e = list.get(index);
			if (e != null) {
				employee.setPicture(e.getPicture());
			}
		}

		employee.getDrivingLicense().setEmployee(employee);
		employee.getHealthCheck().setEmployee(employee);
		dao.createOrUpdate(employee);

		refresh();
	}
}
