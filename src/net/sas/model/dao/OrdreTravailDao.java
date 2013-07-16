package net.sas.model.dao;

import java.util.List;

import net.sas.model.bean.Employe;
import net.sas.model.bean.OrdreTravail;
import net.sas.model.bean.Vehicule;
import net.sas.model.enums.EtatOrdreTravail;
import net.sas.model.enums.Fonction;

public class OrdreTravailDao extends GenericDao<OrdreTravail> {

	private String query = "from OrdreTravail where";

	public OrdreTravail findByReference(String reference) {
		return (OrdreTravail) template.find(query + " reference=?", reference);
	}

	@SuppressWarnings("unchecked")
	public List<OrdreTravail> findByVehicule(String matricule) {
		VehiculeDao dao = new VehiculeDao();
		Vehicule v = dao.findByMatricule(matricule);
		return template.find(query + " vehicule=?", v.getId());
	}

	@SuppressWarnings("unchecked")
	public List<OrdreTravail> findByConducteur(String matricule) {
		EmployeDao dao = new EmployeDao();
		Employe e = dao.findByMatricule(matricule);
		return template.find(query + " matricule=? and fonction=?",
				e.getMatricule(), Fonction.CONDUCTEUR);
	}

	@SuppressWarnings("unchecked")
	public List<OrdreTravail> findByTechnicien(String matricule) {
		EmployeDao dao = new EmployeDao();
		Employe e = dao.findByMatricule(matricule);
		return template.find(query + " matricule=? and fonction=?",
				e.getMatricule(), Fonction.TECHNICIEN);
	}

	@SuppressWarnings("unchecked")
	public List<OrdreTravail> findByEtat(EtatOrdreTravail etat) {
		return template.find(query + " etat=?", etat);
	}

	@SuppressWarnings("unchecked")
	public List<OrdreTravail> findByDescription(String description) {
		return template.find(query + " description like ?", "%" + description
				+ "%");
	}
}
