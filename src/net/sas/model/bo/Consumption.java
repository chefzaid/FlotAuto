package net.sas.model.bo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Consumption extends Expense{
	
	@ManyToOne
	@JoinColumn(name="employee_id")
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Employee employee;
	@ManyToOne
	@JoinColumn(name="supplier_id")
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Supplier supplier;
	private Date consumptionDate;
	@OneToOne(orphanRemoval=true)
	@JoinColumn(name="beginOdometer_id", unique=true)
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Odometer beginOdometer;
	@OneToOne(orphanRemoval=true)
	@JoinColumn(name="endOdometer_id", unique=true)
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Odometer endOdometer;
	private String city;
	private String notes;
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public Date getConsumptionDate() {
		return consumptionDate;
	}
	public void setConsumptionDate(Date consumptionDate) {
		this.consumptionDate = consumptionDate;
	}
	public Odometer getBeginOdometer() {
		return beginOdometer;
	}
	public void setBeginOdometer(Odometer beginOdometer) {
		this.beginOdometer = beginOdometer;
	}
	public Odometer getEndOdometer() {
		return endOdometer;
	}
	public void setEndOdometer(Odometer endOdometer) {
		this.endOdometer = endOdometer;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
}
