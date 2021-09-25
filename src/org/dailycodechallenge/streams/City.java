package org.dailycodechallenge.streams;

public class City {
	int cityID;
	String cityName;
	
	
	public City(int cityID, String cityName) {
		super();
		this.cityID = cityID;
		this.cityName = cityName;
	}
	public int getCityID() {
		return cityID;
	}
	public void setCityID(int cityID) {
		this.cityID = cityID;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
}
