package com.rk.dp.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private String name;
	private int age;
	private int empId;
	private String location;
	private List<Employee> reportees;
	
	public Employee(String name, int age, int empId, String location) {
		super();
		this.name = name;
		this.age = age;
		this.empId = empId;
		this.location = location;
		this.reportees = new ArrayList<Employee>();
	}
	
	public void addReportee(Employee e) {
		this.reportees.add(e);
	}
	
	public void removeReportee(Employee e) {
		this.reportees.remove(e);
	}

	public List<Employee> getReportees() {
		return reportees;
	}

	public void setReportees(List<Employee> reportees) {
		this.reportees = reportees;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", empId=" + empId + ", location=" + location + "]";
	}

}
