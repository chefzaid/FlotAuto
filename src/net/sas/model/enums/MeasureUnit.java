package net.sas.model.enums;

public enum MeasureUnit {
	HOUR("Heure"), 
	DAY("Jour"), 
	WEEK("Semaine"), 
	MONTH("Mois"), 
	KILOMETER("Km"), 
	LITER("Litre"),
	KM_H("Km/h");
	
	private String status;
	
	private MeasureUnit(String status){
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}
