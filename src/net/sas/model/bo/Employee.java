package net.sas.model.bo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="employee_id")
	private Integer id;
	@Column(nullable = false)
	private String lastName;
	@Column(nullable = false)
	private String firstName;
	@Temporal(TemporalType.DATE)
	private Date birthDate;
	@OneToOne(orphanRemoval = true)
	@JoinColumn(name = "address_id", unique = true)
	@Cascade(value = { CascadeType.SAVE_UPDATE, CascadeType.DELETE })
	private Address address;
	@Column(nullable = false)
	private String phone;
	private String email;
	@Column(nullable = false)
	private String cin;
	@Column(nullable = false)
	private String number;
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Occupation occupation;
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date hireDate;
	@Column(nullable = false)
	private Double salary;
	@Lob
	private byte[] picture;
	private String trainings;
	@OneToOne(orphanRemoval = true)
	@JoinColumn(name = "healthCheck_id", unique = true)
	@Cascade(value = { CascadeType.SAVE_UPDATE, CascadeType.DELETE })
	private HealthCheck healthCheck;
	@OneToOne(cascade = javax.persistence.CascadeType.ALL)
	@PrimaryKeyJoinColumn
	@NotFound(action = NotFoundAction.IGNORE)
	private DrivingLicense drivingLicense;
	
	private String notes;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
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
