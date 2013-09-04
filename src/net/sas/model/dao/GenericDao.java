package net.sas.model.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class GenericDao<T> implements IDao<T> {

	protected HibernateTemplate template;
	protected Class<T> entity;
	
	@Override
	public void create(T obj) {
		template.save(obj);
	}

	@Override
	public void update(T obj) {
		template.update(obj);
	}

	@Override
	public void delete(T obj) {
		template.delete(obj);
	}

	@Override
	public void createOrUpdate(T obj){
		template.saveOrUpdate(obj);
	}
	
	@Override
	public List<T> read() {
		return template.loadAll(entity);
	}

	@Override
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
