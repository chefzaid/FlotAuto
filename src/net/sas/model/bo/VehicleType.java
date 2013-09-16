package net.sas.model.bo;

public enum VehicleType {
	
	 VAN("Citadine"),
	 SUV("4x4"),
	 TRAILER("Remorque"),
	 TRUCK("Camion");

	private String status;
	
	private VehicleType(String status){
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}
