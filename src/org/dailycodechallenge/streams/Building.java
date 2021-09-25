package org.dailycodechallenge.streams;

import java.util.List;

public class Building {
	
	int buidingID;
	String builingName;
	List<Employee> employees;
	
	public Building(int buidingID, String builingName, List<Employee> employees) {
		super();
		this.buidingID = buidingID;
		this.builingName = builingName;
		this.employees = employees;
	}
	public int getBuidingID() {
		return buidingID;
	}
	public void setBuidingID(int buidingID) {
		this.buidingID = buidingID;
	}
	public String getBuilingName() {
		return builingName;
	}
	public void setBuilingName(String builingName) {
		this.builingName = builingName;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
	
	
}
