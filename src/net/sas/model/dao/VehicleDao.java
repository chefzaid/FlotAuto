package net.sas.model.dao;

import net.sas.model.bo.Vehicle;

public class VehicleDao extends GenericDao<Vehicle> {

	private String searchQuery = "from Vehicle where";
	
	public Vehicle findByRegistration(String registration) {
		return (Vehicle) template.find(searchQuery + " registration=?",
				registration).get(0);
	}
}
