package net.sas.model.dao;

import java.util.List;

public interface IDao<T> {
	void create(T obj);
	void update(T obj);
	void delete(T obj);
	List<T> read();
	T findById(Long id);
}
