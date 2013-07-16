package net.sas.model.bean;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import net.sas.model.enums.TypeComposant;

@Entity
public class DepensePiece extends Depense {

	@Enumerated(EnumType.STRING)
	private TypeComposant piece;
	
	@OneToOne(orphanRemoval=true)
    @JoinColumn(name="garantie_id", unique=true)
    @Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Garantie garantie;
	
	public TypeComposant getPiece() {
		return piece;
	}
	public void setPiece(TypeComposant piece) {
		this.piece = piece;
	}
	public Garantie getGarantie() {
		return garantie;
	}
	public void setGarantie(Garantie garantie) {
		this.garantie = garantie;
	}
}
