package net.sas.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import net.sas.model.enums.ComponentType;

@Entity
public class ExpenseEquipment extends Expense {
	
	@Enumerated(EnumType.STRING)
	@Column(nullable=false)
	private ComponentType equipment;

	public ComponentType getEquipment() {
		return equipment;
	}
	public void setEquipment(ComponentType equipment) {
		this.equipment = equipment;
	}
}
