package net.sas.model.bo;

public enum MeasureUnit {
	DAY("jours"), 
	WEEK("semaines"), 
	MONTH("mois"), 
	KILOMETER("kilom�tres");
	
	private String status;
	
	private MeasureUnit(String status){
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}
