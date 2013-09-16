package net.sas.model.bo;

public enum AcquisitionType {
	PURCHASE("Achat"),
	RENT("Location");
	
	private String status;
	
	private AcquisitionType(String status){
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}
