package net.sas.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import net.sas.model.bo.Lubricant;
import net.sas.model.bo.Supplier;

public class LubricantService extends GenericService<Lubricant> {

	public LubricantService() {
		super("lubricantDao");
	}

	@Override
	public void save(Lubricant l){
		save(l, "");
	}
	
	public void save(Lubricant l, String supplierList){
		List<Supplier> suppliers = extractSuppliers(supplierList);
		l.setSuppliers(suppliers);
		if(l.getId() == null){
			dao.create(l);
			index++;
		}else if(l.getId() != null){
			dao.update(l);
		}
		
		refresh();
	}
	
	public List<Supplier> getAllSuppliers() {
		return new SupplierService().getList();
	}
	
	private List<Supplier> extractSuppliers(String supplierList){
		StringTokenizer st = new StringTokenizer(supplierList, ", ");
		List<Supplier> suppliers = new ArrayList<Supplier>();
		while(st.hasMoreTokens()){
			Integer id = Integer.parseInt(st.nextToken());
			Supplier s = new SupplierService().findById(id);
			suppliers.add(s);
		}
		return suppliers;
	}
}
