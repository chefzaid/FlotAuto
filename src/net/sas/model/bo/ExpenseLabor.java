package net.sas.model.bo;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class ExpenseLabor extends Expense{
	
	@OneToOne(orphanRemoval=true)
	@JoinColumn(name="workOrder_id", unique=true)
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Labor workOrder;

	public Labor getWorkOrder() {
		return workOrder;
	}
	public void setWorkOrder(Labor workOrder) {
		this.workOrder = workOrder;
	}
}
