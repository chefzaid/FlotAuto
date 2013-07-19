package net.sas.model.dao;

import java.util.List;

import net.sas.model.bo.Component;
import net.sas.model.bo.Supplier;
import net.sas.model.enums.ComponentType;

public class ComponentDao extends GenericDao<Component> {

	private String searchQuery = "from Component where";
	
	public Component findByReference(String reference) {
		return (Component) template.find(searchQuery + " reference=?",
				reference).get(0);
	}

	@SuppressWarnings("unchecked")
	public List<Component> findByType(ComponentType type) {
		return template.find(searchQuery + " type=?", type);
	}

	@SuppressWarnings("unchecked")
	public List<Component> findByDescription(String description) {
		return template.find(searchQuery + " description like ?", "%"
				+ description + "%");
	}

	@SuppressWarnings("unchecked")
	public List<Component> findByBrand(String brand) {
		return template.find(searchQuery + " brand=?", brand);
	}

	@SuppressWarnings("unchecked")
	public List<Component> findBySupplier(String companyName) {
		SupplierDao dao = new SupplierDao();
		Supplier s = dao.findByCompanyName(companyName);
		return template.find(searchQuery + " supplier_id=?", s.getId());
	}
}
