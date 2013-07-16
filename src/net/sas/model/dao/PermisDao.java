package net.sas.model.dao;

import net.sas.model.bean.Permis;

public class PermisDao extends GenericDao<Permis> {

	private String query = "from Permis where";

	public Permis findByNumero(String numero) {
		return (Permis) template.find(query + " numero=?", numero).get(0);
	}

}
