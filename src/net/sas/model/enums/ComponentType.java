package net.sas.model.enums;

public enum ComponentType {
	PART("Pi�ce"), 
	EQUIPMENT("Mat�riel"),
	TIRE("Pneu");
	
	private String status;
	
	private ComponentType(String status){
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}
