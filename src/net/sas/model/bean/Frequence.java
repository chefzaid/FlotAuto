package net.sas.model.bean;

import net.sas.model.enums.UniteMesure;

public class Frequence {
	
	private Long id;
	private Integer rotation;
	private UniteMesure unite;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getRotation() {
		return rotation;
	}
	public void setRotation(Integer rotation) {
		this.rotation = rotation;
	}
	public UniteMesure getUnite() {
		return unite;
	}
	public void setUnite(UniteMesure unite) {
		this.unite = unite;
	}
}
