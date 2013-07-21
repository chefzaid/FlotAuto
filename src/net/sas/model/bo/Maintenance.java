package net.sas.model.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Maintenance {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@ManyToOne
	@JoinColumn(name="vehicle_id")
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Vehicle vehicle;
	@ManyToOne
	@JoinColumn(name="chargedEmployee_id")
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Employee chargedEmployee;
	@ManyToOne
	@JoinColumn(name="maintenanceProgram_id")
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private MaintenanceProgram maintenanceProgram;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public Employee getChargedEmployee() {
		return chargedEmployee;
	}
	public void setChargedEmployee(Employee chargedEmployee) {
		this.chargedEmployee = chargedEmployee;
	}
	public MaintenanceProgram getMaintenanceProgram() {
		return maintenanceProgram;
	}
	public void setMaintenanceProgram(MaintenanceProgram maintenanceProgram) {
		this.maintenanceProgram = maintenanceProgram;
	}
}
