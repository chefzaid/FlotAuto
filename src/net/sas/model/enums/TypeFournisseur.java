package net.sas.model.enums;

public enum TypeFournisseur {
	
	GARAGE("Garage"), 
	CONCESSIONAIRE("Concessionaire"), 
	STATION_GAS("Station de gas"), 
	AUTRE("Autre");
	
	private String statut;
	
	private TypeFournisseur(String statut){
		this.statut = statut;
	}

	public String getStatut() {
		return statut;
	}
}
