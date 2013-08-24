package net.sas.model.dao;

import java.util.List;

import net.sas.model.bo.Component;
import net.sas.model.bo.Maintenance;
import net.sas.model.bo.MaintenanceProgram;
import net.sas.model.bo.Vehicle;

public class MaintenanceDao extends GenericDao<Maintenance> {
//
//	private String searchQuery = "from Maintenance where";
//
//	@SuppressWarnings("unchecked")
//	public List<Component> findByVehicle(String registration) {
//		VehicleDao dao = new VehicleDao();
//		Vehicle v = dao.createQueryByRegistration(registration);
//		return session.createQuery(searchQuery + " vehicle_id=?", v.getId());
//	}
//
//	@SuppressWarnings("unchecked")
//	public List<Maintenance> findByMaintenanceProgram(String description) {
//		MaintenanceProgramDao dao = new MaintenanceProgramDao();
//		MaintenanceProgram mp = dao.createQueryByDescription(description);
//		return session.createQuery(searchQuery + " maintenanceProgram_id =?", mp.getId());
//	}
}
