package net.sas.model.bean;

public class ProgrammeEntretien {

	private Long id;
	private String description;
	private Frequence cycle;
	private Frequence rappel;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Frequence getCycle() {
		return cycle;
	}
	public void setCycle(Frequence cycle) {
		this.cycle = cycle;
	}
	public Frequence getRappel() {
		return rappel;
	}
	public void setRappel(Frequence rappel) {
		this.rappel = rappel;
	}
}
