package net.sas.model.enums;

public enum TypeVehicule {
	
	 CITADINE("Citadine"),
	 QUATREXQUATRE("4x4"),
	 REMORQUE("Remorque"),
	 CAMION("Camion");

	private String statut;
	
	private TypeVehicule(String statut){
		this.statut = statut;
	}

	public String getStatut() {
		return statut;
	}
}
