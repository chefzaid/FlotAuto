package net.sas.model.dao;

import java.util.List;

import net.sas.model.bean.Composant;
import net.sas.model.bean.Entretien;
import net.sas.model.bean.ProgrammeEntretien;
import net.sas.model.bean.Vehicule;

public class EntretienDao extends GenericDao<Entretien> {

	private String query = "from Entretien where";

	@SuppressWarnings("unchecked")
	public List<Composant> findByVehicule(String matricule) {
		VehiculeDao dao = new VehiculeDao();
		Vehicule v = dao.findByMatricule(matricule);
		return template.find(query + " vehicule=?", v.getId());
	}

	@SuppressWarnings("unchecked")
	public List<Entretien> findByProgrammeEntretien(String description) {
		ProgrammeEntretienDao dao = new ProgrammeEntretienDao();
		ProgrammeEntretien pe = dao.findByDescription(description);
		return template.find(query + " programmeEntretien =?", pe.getId());
	}
}
