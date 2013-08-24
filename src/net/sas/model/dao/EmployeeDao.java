package net.sas.model.dao;

import java.util.List;

import org.hibernate.Query;

import net.sas.model.bo.Employee;
import net.sas.model.enums.Occupation;

public class EmployeeDao extends GenericDao<Employee> {

	private String queryString = "from Employee where";
	
	public EmployeeDao(){
		super(Employee.class);
	}

//	@SuppressWarnings("unchecked")
//	public List<Employee> findByLastName(String lastName) {
//		Query query = session.createQuery(queryString + " lastName=?")
//				.setParameter(1, lastName);
//		return query.list();
//	}
//
//	@SuppressWarnings("unchecked")
//	public List<Employee> findByFirstName(String firstName) {
//		Query query = session.createQuery(queryString + " firstName=?")
//				.setParameter(1, firstName);
//		return query.list();
//	}
//
//	@SuppressWarnings("unchecked")
//	public List<Employee> findByOccupation(Occupation occupation) {
//		Query query = session.createQuery(queryString + " occupation=?")
//				.setParameter(1, occupation);
//		return query.list();
//	}
//
//	public Employee findByNumber(String number) {
//		Query query = session.createQuery(queryString + " number=?")
//				.setParameter(1, number);
//		return (Employee) query.list().get(0);
//	}
//
//	public Employee findByCin(String cin) {
//		Query query = session.createQuery(queryString + " cin=?").setParameter(
//				1, cin);
//		return (Employee) query.list().get(0);
//	}

//	public Employee findByDrivingLicense(String licenseNbr) {
//		DrivingLicense l = ((DrivingLicenseDao) ContextUtil.getInstance()
//				.getBean("licenseDao")).createQueryByNumber(licenseNbr);
//		return (Employee) session.createQuery(
//				searchQuery + " drivingLicense_id=?", l.getId()).get(0);
//	}
}
