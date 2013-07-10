package net.sas.model.bean;

import java.util.Date;

public class Consommation extends Depense{
	
	private Employe employe;
	private Fournisseur fournisseur;	
	private Date dateConsommation;
	private Odometre odometreDebut;
	private Odometre odometreFin;
	private String ville;
	private String notes;
	
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	public Fournisseur getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}
	public Date getDateConsommation() {
		return dateConsommation;
	}
	public void setDateConsommation(Date dateConsommation) {
		this.dateConsommation = dateConsommation;
	}
	public Odometre getOdometreDebut() {
		return odometreDebut;
	}
	public void setOdometreDebut(Odometre odometreDebut) {
		this.odometreDebut = odometreDebut;
	}
	public Odometre getOdometreFin() {
		return odometreFin;
	}
	public void setOdometreFin(Odometre odometreFin) {
		this.odometreFin = odometreFin;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
}
