package net.sas.model.bo;

import javax.persistence.Entity;

@Entity
public class ExpenseEquipment extends Expense {

	public ComponentType getEquipment() {
		return ComponentType.EQUIPMENT;
	}
}
