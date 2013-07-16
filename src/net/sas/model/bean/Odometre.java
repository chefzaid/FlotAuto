package net.sas.model.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Odometre {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToOne(orphanRemoval = true)
	@JoinColumn(name = "odometreDebut_id", unique = true)
	@Cascade(value = { CascadeType.SAVE_UPDATE, CascadeType.DELETE })
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
