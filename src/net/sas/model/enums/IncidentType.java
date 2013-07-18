package net.sas.model.enums;

public enum IncidentType {
	
	FAILURE("Panne"),
	ACCIDENT("Accident"),
	INFRINGEMENT("Infraction");
	
	private String status;
	
	private IncidentType(String status){
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}
