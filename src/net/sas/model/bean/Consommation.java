package net.sas.model.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Consommation extends Depense{
	
	@ManyToOne
	@JoinColumn(name="employe_id")
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Employe employe;
	
	@ManyToOne
	@JoinColumn(name="fournisseur_id")
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Fournisseur fournisseur;
	
	private Date dateConsommation;
	
	@OneToOne(orphanRemoval=true)
	@JoinColumn(name="odometreDebut_id", unique=true)
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Odometre odometreDebut;
	
	@OneToOne(orphanRemoval=true)
	@JoinColumn(name="odometreFin_id", unique=true)
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
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
