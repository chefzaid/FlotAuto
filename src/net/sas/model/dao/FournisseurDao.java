package net.sas.model.dao;

import java.util.List;

import net.sas.model.bean.Fournisseur;
import net.sas.model.enums.TypeFournisseur;

public class FournisseurDao extends GenericDao<Fournisseur> {

	private String query = "from Fournisseur where";

	public Fournisseur findByRaisonSociale(String raisonSociale) {
		return (Fournisseur) template.find(query + " raisonSociale=?",
				raisonSociale).get(0);
	}

	@SuppressWarnings("unchecked")
	public List<Fournisseur> findByCategorie(TypeFournisseur type) {
		return template.find(query + " categorie=?", type);
	}
	
	@SuppressWarnings("unchecked")
	public List<Fournisseur> findByVille(String ville) {
		return template.find(query + " ville=?", ville);
	}
	
	@SuppressWarnings("unchecked")
	public List<Fournisseur> findByPhone(String phone) {
		return template.find(query + " phone=?", phone);
	}
}
