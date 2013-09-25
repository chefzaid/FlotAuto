package net.sas.model.bo;

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
public class MaintenanceSchedule {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column(nullable=false)
	private String description;
	@OneToOne(orphanRemoval=true)
	@JoinColumn(name="cycle_id", unique=true)
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Cycle frequency;
	@OneToOne(orphanRemoval=true)
	@JoinColumn(name="reminder_id", unique=true)
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Cycle reminder;
	
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
	public Cycle getFrequency() {
		return frequency;
	}
	public void setFrequency(Cycle frequency) {
		this.frequency = frequency;
	}
	public Cycle getReminder() {
		return reminder;
	}
	public void setReminder(Cycle reminder) {
		this.reminder = reminder;
	}
}
