package net.sas.model.enums;

public enum TypeComposant {
	PIECE("Pièce"), 
	MATERIEL("Matériel"),
	PNEU("Pneu");
	
	private String statut;
	
	private TypeComposant(String statut){
		this.statut = statut;
	}

	public String getStatut() {
		return statut;
	}
}
