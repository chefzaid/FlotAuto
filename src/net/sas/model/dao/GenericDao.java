package net.sas.model.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class GenericDao<T> {

	private Class<T> entity;
	protected HibernateTemplate template;
	protected String searchQuery = "from " + entity + " where ";
	
	public GenericDao(Class<T> entity){
		this.entity = entity;
	}

	public void create(T obj) {
		template.save(obj);
	}

	public void update(T obj) {
		template.update(obj);
	}

	public void delete(T obj) {
		template.delete(obj);
	}

	public void createOrUpdate(T obj) {
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
}