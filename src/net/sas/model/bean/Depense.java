package net.sas.model.bean;

public abstract class Depense {
	
	protected Long id;
	protected Vehicule vehicule;
	protected Integer quantite;
	protected Double coutUnitaire;
	protected Double couTotal; //derived property
	
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
