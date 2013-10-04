package net.sas.model.service;

import net.sas.model.bo.Supplier;

public class SupplierService extends GenericService<Supplier> {
	
	public SupplierService() {
		super("supplierDao");
	}
	
	public Supplier findById(Integer id){
		return dao.findById(id);
	}
}
