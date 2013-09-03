package net.sas.model.bo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

import net.sas.model.enums.Occupation;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Employee extends Person {
	
	@Column(nullable=false)
	private String cin;
	@Column(nullable=false)
	private String number;
	@Enumerated(EnumType.STRING)
	@Column(nullable=false)
	private Occupation occupation;
	@Column(nullable=false)
	private Date hireDate;
	@Column(nullable=false)
	private Double salary;
	@Lob
	private byte[] picture;
	private String trainings;
	@OneToOne(orphanRemoval=true)
	@JoinColumn(name="healthCheck_id", unique=true)
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private HealthCheck healthCheck;
	@OneToOne(orphanRemoval=true)
	@JoinColumn(name="drivingLicense_id", unique=true)
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private DrivingLicense drivingLicense;
	private String notes;
	
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Occupation getOccupation() {
		return occupation;
	}
	public void setOccupation(Occupation occupation) {
		this.occupation = occupation;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public byte[] getPicture() {
		return picture;
	}
	public void setPicture(byte[] picture) {
		this.picture = picture;
	}
	public String getTrainings() {
		return trainings;
	}
	public void setTrainings(String trainings) {
		this.trainings = trainings;
	}
	public HealthCheck getHealthCheck() {
		return healthCheck;
	}
	public void setHealthCheck(HealthCheck healthCheck) {
		this.healthCheck = healthCheck;
	}
	public DrivingLicense getDrivingLicense() {
		return drivingLicense;
	}
	public void setDrivingLicense(DrivingLicense drivingLicense) {
		this.drivingLicense = drivingLicense;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
}
