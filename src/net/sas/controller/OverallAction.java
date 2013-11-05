package net.sas.controller;

import com.opensymphony.xwork2.Action;

public class OverallAction implements Action {

	@Override
	public String execute() {
		return Action.INPUT;
	}

	public String overall() {
		return execute();
	}

}
