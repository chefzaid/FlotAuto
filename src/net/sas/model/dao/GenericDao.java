package net.sas.model.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public abstract class GenericDao<T> {

	protected HibernateTemplate template;
	protected Class<T> entity;
	
	public void create(T obj) {
		template.save(obj);
	}

	public void update(T obj) {
		template.update(obj);
	}

	public void delete(T obj) {
		template.delete(obj);
	}

	public void createOrUpdate(T obj){
		template.saveOrUpdate(obj);
	}
	
	
	public List<T> read() {
		return template.loadAll(entity);
	}

	public T findById(Integer id) {
		return template.get(entity, id);
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	public void setEntity(Class<T> entity) {
		this.entity = entity;
	}
}