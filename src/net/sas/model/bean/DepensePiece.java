package net.sas.model.bean;

import net.sas.model.enums.TypeComposant;

public class DepensePiece extends Depense {

	private TypeComposant piece;
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
