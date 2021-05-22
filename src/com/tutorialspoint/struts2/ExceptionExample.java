package com.tutorialspoint.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class ExceptionExample extends ActionSupport {

	private String name;

	@Override
	public String execute() {
		String x = null;
		x = x.substring(0);
		return SUCCESS;
	}

	public String display() {
		return NONE;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
