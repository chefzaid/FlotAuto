package net.sas.model.dao;

import net.sas.model.bo.DrivingLicense;

public class DrivingLicenseDao extends GenericDao<DrivingLicense> {
	
	public DrivingLicenseDao(){
		super(DrivingLicense.class);
	}
	
	public DrivingLicense findByNumber(String number) {
		return (DrivingLicense) template
				.find(searchQuery + "number=?", number).get(0);
	}

}