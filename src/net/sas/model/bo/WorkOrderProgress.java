package net.sas.model.bo;

public enum WorkOrderProgress {
	
	PENDING("En attente"), 
	IN_PROGRESS("En cours"), 
	CLOSED("Ferm�");
	
	private String status;
	
	private WorkOrderProgress(String status){
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}
