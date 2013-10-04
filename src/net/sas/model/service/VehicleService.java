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
		save(vehicle, "", null);
	}

	public void save(Vehicle vehicle, String supplierString, File image) {
		if (image != null) {
			vehicle.setPicture(ImageUtil.getImageBytes(image));
		} else { // if updating vehicle, keep old image if it hasnt changed
			Vehicle v = list.get(index);
			if (v != null) {
				vehicle.setPicture(v.getPicture());
			}
		}
		vehicle.setSupplier(extractSupplier(supplierString));
		vehicle.getInsurance().setVehicle(vehicle);
		vehicle.getTax().setVehicle(vehicle);
		vehicle.getTechnicalCheck().setVehicle(vehicle);
		dao.createOrUpdate(vehicle);

		refresh();
	}
	
	public List<Supplier> getSuppliers() {
		return new SupplierService().getList();
	}
	
	private Supplier extractSupplier(String supplierString){
		Integer id = Integer.parseInt(supplierString);
		return new SupplierService().findById(id);
	}
}
