package net.sas.model.service;

import java.util.List;

import net.sas.model.dao.GenericDao;
import net.sas.util.ContextUtil;

public abstract class GenericService<T> {
	protected GenericDao<T> dao;
	protected List<T> list;
	protected T currentEntry;
	protected Integer index;
	
	@SuppressWarnings("unchecked")
	public GenericService(String daoBean) {
		dao = (GenericDao<T>) ContextUtil.getInstance().getBean(daoBean);
		list = dao.read();
		index = list.size();
	}

	public void view(Integer index) {
		this.index = index;
		currentEntry = list.get(index);
	}

	public void save(T entry) {
		dao.createOrUpdate(entry);
		refresh();
	}

	public void delete() {
		dao.delete(currentEntry);
		previous();
		refresh();
	}

	public void clear() {
		currentEntry = null;
	}

	public void previous() {
		index--;
		if (index >= 0) {
			currentEntry = list.get(index);
		} else {
			index = 0;
		}
	}

	public void next() {
		index++;
		if (index < list.size()) {
			currentEntry = list.get(index);
		} else {
			index = list.size() - 1;
		}
	}

	public void first() {
		index = 0;
		if (list.size() > 0) {
			currentEntry = list.get(index);
		}
	}

	public void last() {
		index = list.size() - 1;
		if (list.size() > 0) {
			currentEntry = list.get(index);
		}
	}

	public void refresh() {
		list = dao.read();
		currentEntry = list.get(index);
	}

	public List<T> getList() {
		return list;
	}

	public T getCurrentEntry() {
		return currentEntry;
	}
	
	public T findById(Integer id){
		return dao.findById(id);
	}
}
