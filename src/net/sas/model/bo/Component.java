package net.sas.model.bo;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Component extends Stockable{
	
	@Enumerated(EnumType.STRING)
	private ComponentType type;
	@OneToOne(orphanRemoval=true)
	@JoinColumn(name="warranty_id")
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Warranty warranty;
	
	public ComponentType getType() {
		return type;
	}
	public void setType(ComponentType type) {
		this.type = type;
	}
	public Warranty getWarranty() {
		return warranty;
	}
	public void setWarranty(Warranty warranty) {
		this.warranty = warranty;
	}
}