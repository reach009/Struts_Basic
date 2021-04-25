package com.tutorialspoint.struts2;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class HelloWorldAction extends ActionSupport {

	private String name;

	private static final Logger logger = LogManager.getLogger(HelloWorldAction.class);

	@Override
	public String execute() throws Exception {
		ValueStack stack = ActionContext.getContext().getValueStack();
		Map<String, Object> context = new HashMap<String, Object>();

		context.put("key1", new String("This is key1"));
		context.put("key2", new String("This is key2"));
		stack.push(context);

		logger.info("Size of the valueStack: " + stack.size());

		if ("SECRET".equals(name)) {
			return SUCCESS;
		} else {
			return ERROR;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
