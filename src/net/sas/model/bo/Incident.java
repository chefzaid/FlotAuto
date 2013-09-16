package net.sas.model.bo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;


@Entity
public class Incident {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private IncidentType type;
	@Temporal(TemporalType.DATE)
	private Date date;
	private Double cost;
	@ManyToOne
	@JoinColumn(name="employee_id")
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private Employee driver;
	private String notes;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public IncidentType getType() {
		return type;
	}
	public void setType(IncidentType type) {
		this.type = type;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public Employee getDriver() {
		return driver;
	}
	public void setDriver(Employee driver) {
		this.driver = driver;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
}
