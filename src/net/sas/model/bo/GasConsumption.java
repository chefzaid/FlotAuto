package net.sas.model.bo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Formula;

@Entity
public class GasConsumption {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	protected Integer id;
	@ManyToOne
	@JoinColumn(name="vehicle_id")
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Vehicle vehicle;
	@ManyToOne
	@JoinColumn(name="employee_id")
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Employee employee;
	@ManyToOne
	@JoinColumn(name="supplier_id")
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Supplier supplier;
	private Date fillingDate;
	@OneToOne(orphanRemoval=true)
	@JoinColumn(name="odometer_id", unique=true)
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Odometer odometer;
	private Double price;
	private Double quantity;
	@Formula("quantity*price")
	private Double totalPrice;
	
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
	public Date getFillingDate() {
		return fillingDate;
	}
	public void setFillingDate(Date fillingDate) {
		this.fillingDate = fillingDate;
	}
	public Odometer getOdometer() {
		return odometer;
	}
	public void setOdometer(Odometer odometer) {
		this.odometer = odometer;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getQuantity() {
		return quantity;
	}
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
}
