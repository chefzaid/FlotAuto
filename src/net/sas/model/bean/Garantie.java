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
public class Garantie {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String reference;
	private Date dateDebut;
	
	@OneToOne(orphanRemoval=true)
    @JoinColumn(name="validite_id", unique=true)
    @Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Frequence validite;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Frequence getValidite() {
		return validite;
	}
	public void setValidite(Frequence validite) {
		this.validite = validite;
	}
}
