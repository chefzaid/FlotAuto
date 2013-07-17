package net.sas.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Inheritance (strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Depense {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	protected Integer id;
	
	@ManyToOne
	@JoinColumn(name="vehicule_id")
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	protected Vehicule vehicule;
	
	protected Integer quantite;
	
	@Column(nullable=false)
	protected Double coutUnitaire;
	
	protected Double couTotal; //derived property
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Vehicule getVehicule() {
		return vehicule;
	}
	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}
	public Integer getQuantite() {
		return quantite;
	}
	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}
	public Double getCoutUnitaire() {
		return coutUnitaire;
	}
	public void setCoutUnitaire(Double coutUnitaire) {
		this.coutUnitaire = coutUnitaire;
	}
	public Double getCouTotal() {
		return couTotal;
	}
	public void setCouTotal(Double couTotal) {
		this.couTotal = couTotal;
	}
}
