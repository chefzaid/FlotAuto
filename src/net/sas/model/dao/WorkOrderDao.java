package net.sas.model.dao;

import java.util.List;

import net.sas.model.bean.Employee;
import net.sas.model.bean.WorkOrder;
import net.sas.model.bean.Vehicle;
import net.sas.model.enums.WorkOrderState;
import net.sas.model.enums.Occupation;

public class WorkOrderDao extends GenericDao<WorkOrder> {

	private String searchQuery = "from WorkOrder where";
	
	public WorkOrder findByReference(String reference) {
		return (WorkOrder) template.find(searchQuery + " reference=?",
				reference);
	}

	@SuppressWarnings("unchecked")
	public List<WorkOrder> findByVehicle(String registration) {
		VehicleDao dao = new VehicleDao();
		Vehicle v = dao.findByRegistration(registration);
		return template.find(searchQuery + " vehicle_id=?", v.getId());
	}

	@SuppressWarnings("unchecked")
	public List<WorkOrder> findByDriver(String number) {
		EmployeeDao dao = new EmployeeDao();
		Employee e = dao.findByNumber(number);
		return template.find(searchQuery + " number=? and occupation=?",
				e.getNumber(), Occupation.DRIVER);
	}

	@SuppressWarnings("unchecked")
	public List<WorkOrder> findByTechnician(String number) {
		EmployeeDao dao = new EmployeeDao();
		Employee e = dao.findByNumber(number);
		return template.find(searchQuery + " number=? and occupation=?",
				e.getNumber(), Occupation.TECHNICIAN);
	}

	@SuppressWarnings("unchecked")
	public List<WorkOrder> findByProgress(WorkOrderState progress) {
		return template.find(searchQuery + " progress=?", progress);
	}

	@SuppressWarnings("unchecked")
	public List<WorkOrder> findByDescription(String description) {
		return template.find(searchQuery + " description like ?", "%"
				+ description + "%");
	}
}
