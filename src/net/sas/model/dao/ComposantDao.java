package net.sas.model.dao;

import java.util.List;

import net.sas.model.bean.Composant;
import net.sas.model.bean.Fournisseur;
import net.sas.model.enums.TypeComposant;

public class ComposantDao extends GenericDao<Composant> {

	private String query = "from Composant where";

	public Composant findByReference(String reference) {
		return (Composant) template.find(query + " reference=?", reference)
				.get(0);
	}

	@SuppressWarnings("unchecked")
	public List<Composant> findByType(TypeComposant type) {
		return template.find(query + " type=?", type);
	}

	@SuppressWarnings("unchecked")
	public List<Composant> findByDescription(String description) {
		return template.find(query + " description like ?", "%" + description
				+ "%");
	}

	@SuppressWarnings("unchecked")
	public List<Composant> findByMarque(String marque) {
		return template.find(query + " marque=?", marque);
	}
	
	@SuppressWarnings("unchecked")
	public List<Composant> findByFournisseur(String raisonSociale) {
		FournisseurDao dao = new FournisseurDao();
		Fournisseur f = dao.findByRaisonSociale(raisonSociale);
		return template.find(query + " fournisseur=?", f.getId());
	}
}
