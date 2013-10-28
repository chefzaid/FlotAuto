package net.sas.model.bo;

public enum ExpenseType {
	COMPONENT("Composant"), 
	LABOR("Main d'oeuvre"),
	OTHER("Autre");
	
	private String status;
	
	private ExpenseType(String status){
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}
