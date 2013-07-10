package net.sas.model.bean;

import java.util.Date;

public class Garantie {
	
	private Long id;
	private String reference;
	private Date dateDebut;
	private Frequence validite;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Frequence getValidite() {
		return validite;
	}
	public void setValidite(Frequence validite) {
		this.validite = validite;
	}
}
