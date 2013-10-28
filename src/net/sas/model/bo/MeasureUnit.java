package net.sas.model.bo;

public enum MeasureUnit {
	DAY("Jour"), 
	WEEK("Semaine"), 
	MONTH("Mois"), 
	KILOMETER("Kilomètre");
	
	private String status;
	
	private MeasureUnit(String status){
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}
