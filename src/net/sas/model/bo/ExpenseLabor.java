package net.sas.model.bo;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class ExpenseLabor extends Expense {

	@OneToOne(orphanRemoval = true)
	@JoinColumn(name = "employee_id", unique = true)
	@Cascade(value = { CascadeType.SAVE_UPDATE})
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Double getCost() {
		return employee.getSalary();
	}

	public String getDescription() {
		return employee.getLastName() + " " + employee.getFirstName() + " ["
				+ employee.getNumber() + "] - "
				+ employee.getOccupation().getStatus();
	}

	public ExpenseType getType() {
		return ExpenseType.LABOR;
	}
}
