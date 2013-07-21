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

import net.sas.model.enums.WorkOrderState;

@Entity
public class WorkOrder {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@ManyToOne
	@JoinColumn(name="vehicle_id")
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Vehicle vehicle;
	private Date createDate;
	private Date requireDate;
	@ManyToOne
	@JoinColumn(name="requestEmployee_id")
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Employee requestEmployee;
	@ManyToOne
	@JoinColumn(name="chargedEmployee_id")
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Employee chargedEmployee;
	private String description;
	@Enumerated(EnumType.STRING)
	private WorkOrderState state;
	@OneToOne(orphanRemoval=true)
	@JoinColumn(name="odometer_id", unique=true)
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Odometer odometer;
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
	public Employee getRequestEmployee() {
		return requestEmployee;
	}
	public void setRequestEmployee(Employee requestEmployee) {
		this.requestEmployee = requestEmployee;
	}
	public Employee getChargedEmployee() {
		return chargedEmployee;
	}
	public void setChargedEmployee(Employee chargedEmployee) {
		this.chargedEmployee = chargedEmployee;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public WorkOrderState getState() {
		return state;
	}
	public void setState(WorkOrderState state) {
		this.state = state;
	}
	public Odometer getOdometer() {
		return odometer;
	}
	public void setOdometer(Odometer odometer) {
		this.odometer = odometer;
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
