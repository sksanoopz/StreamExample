package org.dailycodechallenge.streams;

import java.util.Arrays;
import java.util.List;

public class ComanyDao {
	
	public static List<Company> getComapnyDetails()
	{
		//City
		City c1 = new City(1,"Thrissur");
		City c2 = new City(2,"Kochi");
		City c3 = new City(3,"Trivandum");
		//Employee
		Employee e1 = new Employee(1, "Karthik", Arrays.asList(c1));
		Employee e2 = new Employee(2, "Manu", Arrays.asList(c1));
		Employee e3 = new Employee(3, "Kiran", Arrays.asList(c2));
		Employee e4 = new Employee(3, "Raju", Arrays.asList(c2));
		//Building
		Building b1 = new Building(1, "Ganga", Arrays.asList(e1,e4));
		Building b2 = new Building(2, "Yamuna", Arrays.asList(e3));
		Building b3 = new Building(3, "Nila",Arrays.asList(e2));
		
		//Company
		Company comp1 = new Company(1, "Tek City",Arrays.asList(b1,b3));
		Company comp2 = new Company(2, "Info City",Arrays.asList(b2));
		
		List<Company> companies = Arrays.asList(comp1,comp2);
		
		return companies;
	}

}
