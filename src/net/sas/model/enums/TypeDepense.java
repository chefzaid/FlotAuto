package net.sas.model.enums;

public enum TypeDepense {
	
	PIECE("Pi�ce"), 
	MATERIEL("Mat�riel"), 
	MAIN_OEUVRE("Main d'oeuvre"), 
	MISSION("Mission"), 
	AUTRE("Autre");
	
	private String statut;
	
	private TypeDepense(String statut){
		this.statut = statut;
	}

	public String getStatut() {
		return statut;
	}
}
