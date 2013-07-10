package net.sas.model.bean;

import java.util.Date;

import net.sas.model.enums.EtatOrdreTravail;

public class OrdreTravail {
	
	private Long id;
	private Vehicule vehicule;
	private Date dateCreation;
	private Date dateRequis;
	private Employe employeDemandant;
	private Employe employeCharge;
	private String description;
	private EtatOrdreTravail etat;
	private Odometre odometre;
	private String reference;
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
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Date getDateRequis() {
		return dateRequis;
	}
	public void setDateRequis(Date dateRequis) {
		this.dateRequis = dateRequis;
	}
	public Employe getEmployeDemandant() {
		return employeDemandant;
	}
	public void setEmployeDemandant(Employe employeDemandant) {
		this.employeDemandant = employeDemandant;
	}
	public Employe getEmployeCharge() {
		return employeCharge;
	}
	public void setEmployeCharge(Employe employeCharge) {
		this.employeCharge = employeCharge;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public EtatOrdreTravail getEtat() {
		return etat;
	}
	public void setEtat(EtatOrdreTravail etat) {
		this.etat = etat;
	}
	public Odometre getOdometre() {
		return odometre;
	}
	public void setOdometre(Odometre odometre) {
		this.odometre = odometre;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
}
