package net.sas.controller;

import java.util.ArrayList;
import java.util.List;

import net.sas.model.bo.Employee;
import net.sas.model.dao.EmployeeDao;
import net.sas.model.service.ContextUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeDao employeeDao;

	@RequestMapping("/employee")
	public ModelAndView hello() {
		List<Employee> employees = new ArrayList<Employee>();
		employees = employeeDao.read(); 
		System.out.println(employees.size());
		
//		EmployeeDao dao = (EmployeeDao) ContextUtil.getInstance().getBean("employeeDao");
//		employees = dao.read(); 
//		System.out.println(employees.size());
//		
//		Employee e = dao.findById(1);
//		employees.add(e);
		
		Employee e1 = new Employee();
		e1.setFirstName("aze");
		employees.add(e1);
		Employee e2 = new Employee();
		e2.setFirstName("foo");
		employees.add(e2);
		Employee e3 = new Employee();
		e3.setFirstName("abcdef");
		employees.add(e3);
		System.out.println(employees.size());
		return new ModelAndView("employee", "employees", employees);
	}

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
}
