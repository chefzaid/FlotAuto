package net.sas.model.bean;

import java.util.Date;
import java.util.Set;

import net.sas.model.enums.Fonction;

public class Employe extends Personne {
	
	private String cin;
	private String matricule;
	private Fonction fonction;
	private Date dateEmbauche;
	private Double tauxHoraire;
	private byte[] photo;
	private Set<String> certificats;
	private ExamenSante examenSante;
	private Permis permis;
	private String notes;

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public Fonction getFonction() {
		return fonction;
	}

	public void setFonction(Fonction fonction) {
		this.fonction = fonction;
	}

	public Date getDateEmbauche() {
		return dateEmbauche;
	}

	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}

	public Double getTauxHoraire() {
		return tauxHoraire;
	}

	public void setTauxHoraire(Double tauxHoraire) {
		this.tauxHoraire = tauxHoraire;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public Set<String> getCertificats() {
		return certificats;
	}

	public void setCertificats(Set<String> certificats) {
		this.certificats = certificats;
	}

	public ExamenSante getExamenSante() {
		return examenSante;
	}

	public void setExamenSante(ExamenSante examenSante) {
		this.examenSante = examenSante;
	}

	public Permis getPermis() {
		return permis;
	}

	public void setPermis(Permis permis) {
		this.permis = permis;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
}
