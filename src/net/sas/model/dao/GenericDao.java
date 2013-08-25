package net.sas.model.dao;

import java.util.List;

import net.sas.model.bo.Employee;
import net.sas.model.service.HibernateUtil;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;

public class GenericDao<T> /* implements IDao<T> */{

	// @SessionTarget
	// Session session;
	// @TransactionTarget
	// Transaction transaction;
	protected Class<T> entity;

	public GenericDao() {
	}

	public GenericDao(Class<T> entity) {
		this.entity = entity;
	}

	 
	 public void create(T obj) {
		 Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			session.save(obj);
			session.getTransaction().commit();
	 }
	
	// @Override
	// public void update(T obj) {
	// session.update(obj);
	// }
	//
	// @Override
	// public void delete(T obj) {
	// session.delete(obj);
	// }
	//
	// @Override
	// public void createOrUpdate(T obj) {
	// session.saveOrUpdate(obj);
	// }

	@SuppressWarnings("unchecked")
	public List<T> read() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<T> list = session.createQuery("from Employee").list();
		session.getTransaction().commit();
		return list;
	}

	// @SuppressWarnings("unchecked")
	// @Override
	// public T findById(Integer id) {
	// return (T) session.get(entity, id);
	// }
}
