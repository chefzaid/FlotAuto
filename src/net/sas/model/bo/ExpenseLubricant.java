package net.sas.model.bo;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class ExpenseLubricant extends Expense {

	@OneToOne(orphanRemoval = true)
	@JoinColumn(name = "lubricant_id", unique = true)
	@Cascade(value = { CascadeType.SAVE_UPDATE })
	private Lubricant lubricant;

	public Lubricant getLubricant() {
		return lubricant;
	}
	public void setLubricant(Lubricant lubricant) {
		this.lubricant = lubricant;
	}

	public Double getCost() {
		return lubricant.getPrice();
	}

	public String getDescription() {
		return lubricant.getBrand() + " " + lubricant.getLabel() + " ["
				+ lubricant.getReference() + "] - "
				+ lubricant.getType().getStatus();
	}

	public ExpenseType getType() {
		return ExpenseType.LUBRICANT;
	}
}
