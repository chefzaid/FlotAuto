package net.sas.model.bean;

import javax.persistence.Column;
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
	private Integer id;
	
	@Column(nullable=false)
	private Integer cycle;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable=false)
	private UniteMesure unite;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
