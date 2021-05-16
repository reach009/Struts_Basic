package com.tutorialspoint.struts2.controlTag;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.util.SubsetIteratorFilter.Decider;

public class Employee {

	private String name;
	private String department;

	public Employee() {
	}

	public Employee(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}

	private List<Employee> employees;
	private List<Employee> contractors;

	public String execute() {
		employees = new ArrayList<Employee>();
		employees.add(new Employee("George", "Recruitment"));
		employees.add(new Employee("Danielle", "Accounts"));
		employees.add(new Employee("Melissa", "Recruitment"));
		employees.add(new Employee("Rose", "Accounts"));

		contractors = new ArrayList<Employee>();
		contractors.add(new Employee("Mindy", "Database"));
		contractors.add(new Employee("Vanessa", "Network"));
		return "success";
	}

	public Decider getRecruitmentDecider() {
		return new Decider() {
			@Override
			public boolean decide(Object element) throws Exception {
				Employee employee = (Employee) element;
				return employee.getDepartment().equals("Recruitment");
			}
		};
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public List<Employee> getContractors() {
		return contractors;
	}

	public void setContractors(List<Employee> contractors) {
		this.contractors = contractors;
	}

}
