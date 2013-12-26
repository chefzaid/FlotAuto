package net.sas.model.service;

import java.io.File;
import java.util.List;

import net.sas.model.bo.Supplier;
import net.sas.model.bo.Vehicle;
import net.sas.util.ImageUtil;

public class VehicleService extends GenericService<Vehicle> {

	public VehicleService() {
		super("vehicleDao");
	}
	
	@Override
	public void save(Vehicle vehicle) {
		save(vehicle, 0, null);
	}

	public void save(Vehicle vehicle, Integer supplierId, File image) {
		if (image != null) {
			vehicle.setPicture(ImageUtil.getImageBytes(image));
		} 
		Supplier s = new SupplierService().findById(supplierId);
		vehicle.setSupplier(s);
		vehicle.getInsurance().setVehicle(vehicle);
		vehicle.getTax().setVehicle(vehicle);
		vehicle.getTechnicalCheck().setVehicle(vehicle);
		
		if(vehicle.getId() == null){ // if inserting
			dao.create(vehicle);
			index++;
		}else if(vehicle.getId() != null){ // if updating
			if (image == null)  { // keep old image if it hasnt changed
				Vehicle v = list.get(index);
				if (v != null) {
					vehicle.setPicture(v.getPicture());
				}
			}
			dao.update(vehicle);
		}
		
		refresh();
	}
	
	public List<Supplier> getSuppliers() {
		return new SupplierService().getList();
	}
}
