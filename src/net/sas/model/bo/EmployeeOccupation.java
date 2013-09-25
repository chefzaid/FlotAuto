package net.sas.model.bo;

public enum EmployeeOccupation {
	
	CONTROLLER("Contr�leur"),
	DRIVER("Conducteur"),
	TECHNICIAN("Technicien");
	
	private String status;
	
	private EmployeeOccupation(String status){
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}
