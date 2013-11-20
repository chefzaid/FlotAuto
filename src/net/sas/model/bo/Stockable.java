package net.sas.model.bo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Inheritance (strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Stockable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private Integer id;
	@Column(nullable=false)
	private String label;
	private String brand;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable (name="Stockable_Supplier", 
			joinColumns={@JoinColumn(name="stockable_id")},
			inverseJoinColumns={@JoinColumn(name="supplier_id")})
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE}) 
	private List<Supplier> suppliers;
	private Integer stockQuantity;
	private Double price;
	private String reference;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public List<Supplier> getSuppliers() {
		return suppliers;
	}
	public void setSuppliers(List<Supplier> suppliers) {
		this.suppliers = suppliers;
	}
	public Integer getStockQuantity() {
		return stockQuantity;
	}
	public void setStockQuantity(Integer stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
}
