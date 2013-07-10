package net.sas.model.bean;

import java.util.Date;

import net.sas.model.enums.TypeAcquisition;

public class Acquisition {
	
	private Long id;
	private TypeAcquisition type;
	private Vehicule vehicule;
	private Fournisseur fournisseur;
	private Date dateAcquisition;
	private Double prix;
	private Garantie garantie;
	private Odometre odometreAcquisition;
	private String notes;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public TypeAcquisition getType() {
		return type;
	}
	public void setType(TypeAcquisition type) {
		this.type = type;
	}
	public Vehicule getVehicule() {
		return vehicule;
	}
	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}
	public Fournisseur getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}
	public Date getDateAcquisition() {
		return dateAcquisition;
	}
	public void setDateAcquisition(Date dateAcquisition) {
		this.dateAcquisition = dateAcquisition;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	public Garantie getGarantie() {
		return garantie;
	}
	public void setGarantie(Garantie garantie) {
		this.garantie = garantie;
	}
	public Odometre getOdometreAcquisition() {
		return odometreAcquisition;
	}
	public void setOdometreAcquisition(Odometre odometreAcquisition) {
		this.odometreAcquisition = odometreAcquisition;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
}
