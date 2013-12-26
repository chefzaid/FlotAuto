package net.sas.model.service;

import net.sas.model.bo.Supplier;

public class SupplierService extends GenericService<Supplier> {
	
	@Override
	public void save(Supplier s){
		if(s.getId() == null){
			dao.create(s);
			index++;
		}else if(s.getId() != null){
			dao.update(s);
		}
		
		refresh();
	}
	
	public SupplierService() {
		super("supplierDao");
	}
}
