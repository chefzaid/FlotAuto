package net.sas.model.bo;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Entity;

@Entity
public class Lubricant extends Stockable {

	@Enumerated(EnumType.STRING)
	private LubricantType type;

	public LubricantType getType() {
		return type;
	}
	public void setType(LubricantType type) {
		this.type = type;
	}
	
	public String getDetails(){
		return brand + ' ' + label + " [" + reference + "] - " + type.getStatus();
	}
}
