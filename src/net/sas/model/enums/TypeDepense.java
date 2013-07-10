package net.sas.model.enums;

public enum TypeDepense {
	
	PIECE("Pièce"), 
	MATERIEL("Matériel"), 
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
