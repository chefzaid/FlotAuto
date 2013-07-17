package net.sas.model.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Entretien {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="vehicule_id")
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Vehicule vehicule;
	
	@ManyToOne
	@JoinColumn(name="programmeEntretien_id")
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private ProgrammeEntretien programmeEntretien;
	
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
	public ProgrammeEntretien getProgrammeEntretien() {
		return programmeEntretien;
	}
	public void setProgrammeEntretien(ProgrammeEntretien programmeEntretien) {
		this.programmeEntretien = programmeEntretien;
	}
}
