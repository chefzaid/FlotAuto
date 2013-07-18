package net.sas.model.enums;

public enum WorkOrderState {
	
	PENDING("En attente"), 
	IN_PROGRESS("En cours"), 
	CLOSED("Fermé");
	
	private String status;
	
	private WorkOrderState(String status){
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}
