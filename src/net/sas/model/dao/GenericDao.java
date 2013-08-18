package net.sas.model.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class GenericDao<T> implements IDao<T> {

	protected SessionFactory factory;
	//protected HibernateTemplate template;
	protected Class<T> entity;
	
	@Override
	public void create(T obj) {
		factory.getCurrentSession().save(obj);
	}

	@Override
	public void update(T obj) {
		factory.getCurrentSession().update(obj);
	}

	@Override
	public void delete(T obj) {
		factory.getCurrentSession().delete(obj);
	}

	@Override
	public void createUpdate(T obj){
		factory.getCurrentSession().saveOrUpdate(obj);
	}
	
	@Override
	public List<T> read() {
		List<T> list = factory.getCurrentSession().find("from " + entity);
		System.out.println(list.size());
		return list;
	}

	@Override
	public T findById(Integer id) {
		return (T) factory.getCurrentSession().get(entity, id);
	}

//	public void setTemplate(HibernateTemplate template) {
//		this.template = template;
//	}

	public void setEntity(Class<T> entity) {
		this.entity = entity;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
}
