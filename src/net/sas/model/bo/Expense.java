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
	protected Integer quantity;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
}
