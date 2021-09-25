package org.dailycodechallenge.streams;

import java.util.List;

public class Employee {

	int employeeID;
	String employeeName;
	List<City> cities;
	
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public List<City> getCities() {
		return cities;
	}
	public void setCities(List<City> cities) {
		this.cities = cities;
	}
	public Employee(int employeeID, String employeeName, List<City> cities) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.cities = cities;
	}
	
	}


