package net.sas.model.enums;

public enum TypeAcquisition {
	ACHAT("Achat"),
	LOCATION("Location");
	
	private String statut;
	
	private TypeAcquisition(String statut){
		this.statut = statut;
	}

	public String getStatut() {
		return statut;
	}
}
