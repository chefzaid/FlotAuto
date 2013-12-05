package net.sas.model.bo;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class ExpenseComponent extends Expense {

	@OneToOne(orphanRemoval = true)
	@JoinColumn(name = "component_id")
	@Cascade(value = { CascadeType.SAVE_UPDATE})
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
	public String getDetails() {
		return component.getDetails();
	}

	public ExpenseType getType() {
		return ExpenseType.COMPONENT;
	}
}
