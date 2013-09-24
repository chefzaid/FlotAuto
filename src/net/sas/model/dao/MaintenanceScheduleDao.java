package net.sas.model.dao;

import net.sas.model.bo.MaintenanceSchedule;

public class MaintenanceScheduleDao extends GenericDao<MaintenanceSchedule> {

	private String searchQuery = "from MaintenanceProgram where";

	public MaintenanceSchedule findByDescription(String description) {
		return (MaintenanceSchedule) template.find(searchQuery
				+ " description like ?", "%" + description + "%");
	}
}
