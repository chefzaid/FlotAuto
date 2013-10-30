package net.sas.model.bo;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class ExpenseComponent extends Expense {

	@OneToOne(orphanRemoval = true)
	@JoinColumn(name = "component_id", unique = true)
	@Cascade(value = { CascadeType.SAVE_UPDATE, CascadeType.DELETE })
	private Component component;

	public Component getComponent() {
		return component;
	}

	public void setComponent(Component component) {
		this.component = component;
	}

	public Double getCost() {
		return component.getPrice();
	}

	public String getDescription() {
		return component.getLabel() + " - " + component.getBrand() + " (ref: "
				+ component.getReference() + ") : "
				+ component.getType().getStatus();
	}

	public ExpenseType getType() {
		return ExpenseType.COMPONENT;
	}
}
