package net.sas.model.bo;

public enum IncidentType {
	
	BREAK_DOWN("Panne"),
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
