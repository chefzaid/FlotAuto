package net.sas.model.enums;

public enum SupplierType {
	
	GARAGE("Garage"), 
	DEALER("Concessionaire"), 
	GAS_STATION("Station de gas"), 
	OTHER("Autre");
	
	private String status;
	
	private SupplierType(String status){
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}
