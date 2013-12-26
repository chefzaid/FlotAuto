package net.sas.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import net.sas.model.bo.Component;
import net.sas.model.bo.Supplier;

public class ComponentService extends GenericService<Component> {

	public ComponentService() {
		super("componentDao");
	}

	@Override
	public void save(Component c){
		save(c, "");
	}
	
	public void save(Component c, String supplierList){
		List<Supplier> suppliers = extractSuppliers(supplierList);
		c.setSuppliers(suppliers);
		
		if(c.getId() == null){
			dao.create(c);
			index++;
		}else if(c.getId() != null){
			dao.update(c);	
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
