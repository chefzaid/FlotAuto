package net.sas.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class ExpenseOther extends Expense {

	@Column(nullable=false)
	private String description;

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}	
}
