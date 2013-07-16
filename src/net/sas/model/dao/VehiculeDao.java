package net.sas.model.dao;

import net.sas.model.bean.Vehicule;

public class VehiculeDao extends GenericDao<Vehicule> {
	
	private String query = "from Vehicule where";
	
	public Vehicule findByMatricule(String matricule){
		return (Vehicule) template.find(query + " matricule=?", matricule).get(
				0);
	}
}
