package com.tutorialspoint.struts2.controlTag;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class Color extends ActionSupport {

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
