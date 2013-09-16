package net.sas.model.bo;

public enum Occupation {
	
	CONTROLLER("Contr�leur"),
	DRIVER("Conducteur"),
	TECHNICIAN("Technicien");
	
	private String status;
	
	private Occupation(String status){
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}
