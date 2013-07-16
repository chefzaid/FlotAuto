package net.sas.model.bean;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import net.sas.model.enums.Couleur;
import net.sas.model.enums.TypeVehicule;

@Entity
public class Vehicule {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String matricule;
	private String numChassis;
	
	@Lob
	private byte[] photo;
	
	private String marque;
	private String modele;
	private Integer annee;
	
	@Enumerated(EnumType.STRING)
	private Couleur couleur;
	
	@Enumerated(EnumType.STRING)
	private TypeVehicule type;
	
	private Boolean etat;
	
	@ManyToOne
	@JoinColumn(name="fournisseur_id")
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Fournisseur fournisseur;
	
	@OneToOne(orphanRemoval=true)
	@JoinColumn(name="garantie_id", unique=true)
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Garantie garantie;
	
	@OneToOne(orphanRemoval=true)
	@JoinColumn(name="vignette_id", unique=true)
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Vignette vignette;
	
	@OneToMany(mappedBy="vehicule", orphanRemoval=true)
	@JoinColumn(name="vehicule_id")
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE}) 
	private Set<Assurance> assurances;
	
	@OneToMany(mappedBy="vehicule", orphanRemoval=true)
	@JoinColumn(name="vehicule_id")
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE}) 
	private Set<VisiteTechnique> visitesTechniques;
	
	@OneToMany(orphanRemoval=true)
	@JoinColumn(name="vehicule_id")
	private Set<Employe> conducteurs;
	
	private String specifications;
	private String notes;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getNumChassis() {
		return numChassis;
	}
	public void setNumChassis(String numChassis) {
		this.numChassis = numChassis;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public Integer getAnnee() {
		return annee;
	}
	public void setAnnee(Integer annee) {
		this.annee = annee;
	}
	public Couleur getCouleur() {
		return couleur;
	}
	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}
	public TypeVehicule getType() {
		return type;
	}
	public void setType(TypeVehicule type) {
		this.type = type;
	}
	public Boolean getEtat() {
		return etat;
	}
	public void setEtat(Boolean etat) {
		this.etat = etat;
	}
	public Fournisseur getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}
	public Garantie getGarantie() {
		return garantie;
	}
	public void setGarantie(Garantie garantie) {
		this.garantie = garantie;
	}
	public Vignette getVignette() {
		return vignette;
	}
	public void setVignette(Vignette vignette) {
		this.vignette = vignette;
	}
	public Set<Assurance> getAssurances() {
		return assurances;
	}
	public void setAssurances(Set<Assurance> assurances) {
		this.assurances = assurances;
	}
	public Set<VisiteTechnique> getVisitesTechniques() {
		return visitesTechniques;
	}
	public void setVisitesTechniques(Set<VisiteTechnique> visitesTechniques) {
		this.visitesTechniques = visitesTechniques;
	}
	public Set<Employe> getConducteurs() {
		return conducteurs;
	}
	public void setConducteurs(Set<Employe> conducteurs) {
		this.conducteurs = conducteurs;
	}
	public String getSpecifications() {
		return specifications;
	}
	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
}
