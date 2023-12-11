package com.package1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program1 {
	
	
	static List<Employee> employees=new ArrayList<>();
	static {
		employees.add(new Employee("Xavier", "David", 50000.0, List.of("Project1", "Project2")));
		employees.add(new Employee("Francis", "David", 70000.0, List.of("Project3", "Project4")));
		employees.add(new Employee("Grace", "David", 80000.0, List.of("Project5", "Project7")));
	}
	
	public static void main(String[] args) {
		
	 Employee orElse = employees.stream().filter((emp)->emp.getSalary()>90000.0).findFirst().orElse(null);
	 System.out.println(orElse);
	
		employees.stream().map((emp)->{
			Employee employee = new Employee(emp.getFirstName(), emp.getLastName(), emp.getSalary()*1.1, emp.getProjects());
			return employee;
		}).forEach(System.out::println);
		}
	}

 