package net.sas.model.dao;

import java.util.List;

import net.sas.model.bo.Employee;
import net.sas.model.bo.Vehicle;
import net.sas.model.bo.WorkOrder;
import net.sas.model.enums.WorkOrderState;
import net.sas.model.enums.Occupation;

public class WorkOrderDao extends GenericDao<WorkOrder> {
//
//	private String searchQuery = "from WorkOrder where";
//	
//	public WorkOrder findByReference(String reference) {
//		return (WorkOrder) session.createQuery(searchQuery + " reference=?",
//				reference);
//	}
//
//	@SuppressWarnings("unchecked")
//	public List<WorkOrder> findByVehicle(String registration) {
//		VehicleDao dao = new VehicleDao();
//		Vehicle v = dao.createQueryByRegistration(registration);
//		return session.createQuery(searchQuery + " vehicle_id=?", v.getId());
//	}
//
//	@SuppressWarnings("unchecked")
//	public List<WorkOrder> findByDriver(String number) {
//		EmployeeDao dao = new EmployeeDao();
//		Employee e = dao.createQueryByNumber(number);
//		return session.createQuery(searchQuery + " number=? and occupation=?",
//				e.getNumber(), Occupation.DRIVER);
//	}
//
//	@SuppressWarnings("unchecked")
//	public List<WorkOrder> findByTechnician(String number) {
//		EmployeeDao dao = new EmployeeDao();
//		Employee e = dao.createQueryByNumber(number);
//		return session.createQuery(searchQuery + " number=? and occupation=?",
//				e.getNumber(), Occupation.TECHNICIAN);
//	}
//
//	@SuppressWarnings("unchecked")
//	public List<WorkOrder> findByProgress(WorkOrderState progress) {
//		return session.createQuery(searchQuery + " progress=?", progress);
//	}
//
//	@SuppressWarnings("unchecked")
//	public List<WorkOrder> findByDescription(String description) {
//		return session.createQuery(searchQuery + " description like ?", "%"
//				+ description + "%");
//	}
}
