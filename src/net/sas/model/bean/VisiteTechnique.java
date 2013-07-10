package net.sas.model.bean;

import java.util.Date;

public class VisiteTechnique {
	
	private Long id;
	private Vehicule vehicule;
	private Date dateVisite;
	private Date dateFuturVisite;
	private Frequence rappel;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Vehicule getVehicule() {
		return vehicule;
	}
	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}
	public Date getDateVisite() {
		return dateVisite;
	}
	public void setDateVisite(Date dateVisite) {
		this.dateVisite = dateVisite;
	}
	public Date getDateFuturVisite() {
		return dateFuturVisite;
	}
	public void setDateFuturVisite(Date dateFuturVisite) {
		this.dateFuturVisite = dateFuturVisite;
	}
	public Frequence getRappel() {
		return rappel;
	}
	public void setRappel(Frequence rappel) {
		this.rappel = rappel;
	}
}
