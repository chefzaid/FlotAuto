package net.sas.model.enums;

public enum ComponentType {
	PART("Pièce"), 
	EQUIPMENT("Matériel"),
	TIRE("Pneu");
	
	private String status;
	
	private ComponentType(String status){
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}
