package org.dailycodechallenge.streams;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Application {
	
	public static void main(String[] args) {

		String location = "Kochi";
		List<String> employees = getEmployessByLocation(location);
		System.out.print(String.format("Employees in %s\n",location));
		employees.forEach(emp -> System.out.println(emp));
		
	}
	

	private static List<String> getEmployessByLocation(String Location) {
		
		List<String> EmployeeNames = ComanyDao.getComapnyDetails().stream()
							.map(Company::getBuildings)  
							.flatMap(Collection::stream) //Buidings
							.map(Building::getEmployees)
							.flatMap(Collection::stream) //Employess
							.filter(employess -> employess.getCities().stream()
									.anyMatch(city -> city.getCityName().equals(Location)))
							.map(Employee::getEmployeeName)
							.collect(Collectors.toList());
		
		return EmployeeNames;
	}

}
