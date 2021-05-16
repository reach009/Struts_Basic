package com.tutorialspoint.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class IfElseAction extends ActionSupport {
	private String color;

	@Override
	public String execute() throws Exception {
		System.out.println("Color selected is : " + color);
		return SUCCESS;
	}

	public String display() {
		return NONE;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
