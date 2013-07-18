package net.sas.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import net.sas.model.enums.ComponentType;

@Entity
public class ExpensePart extends Expense {

	@Enumerated(EnumType.STRING)
	@Column(nullable=false)
	private ComponentType part;
	@OneToOne(orphanRemoval=true)
	@JoinColumn(name="warranty_id", unique=true)
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Warranty warranty;
	
	public ComponentType getPart() {
		return part;
	}
	public void setPart(ComponentType part) {
		this.part = part;
	}
	public Warranty getWarranty() {
		return warranty;
	}
	public void setWarranty(Warranty warranty) {
		this.warranty = warranty;
	}
}
