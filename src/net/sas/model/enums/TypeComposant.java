package net.sas.model.enums;

public enum TypeComposant {
	PIECE("Pi�ce"), 
	MATERIEL("Mat�riel"),
	PNEU("Pneu");
	
	private String statut;
	
	private TypeComposant(String statut){
		this.statut = statut;
	}

	public String getStatut() {
		return statut;
	}
}
