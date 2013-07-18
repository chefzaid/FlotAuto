package net.sas.model.dao;

import java.util.List;

import net.sas.model.bean.Supplier;
import net.sas.model.enums.SupplierType;

public class SupplierDao extends GenericDao<Supplier> {

	private String searchQuery = "from Supplier where";
	
	public Supplier findByCompanyName(String companyName) {
		return (Supplier) template.find(searchQuery + " companyName=?",
				companyName).get(0);
	}

	@SuppressWarnings("unchecked")
	public List<Supplier> findByType(SupplierType type) {
		return template.find(searchQuery + " type=?", type);
	}

	@SuppressWarnings("unchecked")
	public List<Supplier> findByCity(String city) {
		return template.find(searchQuery + " city=?", city);
	}

	@SuppressWarnings("unchecked")
	public List<Supplier> findByPhone(String phone) {
		return template.find(searchQuery + " phone=?", phone);
	}
}
