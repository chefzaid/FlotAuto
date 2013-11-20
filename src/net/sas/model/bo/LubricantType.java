package net.sas.model.bo;

public enum LubricantType {
	MOTOR_OIL("Huile moteur"),
	BRAKE_OIL("Huile frein"),
	GAS("Gasoline");
	
	private String status;
	
	private LubricantType(String status){
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}
