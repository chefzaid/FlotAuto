package net.sas.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class ProgrammeEntretien {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(nullable=false)
	private String description;
	
	@OneToOne(orphanRemoval=true)
	@JoinColumn(name="cycle_id", unique=true)
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Frequence cycle;
	
	@OneToOne(orphanRemoval=true)
	@JoinColumn(name="rappel_id", unique=true)
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Frequence rappel;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
