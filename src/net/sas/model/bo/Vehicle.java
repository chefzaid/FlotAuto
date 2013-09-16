package net.sas.model.bo;

import java.util.List;

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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column(unique=true, nullable=false)
	private String registration;
	@Column(unique=true, nullable=false)
	private String chassisNumber;
	@Lob
	private byte[] image;
	@Column(nullable=false)
	private String brand;
	@Column(nullable=false)
	private String model;
	private Integer year;
	@Enumerated(EnumType.STRING)
	private Color color;
	@Enumerated(EnumType.STRING)
	private VehicleType type;
	private boolean active;
	@ManyToOne
	@JoinColumn(name="supplier_id")
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Supplier supplier;
	@OneToOne(orphanRemoval=true)
	@JoinColumn(name="warranty_id", unique=true)
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Warranty warranty;
	@OneToOne(orphanRemoval=true)
	@JoinColumn(name="tax_id", unique=true)
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private VehicleTax tax;
	@OneToMany(mappedBy="vehicle", orphanRemoval=true)
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE}) 
	private List<Insurance> insurances;
	@OneToMany(mappedBy="vehicle", orphanRemoval=true)
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE}) 
	private List<TechnicalCheck> technicalChecks;
	@OneToMany(mappedBy="vehicle", orphanRemoval=true)
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE}) 
	private List<VehicleHistory> history;
	private String specs;
	private String notes;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRegistration() {
		return registration;
	}
	public void setRegistration(String registration) {
		this.registration = registration;
	}
	public String getChassisNumber() {
		return chassisNumber;
	}
	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
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
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public VehicleType getType() {
		return type;
	}
	public void setType(VehicleType type) {
		this.type = type;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
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
	public List<Insurance> getInsurances() {
		return insurances;
	}
	public void setInsurances(List<Insurance> insurances) {
		this.insurances = insurances;
	}
	public List<TechnicalCheck> getTechnicalChecks() {
		return technicalChecks;
	}
	public void setTechnicalChecks(List<TechnicalCheck> technicalChecks) {
		this.technicalChecks = technicalChecks;
	}
	public List<VehicleHistory> getHistory() {
		return history;
	}
	public void setHistory(List<VehicleHistory> history) {
		this.history = history;
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
