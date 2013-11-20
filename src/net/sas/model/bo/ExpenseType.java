package net.sas.model.bo;

public enum ExpenseType {
	COMPONENT("Composant"), 
	LUBRICANT("Lubrifiant"),
	OTHER("Autre");
	
	private String status;
	
	private ExpenseType(String status){
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}
