package org.dailycodechallenge.streams;

import java.util.List;

public class Company {
	
	int companyID;
	String companyName;
	List<Building> buildings;
	
	
	public Company(int companyID, String companyName, List<Building> buildings) {
		super();
		this.companyID = companyID;
		this.companyName = companyName;
		this.buildings = buildings;
	}
	
	public int getCompanyID() {
		return companyID;
	}
	public void setCompanyID(int companyID) {
		this.companyID = companyID;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public List<Building> getBuildings() {
		return buildings;
	}
	public void setBuildings(List<Building> buildings) {
		this.buildings = buildings;
	}
	
	

}
