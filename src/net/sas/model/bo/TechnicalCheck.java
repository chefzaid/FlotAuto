package net.sas.model.bo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class TechnicalCheck {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@OneToOne(mappedBy="technicalCheck")
	private Vehicle vehicle;
	@Column(nullable=false)
	@Temporal(TemporalType.DATE)
	private Date visitDate;
	@Temporal(TemporalType.DATE)
	private Date expireDate;
	private String Observations;
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
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public Date getVisitDate() {
		return visitDate;
	}
	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}
	public Date getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	public String getObservations() {
		return Observations;
	}
	public void setObservations(String observations) {
		Observations = observations;
	}
	public Cycle getReminder() {
		return reminder;
	}
	public void setReminder(Cycle reminder) {
		this.reminder = reminder;
	}
}
