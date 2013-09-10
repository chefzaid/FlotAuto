package net.sas.model.bo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
	@JoinColumn(name="employeeInCharge_id")
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Employee employeeInCharge;
	@ManyToOne
	@JoinColumn(name="program_id")
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private MaintenanceProgram program;
	@Temporal(TemporalType.DATE)
	private Date date;
	
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
	public Employee getEmployeeInCharge() {
		return employeeInCharge;
	}
	public void setEmployeeInCharge(Employee employeeInCharge) {
		this.employeeInCharge = employeeInCharge;
	}
	public MaintenanceProgram getProgram() {
		return program;
	}
	public void setProgram(MaintenanceProgram program) {
		this.program = program;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
