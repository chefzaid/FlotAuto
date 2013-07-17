package net.sas.model.bean;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
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
	private Integer id;
	
	@Column(unique=true, nullable=false)
	private String matricule;
	
	@Column(unique=true, nullable=false)
	private String numChassis;
	
	@Lob
	private byte[] photo;
	
	@Column(nullable=false)
	private String marque;
	
	@Column(nullable=false)
	private String modele;
	
	private Integer annee;
	
	@Enumerated(EnumType.STRING)
	private Couleur couleur;
	
	@Enumerated(EnumType.STRING)
	private TypeVehicule type;
	
	private boolean actif;
	
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
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE}) 
	private List<Assurance> assurances;
	
	@OneToMany(mappedBy="vehicule", orphanRemoval=true)
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE}) 
	private List<VisiteTechnique> visitesTechniques;
	
	@ManyToMany
	@JoinTable (name="Vehicule_Conducteur", 
			joinColumns={@JoinColumn(name="vehicule_id")},
			inverseJoinColumns={@JoinColumn(name="employe_id")})
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE}) 
	private List<Employe> conducteurs;
	
	private String specifications;
	private String notes;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public boolean isActif() {
		return actif;
	}
	public void setActif(boolean actif) {
		this.actif = actif;
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
	public List<Assurance> getAssurances() {
		return assurances;
	}
	public void setAssurances(List<Assurance> assurances) {
		this.assurances = assurances;
	}
	public List<VisiteTechnique> getVisitesTechniques() {
		return visitesTechniques;
	}
	public void setVisitesTechniques(List<VisiteTechnique> visitesTechniques) {
		this.visitesTechniques = visitesTechniques;
	}
	public List<Employe> getConducteurs() {
		return conducteurs;
	}
	public void setConducteurs(List<Employe> conducteurs) {
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
