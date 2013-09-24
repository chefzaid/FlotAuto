package net.sas.model.service;

import java.util.List;

import net.sas.model.bo.Supplier;
import net.sas.model.dao.SupplierDao;
import net.sas.util.ContextUtil;

public class SupplierService {
	private SupplierDao dao;
	private List<Supplier> suppliers;
	private Supplier currentSupplier;
	private Integer index;

	public SupplierService() {
		dao = (SupplierDao) ContextUtil.getInstance().getBean("supplierDao");
		suppliers = dao.read();
		index = suppliers.size();
	}

	public void view(Integer index) {
		this.index = index;
		currentSupplier = suppliers.get(index);
	}

	public void save(Supplier supplier) {
		dao.createOrUpdate(supplier);
		refresh();
	}

	public void delete() {
		dao.delete(currentSupplier);
		previous();
		refresh();
	}

	public void clear() {
		currentSupplier = null;
	}

	public void previous() {
		index--;
		if (index >= 0) {
			currentSupplier = suppliers.get(index);
		} else {
			index = 0;
		}
	}

	public void next() {
		index++;
		if (index < suppliers.size()) {
			currentSupplier = suppliers.get(index);
		} else {
			index = suppliers.size() - 1;
		}
	}

	public void first() {
		index = 0;
		if (suppliers.size() > 0) {
			currentSupplier = suppliers.get(index);
		}
	}

	public void last() {
		index = suppliers.size() - 1;
		if (suppliers.size() > 0) {
			currentSupplier = suppliers.get(index);
		}
	}

	public void refresh() {
		suppliers = dao.read();
		currentSupplier = suppliers.get(index);
	}

	public List<Supplier> getSuppliers() {
		return suppliers;
	}

	public Supplier getCurrentSupplier() {
		return currentSupplier;
	}
}
