package net.sas.controller;

import com.opensymphony.xwork2.Action;

public class MaintenanceAction implements Action {

	@Override
	public String execute() {
		return Action.INPUT;
	}
	
	public String list() {
		return execute();
	}

}