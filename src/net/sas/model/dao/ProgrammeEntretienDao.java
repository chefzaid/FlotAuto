package net.sas.model.dao;

import net.sas.model.bean.ProgrammeEntretien;

public class ProgrammeEntretienDao extends GenericDao<ProgrammeEntretien> {

	private String query = "from ProgrammeEntretien where";

	public ProgrammeEntretien findByDescription(String description) {
		return (ProgrammeEntretien) template.find(
				query + " description like ?", "%" + description + "%");
	}
}
