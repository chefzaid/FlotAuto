package net.sas.model.service;

import java.io.File;
import java.util.List;

import net.sas.model.bo.Supplier;
import net.sas.model.bo.Vehicle;
import net.sas.model.dao.SupplierDao;
import net.sas.model.dao.VehicleDao;
import net.sas.util.ContextUtil;
import net.sas.util.ImageUtil;

public class VehicleService {
	private VehicleDao dao;
	private List<Vehicle> vehicles;
	private Vehicle currentVehicle;
	private Integer index;

	public VehicleService() {
		dao = (VehicleDao) ContextUtil.getInstance().getBean("vehicleDao");
		vehicles = dao.read();
		index = vehicles.size();
	}

	public void view(Integer index) {
		this.index = index;
		currentVehicle = vehicles.get(index);
	}

	public void save(Vehicle vehicle, File image) {
		if (image != null) {
			vehicle.setPicture(ImageUtil.getImageBytes(image));
		} else { // if updating employee, keep old image if it hasnt changed
			Vehicle v = vehicles.get(index);
			if (v != null) {
				vehicle.setPicture(v.getPicture());
			}
		}
		vehicle.getInsurance().setVehicle(vehicle);
		vehicle.getTax().setVehicle(vehicle);
		vehicle.getTechnicalCheck().setVehicle(vehicle);
		dao.createOrUpdate(vehicle);

		refresh();
	}

	public void delete() {
		dao.delete(currentVehicle);
		previous();
		refresh();
	}

	public void clear() {
		currentVehicle = null;
	}

	public void previous() {
		index--;
		if (index >= 0) {
			currentVehicle = vehicles.get(index);
		} else {
			index = 0;
		}
	}

	public void next() {
		index++;
		if (index < vehicles.size()) {
			currentVehicle = vehicles.get(index);
		} else {
			index = vehicles.size() - 1;
		}
	}

	public void first() {
		index = 0;
		if (vehicles.size() > 0) {
			currentVehicle = vehicles.get(index);
		}
	}

	public void last() {
		index = vehicles.size() - 1;
		if (vehicles.size() > 0) {
			currentVehicle = vehicles.get(index);
		}
	}

	public void refresh() {
		vehicles = dao.read();
		currentVehicle = vehicles.get(index);
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public List<Supplier> getSuppliers() {
		SupplierDao sdao = (SupplierDao) ContextUtil.getInstance().getBean(
				"supplierDao");
		return sdao.read();
	}

	public Vehicle getCurrentVehicle() {
		return currentVehicle;
	}
}
