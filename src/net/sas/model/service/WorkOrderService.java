package net.sas.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import net.sas.model.bo.Employee;
import net.sas.model.bo.Maintenance;
import net.sas.model.bo.Vehicle;
import net.sas.model.bo.WorkOrder;

public class WorkOrderService extends GenericService<WorkOrder> {

	public WorkOrderService() {
		super("workOrderDao");
	}

	@Override
	public void save(WorkOrder wo) {
		save(wo, 0, 0, "", "");
	}

	public void save(WorkOrder wo, Integer vehicleId,
			Integer employeeRequestingId, String employeesInChargeList,
			String maintenanceList) {
		Vehicle vehicle = new VehicleService().findById(vehicleId);
		Employee employeeRequesting = new EmployeeService().findById(employeeRequestingId);
		List<Employee> employeesInCharge = extractEmployees(employeesInChargeList);
		List<Maintenance> maintenances = extractMaintenances(maintenanceList);
	
		wo.setVehicle(vehicle);
		wo.setEmployeeRequesting(employeeRequesting);
		wo.setEmployeesInCharge(employeesInCharge);
		wo.setMaintenances(maintenances);
		wo.getOdometer().setVehicle(vehicle);
		dao.createOrUpdate(wo);
		
		refresh();
	}

	public List<Employee> getAllEmployees() {
		return new EmployeeService().getList();
	}

	public List<Vehicle> getAllVehicles() {
		return new VehicleService().getList();
	}

	public List<Maintenance> getAllMaintenances() {
		return new MaintenanceService().getList();
	}

	private List<Employee> extractEmployees(String employeeList) {
		StringTokenizer st = new StringTokenizer(employeeList, ", ");
		List<Employee> employees = new ArrayList<Employee>();
		while (st.hasMoreTokens()) {
			Integer id = Integer.parseInt(st.nextToken());
			Employee e = new EmployeeService().findById(id);
			employees.add(e);
		}
		return employees;
	}

	private List<Maintenance> extractMaintenances(String maintenanceList) {
		StringTokenizer st = new StringTokenizer(maintenanceList, ", ");
		List<Maintenance> maintenances = new ArrayList<Maintenance>();
		while (st.hasMoreTokens()) {
			Integer id = Integer.parseInt(st.nextToken());
			Maintenance m = new MaintenanceService().findById(id);
			maintenances.add(m);
		}
		return maintenances;
	}
}
