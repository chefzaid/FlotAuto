package net.sas.model.bo;

public enum ExpenseType {
	
	PART("Pièce"), 
	EQUIPMENT("Matériel"), 
	LABOR("Main d'oeuvre"), 
	WORK_ORDER("Ordre de travail"), 
	OTHER("Autre");
	
	private String status;
	
	private ExpenseType(String status){
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}
