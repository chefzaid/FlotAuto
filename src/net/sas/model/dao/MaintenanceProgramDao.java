package net.sas.model.dao;

import net.sas.model.bo.MaintenanceProgram;

public class MaintenanceProgramDao extends GenericDao<MaintenanceProgram> {

	private String searchQuery = "from MaintenanceProgram where";

	public MaintenanceProgram findByDescription(String description) {
		return (MaintenanceProgram) template.find(searchQuery
				+ " description like ?", "%" + description + "%");
	}
}
