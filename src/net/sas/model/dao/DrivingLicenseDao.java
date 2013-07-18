package net.sas.model.dao;

import net.sas.model.bean.DrivingLicense;

public class DrivingLicenseDao extends GenericDao<DrivingLicense> {

	private String searchQuery = "from DrivingLicense where";
	
	public DrivingLicense findByNumber(String number) {
		return (DrivingLicense) template
				.find(searchQuery + " number=?", number).get(0);
	}

}