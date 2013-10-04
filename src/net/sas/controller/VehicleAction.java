package net.sas.controller;

import java.io.File;
import java.util.List;

import net.sas.model.bo.Supplier;
import net.sas.model.bo.Vehicle;
import net.sas.model.service.VehicleService;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public class VehicleAction implements Action, ModelDriven<Vehicle> {

	private File image;
	private static VehicleService vehicleService = new VehicleService();
	private Vehicle vehicle = new Vehicle();
	private String supplierString;
	
	@Override
	public Vehicle getModel() {
		return vehicle;
	}
	
	@Override
	public String execute() {
		vehicleService  = new VehicleService();
		return Action.INPUT;
	}

	public String view() {
		Integer index = Integer.parseInt(ServletActionContext.getRequest()
				.getParameter("index"));
		vehicleService.view(index);
		return Action.INPUT;
	}

	public String save() {
		vehicleService.save(vehicle, supplierString, image);
		return Action.INPUT;
	}

	public String delete() {
		vehicleService.delete();
		return Action.INPUT;
	}

	public String clear() {
		vehicleService.clear();
		return Action.INPUT;
	}

	public String previous() {
		vehicleService.previous();
		return Action.INPUT;
	}

	public String next() {
		vehicleService.next();
		return Action.INPUT;
	}

	public String first() {
		vehicleService.first();
		return Action.INPUT;
	}

	public String last() {
		vehicleService.last();
		return Action.INPUT;
	}

	public List<Vehicle> getVehicles() {
		return vehicleService.getList();
	}

	public Vehicle getCurrentVehicle() {
		return vehicleService.getCurrentEntry();
	}
	
	public List<Supplier> getSuppliers() {
		return vehicleService.getSuppliers();
	}

	public void setImage(File image) {
		this.image = image;
	}

	public void setSupplierString(String supplierString) {
		this.supplierString = supplierString;
	}
}
