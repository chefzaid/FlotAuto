package net.sas.model.bo;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class WorkOrder {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String description;
	@ManyToOne
	@JoinColumn(name="vehicle_id")
	@Cascade (value={CascadeType.SAVE_UPDATE})
	private Vehicle vehicle;
	@ManyToOne
	@JoinColumn(name="employeeRequesting_id")
	@Cascade (value={CascadeType.SAVE_UPDATE})
	private Employee employeeRequesting;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "WorkOrder_Employees", 
		joinColumns = { @JoinColumn(name = "workorder_id") }, 
		inverseJoinColumns = { @JoinColumn(name = "employee_id") })
	@Cascade(value = { CascadeType.SAVE_UPDATE})
	private List<Employee> employeesInCharge;
	@ManyToMany(fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT) // used to fix a bug in hibernate
	@JoinTable(name = "WorkOrder_Maintenance", 
		joinColumns = { @JoinColumn(name = "workorder_id") }, 
		inverseJoinColumns = { @JoinColumn(name = "maintenance_id") })
	@Cascade(value = { CascadeType.SAVE_UPDATE})
	private List<Maintenance> maintenances;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public List<Employee> getEmployeesInCharge() {
		return employeesInCharge;
	}
	public void setEmployeesInCharge(List<Employee> employeesInCharge) {
		this.employeesInCharge = employeesInCharge;
	}
	public List<Maintenance> getMaintenances() {
		return maintenances;
	}
	public void setMaintenances(List<Maintenance> maintenances) {
		this.maintenances = maintenances;
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
