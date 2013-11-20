package net.sas.controller;

import java.util.List;

import net.sas.model.bo.Lubricant;
import net.sas.model.bo.Supplier;
import net.sas.model.service.LubricantService;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public class LubricantAction implements Action, ModelDriven<Lubricant> {

	private static LubricantService lubricantService = new LubricantService();
	private Lubricant lubricant = new Lubricant();
	private String supplierList;

	@Override
	public Lubricant getModel() {
		return lubricant;
	}

	@Override
	public String execute() {
		lubricantService = new LubricantService();
		return Action.INPUT;
	}
	
	public String list() {
		return execute();
	}

	public String view() {
		Integer index = Integer.parseInt(ServletActionContext.getRequest()
				.getParameter("index"));
		lubricantService.view(index);
		return Action.INPUT;
	}

	public String save() {
		lubricantService.save(lubricant, supplierList);
		return Action.INPUT;
	}

	public String delete() {
		lubricantService.delete();
		return Action.INPUT;
	}

	public String clear() {
		lubricantService.clear();
		return Action.INPUT;
	}

	public String previous() {
		lubricantService.previous();
		return Action.INPUT;
	}

	public String next() {
		lubricantService.next();
		return Action.INPUT;
	}

	public String first() {
		lubricantService.first();
		return Action.INPUT;
	}

	public String last() {
		lubricantService.last();
		return Action.INPUT;
	}

	public List<Lubricant> getLubricants() {
		return lubricantService.getList();
	}

	public Lubricant getCurrentLubricant() {
		return lubricantService.getCurrentEntry();
	}

	public List<Supplier> getAllSuppliers() {
		return lubricantService.getAllSuppliers();
	}

	public void setSupplierList(String supplierList) {
		this.supplierList = supplierList;
	}
}
