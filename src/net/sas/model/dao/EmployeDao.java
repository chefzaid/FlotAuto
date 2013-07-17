package net.sas.model.dao;

import java.util.List;

import net.sas.model.bean.Employe;
import net.sas.model.bean.Permis;
import net.sas.model.enums.Fonction;
import net.sas.model.service.ContextUtil;

public class EmployeDao extends GenericDao<Employe> {

	private String query = "from Employe where";

	@SuppressWarnings("unchecked")
	public List<Employe> findByNom(String nom) {
		return template.find(query + " nom=?", nom);
	}

	@SuppressWarnings("unchecked")
	public List<Employe> findByPrenom(String prenom) {
		return template.find(query + " prenom=?", prenom);
	}

	@SuppressWarnings("unchecked")
	public List<Employe> findByFonction(Fonction fonction) {
		return template.find(query + " fonction=?", fonction);
	}

	public Employe findByMatricule(String matricule) {
		return (Employe) template.find(query + " matricule=?", matricule)
				.get(0);
	}

	public Employe findByCin(String cin) {
		return (Employe) template.find(query + " cin=?", cin).get(0);
	}

	public Employe findByPermis(String numero) {
		Permis p = ((PermisDao) ContextUtil.getInstance().getBean(
			"permisDao")).findByNumero(numero);
		return (Employe) template.find(query + " permis_id=?", p.getId())
				.get(0);
	}
}
