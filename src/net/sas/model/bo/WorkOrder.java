package net.sas.model.bo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class WorkOrder {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@ManyToOne
	@JoinColumn(name="vehicle_id")
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Vehicle vehicle;
	@ManyToOne
	@JoinColumn(name="employeeRequesting_id")
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Employee employeeRequesting;
	@ManyToOne
	@JoinColumn(name="employeeInCharge_id")
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Employee employeeInCharge;
	@OneToOne
	private Maintenance maintenance;
	private Date createDate;
	private Date requireDate;
	@OneToOne(orphanRemoval=true)
	@JoinColumn(name="odometer_id", unique=true)
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Odometer odometer;
	@Enumerated(EnumType.STRING)
	private WorkOrderProgress progress;
	@Column(unique=true, nullable=false)
	private String reference;
	private String notes;
	
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
	public Employee getEmployeeRequesting() {
		return employeeRequesting;
	}
	public void setEmployeeRequesting(Employee employeeRequesting) {
		this.employeeRequesting = employeeRequesting;
	}
	public Employee getEmployeeInCharge() {
		return employeeInCharge;
	}
	public void setEmployeeInCharge(Employee employeeInCharge) {
		this.employeeInCharge = employeeInCharge;
	}
	public Maintenance getMaintenance() {
		return maintenance;
	}
	public void setMaintenance(Maintenance maintenance) {
		this.maintenance = maintenance;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getRequireDate() {
		return requireDate;
	}
	public void setRequireDate(Date requireDate) {
		this.requireDate = requireDate;
	}
	public Odometer getOdometer() {
		return odometer;
	}
	public void setOdometer(Odometer odometer) {
		this.odometer = odometer;
	}
	public WorkOrderProgress getProgress() {
		return progress;
	}
	public void setProgress(WorkOrderProgress progress) {
		this.progress = progress;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
}
