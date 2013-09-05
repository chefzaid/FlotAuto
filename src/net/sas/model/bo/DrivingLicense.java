package net.sas.model.bo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class DrivingLicense {

	@Id
	@GenericGenerator(name = "generator", strategy = "foreign", 
		parameters = @Parameter(name = "property", value = "employee"))
	@GeneratedValue(generator = "generator")
	private Integer id;
	@OneToOne(mappedBy = "drivingLicense", cascade = javax.persistence.CascadeType.ALL)
	private Employee employee;
	@Column(unique = true, nullable = false)
	private String number;
	@Column(nullable = false)
	private String type;
	@Column(nullable = false)
	private Date obtainDate;
	@Column(nullable = false)
	private Date expireDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getObtainDate() {
		return obtainDate;
	}

	public void setObtainDate(Date obtainDate) {
		this.obtainDate = obtainDate;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
}
