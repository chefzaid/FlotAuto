package net.sas.model.bean;

import java.io.File;
import java.util.List;

import net.sas.model.enums.Couleur;
import net.sas.model.enums.TypeVehicule;

public class Vehicule {
	
	private Long id;
	private String matricule;
	private String numChassis;
	private File photo;
	private String marque;
	private String modele;
	private Integer annee;
	private Couleur couleur;
	private TypeVehicule type;
	private Boolean etat;
	private Fournisseur fournisseur;
	private Garantie garantie;
	private Vignette vignette;
	private List<Assurance> assurances;
	private List<VisiteTechnique> visitesTechniques;
	private List<Employe> conducteurs;
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
	public File getPhoto() {
		return photo;
	}
	public void setPhoto(File photo) {
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
