package net.sas.model.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class VisiteTechnique {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="vehicule_id")
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Vehicule vehicule;
	
	private Date dateVisite;
	private Date dateFuturVisite;
	
	@OneToOne(orphanRemoval=true)
	@JoinColumn(name="rappel_id", unique=true)
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Frequence rappel;
	
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
	public Date getDateVisite() {
		return dateVisite;
	}
	public void setDateVisite(Date dateVisite) {
		this.dateVisite = dateVisite;
	}
	public Date getDateFuturVisite() {
		return dateFuturVisite;
	}
	public void setDateFuturVisite(Date dateFuturVisite) {
		this.dateFuturVisite = dateFuturVisite;
	}
	public Frequence getRappel() {
		return rappel;
	}
	public void setRappel(Frequence rappel) {
		this.rappel = rappel;
	}
}
