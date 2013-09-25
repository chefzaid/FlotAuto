package net.sas.model.bo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class GasConsumption {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	protected Integer id;
	@ManyToOne
	@JoinColumn(name="employeeRequesting_id")
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Employee employeeRequesting;
	@ManyToOne
	@JoinColumn(name="supplier_id")
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Supplier supplier;
	private Double price;
	private Date fillingDate;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Employee getEmployeeRequesting() {
		return employeeRequesting;
	}
	public void setEmployeeRequesting(Employee employeeRequesting) {
		this.employeeRequesting = employeeRequesting;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Date getFillingDate() {
		return fillingDate;
	}
	public void setFillingDate(Date fillingDate) {
		this.fillingDate = fillingDate;
	}
}
