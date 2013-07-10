package net.sas.model.bean;

public class Entretien {
	
	private Long id;
	private Vehicule vehicule;
	private ProgrammeEntretien programmeEntretien;
	
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
	public ProgrammeEntretien getProgrammeEntretien() {
		return programmeEntretien;
	}
	public void setProgrammeEntretien(ProgrammeEntretien programmeEntretien) {
		this.programmeEntretien = programmeEntretien;
	}
}
