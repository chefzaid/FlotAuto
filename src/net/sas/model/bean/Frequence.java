package net.sas.model.bean;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import net.sas.model.enums.UniteMesure;

@Entity
public class Frequence {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private Integer cycle;
	
	@Enumerated(EnumType.STRING)
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
