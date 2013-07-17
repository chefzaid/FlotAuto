package net.sas.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import net.sas.model.enums.TypeComposant;

@Entity
public class DepenseMateriel extends Depense {
	
	@Enumerated(EnumType.STRING)
	@Column(nullable=false)
	private TypeComposant materiel;

	public TypeComposant getMateriel() {
		return materiel;
	}

	public void setMateriel(TypeComposant materiel) {
		this.materiel = materiel;
	}
}
