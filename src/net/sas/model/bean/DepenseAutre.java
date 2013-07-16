package net.sas.model.bean;

import javax.persistence.Entity;

@Entity
public class DepenseAutre extends Depense {

	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}	
}
