package net.sas.model.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column(nullable=false)
	private String brand;
	@Column(nullable=false)
	private String model;
	private Integer year;
	@Enumerated(EnumType.STRING)
	private VehicleType type;
	@Enumerated(EnumType.STRING)
	private Color color;
	@Lob
	private byte[] picture;
	@Column(unique=true, nullable=false)
	private String registrationNumber;
	@Column(unique=true, nullable=false)
	private String chassisNumber;
	@ManyToOne
	@JoinColumn(name="supplier_id")
	@Cascade (value={CascadeType.SAVE_UPDATE})
	private Supplier supplier;
	@OneToOne(orphanRemoval=true)
	@JoinColumn(name="warranty_id", unique=true)
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Warranty warranty;
	@OneToOne(orphanRemoval=true)
	@JoinColumn(name="tax_id", unique=true)
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private VehicleTax tax;
	@OneToOne(orphanRemoval=true)
	@JoinColumn(name="insurance_id", unique=true)
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Insurance insurance;
	@OneToOne(orphanRemoval=true)
	@JoinColumn(name="technicalCheck_id", unique=true)
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private TechnicalCheck technicalCheck;
	private String specs;
	private String notes;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public VehicleType getType() {
		return type;
	}
	public void setType(VehicleType type) {
		this.type = type;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public byte[] getPicture() {
		return picture;
	}
	public void setPicture(byte[] picture) {
		this.picture = picture;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String getChassisNumber() {
		return chassisNumber;
	}
	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public Warranty getWarranty() {
		return warranty;
	}
	public void setWarranty(Warranty warranty) {
		this.warranty = warranty;
	}
	public VehicleTax getTax() {
		return tax;
	}
	public void setTax(VehicleTax tax) {
		this.tax = tax;
	}
	public Insurance getInsurance() {
		return insurance;
	}
	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}
	public TechnicalCheck getTechnicalCheck() {
		return technicalCheck;
	}
	public void setTechnicalCheck(TechnicalCheck technicalCheck) {
		this.technicalCheck = technicalCheck;
	}
	public String getSpecs() {
		return specs;
	}
	public void setSpecs(String specs) {
		this.specs = specs;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
}
