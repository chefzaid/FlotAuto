package net.sas.model.bean;

import net.sas.model.enums.TypeComposant;

public class DepenseMateriel extends Depense {
	
	private TypeComposant materiel;

	public TypeComposant getMateriel() {
		return materiel;
	}

	public void setMateriel(TypeComposant materiel) {
		this.materiel = materiel;
	}
}
