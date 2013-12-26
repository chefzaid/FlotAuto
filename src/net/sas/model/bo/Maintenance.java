package net.sas.model.bo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Maintenance {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(nullable = false)
	private String description;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "Maintenance_Expense", 
		joinColumns = { @JoinColumn(name = "maintenance_id") }, 
		inverseJoinColumns = { @JoinColumn(name = "expense_id") })
	private List<Expense> expenses;
	@OneToOne(orphanRemoval = true)
	@JoinColumn(name = "frequency_id")
	@Cascade(value = { CascadeType.ALL })
	private Cycle frequency;
	@OneToOne(orphanRemoval = true)
	@JoinColumn(name = "reminder_id")
	@Cascade(value = { CascadeType.ALL })
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

	public List<Expense> getExpenses() {
		return expenses;
	}

	public void setExpenses(List<Expense> expenses) {
		this.expenses = expenses;
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
