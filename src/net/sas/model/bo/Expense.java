package net.sas.model.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance (strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Expense {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	protected Integer id;
//	@ManyToOne
//	@JoinColumn(name = "maintenance_id")
//	@Cascade(value = { CascadeType.SAVE_UPDATE, CascadeType.DELETE })
//	protected Maintenance maintenance;
	protected Double quantity;
//	@Formula("quantity*unitCost")
	protected transient Double totalCost; //derived property
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getQuantity() {
		return quantity;
	}
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	public Double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}
}
