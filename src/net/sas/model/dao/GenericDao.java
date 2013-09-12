package net.sas.model.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateTemplate;

@SuppressWarnings("unchecked")
public abstract class GenericDao<T> {

	protected HibernateTemplate template;
	protected Class<T> entity;
	
	public void create(T obj) {
		template.save(obj);
	}

	public void update(T obj) {
		template.update(obj);
	}

	public void delete(Integer id) {
		template.delete(id);
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
	
	public T getPreviousEntry(Integer id){
		DetachedCriteria criteria = DetachedCriteria.forClass(entity);
		criteria.add(Restrictions.lt("id", id));
		criteria.addOrder(Order.desc("id"));
		return getEntry(criteria, id);
	}
	
	public T getNextEntry(Integer id){
		DetachedCriteria criteria = DetachedCriteria.forClass(entity);
		criteria.add(Restrictions.gt("id", id));
		criteria.addOrder(Order.asc("id"));
		return getEntry(criteria, id);
	}
	
	public T getFirstEntry(){
		DetachedCriteria criteria = DetachedCriteria.forClass(entity);
		criteria.addOrder(Order.asc("id"));
		return getEntry(criteria);
	}
	
	public T getLastEntry(){
		DetachedCriteria criteria = DetachedCriteria.forClass(entity);
		criteria.addOrder(Order.desc("id"));
		return getEntry(criteria);
	}

	
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	public void setEntity(Class<T> entity) {
		this.entity = entity;
	}
	
	private T getEntry(DetachedCriteria criteria, Integer... id){
		T entry = null;
		if(!template.findByCriteria(criteria, 0, 1).isEmpty()){
			entry = (T) template.findByCriteria(criteria, 0, 1).get(0);
		}else if(id[0] != null){
			entry = findById(id[0]);
		}
		return entry;
	}
}