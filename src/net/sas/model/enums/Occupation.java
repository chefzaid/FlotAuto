package net.sas.model.enums;

public enum Occupation {
	
	CONTROLLER("Contr�leur"),
	DRIVER("Conducteur"),
	TECHNICIAN("Technicien");
	
	private String status;
	
	private Occupation(String status){
		this.status = status;
	}

	public String getStatut() {
		return status;
	}
}
