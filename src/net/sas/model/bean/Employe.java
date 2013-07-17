package net.sas.model.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import net.sas.model.enums.Fonction;

@Entity
public class Employe extends Personne {
	
	@Column(nullable=false)
	private String cin;
	
	@Column(nullable=false)
	private String matricule;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable=false)
	private Fonction fonction;
	
	@Column(nullable=false)
	private Date dateEmbauche;
	
	@Column(nullable=false)
	private Double tauxHoraire;
	
	@Lob
	private byte[] photo;
	
	@ElementCollection
	private List<String> certificats;
	
	@OneToOne(orphanRemoval=true)
	@JoinColumn(name="examenSante_id", unique=true)
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private ExamenSante examenSante;
	
	@OneToOne(orphanRemoval=true)
	@JoinColumn(name="permis_id", unique=true)
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
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

	public List<String> getCertificats() {
		return certificats;
	}

	public void setCertificats(List<String> certificats) {
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
