package net.sas.model.dao;

import java.util.List;

import net.sas.model.bo.Component;
import net.sas.model.bo.Supplier;
import net.sas.model.enums.ComponentType;

public class ComponentDao extends GenericDao<Component> {
//
//	private String searchQuery = "from Component where";
//
//	public Component findByReference(String reference) {
//		return (Component) session
//				.createQuery(searchQuery + " reference=" + reference).list()
//				.get(0);
//	}
//
//	@SuppressWarnings("unchecked")
//	public List<Component> findByType(ComponentType type) {
//		return session.createQuery(searchQuery + " type=" + type).list();
//	}
//
//	@SuppressWarnings("unchecked")
//	public List<Component> findByDescription(String description) {
//		return session.createQuery(
//				searchQuery + " description like " + "%" + description + "%")
//				.list();
//	}
//
//	@SuppressWarnings("unchecked")
//	public List<Component> findByBrand(String brand) {
//		return session.createQuery(searchQuery + " brand=" + brand).list();
//	}
//
//	@SuppressWarnings("unchecked")
//	public List<Component> findBySupplier(String companyName) {
//		SupplierDao dao = new SupplierDao();
//		Supplier s = dao.findByCompanyName(companyName);
//		return session.createQuery(searchQuery + " supplier_id=" + s.getId())
//				.list();
//	}
}
