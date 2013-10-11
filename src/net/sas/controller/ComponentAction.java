package net.sas.controller;

import java.util.List;

import net.sas.model.bo.Component;
import net.sas.model.bo.Supplier;
import net.sas.model.service.ComponentService;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public class ComponentAction implements Action, ModelDriven<Component> {

	private static ComponentService componentService = new ComponentService();
	private Component component = new Component();
	private String supplierList;

	@Override
	public Component getModel() {
		return component;
	}

	@Override
	public String execute() {
		componentService = new ComponentService();
		return Action.INPUT;
	}
	
	public String list() {
		return execute();
	}

	public String view() {
		Integer index = Integer.parseInt(ServletActionContext.getRequest()
				.getParameter("index"));
		componentService.view(index);
		return Action.INPUT;
	}

	public String save() {
		componentService.save(component, supplierList);
		return Action.INPUT;
	}

	public String delete() {
		componentService.delete();
		return Action.INPUT;
	}

	public String clear() {
		componentService.clear();
		return Action.INPUT;
	}

	public String previous() {
		componentService.previous();
		return Action.INPUT;
	}

	public String next() {
		componentService.next();
		return Action.INPUT;
	}

	public String first() {
		componentService.first();
		return Action.INPUT;
	}

	public String last() {
		componentService.last();
		return Action.INPUT;
	}

	public List<Component> getComponents() {
		return componentService.getList();
	}

	public Component getCurrentComponent() {
		return componentService.getCurrentEntry();
	}

	public List<Supplier> getAllSuppliers() {
		return componentService.getAllSuppliers();
	}

	public void setSupplierList(String supplierList) {
		this.supplierList = supplierList;
	}
}
