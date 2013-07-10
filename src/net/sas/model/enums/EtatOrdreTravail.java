package net.sas.model.enums;

public enum EtatOrdreTravail {
	
	EN_ATTENTE("En attente"), 
	EN_COURS("En cours"), 
	FERME("Fermé");
	
	private String statut;
	
	private EtatOrdreTravail(String statut){
		this.statut = statut;
	}

	public String getStatut() {
		return statut;
	}
}
