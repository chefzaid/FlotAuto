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
public class Labor {
	
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
	@JoinColumn(name="employeeRequesting_id")
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Employee employeeRequesting;
	@ManyToOne
	@JoinColumn(name="employeeInCharge_id")
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Employee employeeInCharge;
	private String description;
	@Enumerated(EnumType.STRING)
	private LaborProgress progress;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LaborProgress getProgress() {
		return progress;
	}
	public void setProgress(LaborProgress progress) {
		this.progress = progress;
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
