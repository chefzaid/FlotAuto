package net.sas.model.bean;

import net.sas.model.enums.UniteMesure;

public class Frequence {
	
	private Long id;
	private Integer cycle;
	private UniteMesure unite;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getCycle() {
		return cycle;
	}
	public void setCycle(Integer cycle) {
		this.cycle = cycle;
	}
	public UniteMesure getUnite() {
		return unite;
	}
	public void setUnite(UniteMesure unite) {
		this.unite = unite;
	}
}
