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

import net.sas.model.enums.EtatOrdreTravail;

@Entity
public class OrdreTravail {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="vehicule_id")
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Vehicule vehicule;
	
	private Date dateCreation;
	private Date dateRequis;
	
	@ManyToOne
	@JoinColumn(name="employeDemandant_id")
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Employe employeDemandant;
	
	@ManyToOne
	@JoinColumn(name="employeCharge_id")
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Employe employeCharge;
	
	private String description;
	
	@Enumerated(EnumType.STRING)
	private EtatOrdreTravail etat;
	
	@OneToOne(orphanRemoval=true)
    @JoinColumn(name="odometre_id", unique=true)
    @Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
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
