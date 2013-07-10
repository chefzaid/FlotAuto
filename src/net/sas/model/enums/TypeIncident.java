package net.sas.model.enums;

public enum TypeIncident {
	
	PANNE("Panne"),
	ACCIDENT("Accident"),
	INFRACTION("Infraction");
	
	private String statut;
	
	private TypeIncident(String statut){
		this.statut = statut;
	}

	public String getStatut() {
		return statut;
	}
}
