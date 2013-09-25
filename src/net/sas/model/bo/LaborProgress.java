package net.sas.model.bo;

public enum LaborProgress {
	
	PENDING("En attente"), 
	IN_PROGRESS("En cours"), 
	CLOSED("Fermé");
	
	private String status;
	
	private LaborProgress(String status){
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}
