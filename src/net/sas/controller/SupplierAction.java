package net.sas.controller;

import java.util.List;

import net.sas.model.bo.Supplier;
import net.sas.model.service.SupplierService;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public class SupplierAction implements Action, ModelDriven<Supplier> {

	private static SupplierService supplierService = new SupplierService();
	private Supplier supplier = new Supplier();

	@Override
	public Supplier getModel() {
		return supplier;
	}

	@Override
	public String execute() {
		supplierService = new SupplierService();
		return Action.INPUT;
	}
	
	public String list() {
		return execute();
	}

	public String view() {
		Integer index = Integer.parseInt(ServletActionContext.getRequest()
				.getParameter("index"));
		supplierService.view(index);
		return Action.INPUT;
	}

	public String save() {
		supplierService.save(supplier);
		return Action.INPUT;
	}

	public String delete() {
		supplierService.delete();
		return Action.INPUT;
	}

	public String clear() {
		supplierService.clear();
		return Action.INPUT;
	}

	public String previous() {
		supplierService.previous();
		return Action.INPUT;
	}

	public String next() {
		supplierService.next();
		return Action.INPUT;
	}

	public String first() {
		supplierService.first();
		return Action.INPUT;
	}

	public String last() {
		supplierService.last();
		return Action.INPUT;
	}

	public List<Supplier> getSuppliers() {
		return supplierService.getList();
	}

	public Supplier getCurrentSupplier() {
		return supplierService.getCurrentEntry();
	}

}
