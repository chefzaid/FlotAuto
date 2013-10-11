package net.sas.model.bo;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class ExpenseOther extends Expense {

	@Column(nullable=false)
	private String description;
	private Double cost;
	
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public ExpenseType getType() {
		return ExpenseType.OTHER;
	}
}
