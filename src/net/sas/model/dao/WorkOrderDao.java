package net.sas.model.dao;

import java.util.List;

import net.sas.model.bo.Employee;
import net.sas.model.bo.Occupation;
import net.sas.model.bo.Vehicle;
import net.sas.model.bo.WorkOrder;
import net.sas.model.bo.WorkOrderState;

@SuppressWarnings("unchecked")
public class WorkOrderDao extends GenericDao<WorkOrder> {

	private String searchQuery = "from WorkOrder where";
	
	public WorkOrder findByReference(String reference) {
		return (WorkOrder) template.find(searchQuery + " reference=?",
				reference);
	}

	public List<WorkOrder> findByVehicle(String registration) {
		VehicleDao dao = new VehicleDao();
		Vehicle v = dao.findByRegistration(registration);
		return template.find(searchQuery + " vehicle_id=?", v.getId());
	}

	public List<WorkOrder> findByDriver(String number) {
		EmployeeDao dao = new EmployeeDao();
		Employee e = dao.findByNumber(number);
		return template.find(searchQuery + " number=? and occupation=?",
				e.getNumber(), Occupation.DRIVER);
	}

	public List<WorkOrder> findByTechnician(String number) {
		EmployeeDao dao = new EmployeeDao();
		Employee e = dao.findByNumber(number);
		return template.find(searchQuery + " number=? and occupation=?",
				e.getNumber(), Occupation.TECHNICIAN);
	}

	public List<WorkOrder> findByProgress(WorkOrderState progress) {
		return template.find(searchQuery + " progress=?", progress);
	}

	public List<WorkOrder> findByDescription(String description) {
		return template.find(searchQuery + " description like ?", "%"
				+ description + "%");
	}
}
