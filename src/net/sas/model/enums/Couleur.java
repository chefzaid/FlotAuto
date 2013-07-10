package net.sas.model.enums;

public enum Couleur {
	
	NOIR("Noir"),
	BLEU("Bleu"),
	BLANC("Blanc"),
	ROUGE("Rouge"),
	VERT("Vert"),
	JAUNE("Jaune");
	
	private String statut;
	
	private Couleur(String statut){
		this.statut = statut;
	}

	public String getStatut() {
		return statut;
	}
}
