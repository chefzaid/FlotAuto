package net.sas.model.enums;

public enum Fonction {
	
	CONTROLEUR("Contr�leur"),
	CONDUCTEUR("Conducteur"),
	TECHNICIEN("Technicien");
	
	private String statut;
	
	private Fonction(String statut){
		this.statut = statut;
	}

	public String getStatut() {
		return statut;
	}
}
