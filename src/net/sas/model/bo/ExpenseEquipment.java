package net.sas.model.bo;

import javax.persistence.Entity;

import net.sas.model.enums.ComponentType;

@Entity
public class ExpenseEquipment extends Expense {

	public ComponentType getEquipment() {
		return ComponentType.EQUIPMENT;
	}
}
