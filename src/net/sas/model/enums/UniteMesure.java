package net.sas.model.enums;

public enum UniteMesure {
	HEURE("H"), 
	JOUR("Jr"), 
	SEMAINE("Semaine"), 
	MOIS("Mois"), 
	KILOMETRE("Km"), 
	LITRE("L");
	
	private String statut;
	
	private UniteMesure(String statut){
		this.statut = statut;
	}

	public String getStatut() {
		return statut;
	}
}
