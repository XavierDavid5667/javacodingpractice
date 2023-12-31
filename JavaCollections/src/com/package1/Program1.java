package com.package1;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author xdavid
 * .Scenario based question to write the code : There is an employee class 
which has two employee names, First one is 'NAVEENPRATAP' and 
second one is 'naveen pratap'. Write code to add these names 
to HashSet and HashSet should consider them as duplicate values 
and ignore cases and whitespaces. So instead of two, one value 
should be added to HashSet. 

 *
 */
public class Program1 {
	public static void main(String[] args) {
		Set<Employee>employeeSet=new HashSet<>();
		boolean add = employeeSet.add(new Employee(1, "NAVEENPRATAP".toLowerCase().replaceAll("\\s",""), 5000.0));
		System.out.println(add);
		boolean add2 = employeeSet.add(new Employee(2, "naveen pratap".toLowerCase().replaceAll("\\s",""),6000.0));
		System.out.println(add2);


	}
}
