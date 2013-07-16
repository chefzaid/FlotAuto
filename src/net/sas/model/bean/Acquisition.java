package net.sas.model.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import net.sas.model.enums.TypeAcquisition;

@Entity
public class Acquisition {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private TypeAcquisition type;
	
	@OneToOne(orphanRemoval=true)
	@JoinColumn(name="vehicule_id", unique=true)
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Vehicule vehicule;
	
	@ManyToOne
	@JoinColumn(name="fournisseur_id")
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Fournisseur fournisseur;
	
	private Date dateAcquisition;
	private Double prix;
	
	@OneToOne(orphanRemoval=true)
	@JoinColumn(name="garantie_id", unique=true)
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Garantie garantie;
	
	@OneToOne(orphanRemoval=true)
	@JoinColumn(name="odometre_id", unique=true)
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
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
