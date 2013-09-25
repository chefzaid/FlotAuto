package net.sas.model.bo;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class ExpenseGas extends Expense{
	
	@OneToOne(orphanRemoval=true)
	@JoinColumn(name="workOrder_id", unique=true)
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private GasConsumption gas;

	public GasConsumption getGas() {
		return gas;
	}
	public void setGas(GasConsumption gas) {
		this.gas = gas;
	}
}
