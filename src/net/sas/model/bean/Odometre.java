package net.sas.model.bean;

import java.util.Date;

public class Odometre {
	
	private Long id;
	private Vehicule vehicule;
	private Integer compteur;
	private Date dateLecture;
	private String notes;
	
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
	public Integer getCompteur() {
		return compteur;
	}
	public void setCompteur(Integer compteur) {
		this.compteur = compteur;
	}
	public Date getDateLecture() {
		return dateLecture;
	}
	public void setDateLecture(Date dateLecture) {
		this.dateLecture = dateLecture;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
}
