package net.sas.model.dao;

import java.util.List;

import net.sas.model.bo.Employee;
import net.sas.model.service.HibernateUtil;

import org.hibernate.Session;

public class EmpDao {

	public List<Employee> read() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<Employee> list = session.createQuery("from Employee").list();
		session.getTransaction().commit();
		return list;
	}
}
