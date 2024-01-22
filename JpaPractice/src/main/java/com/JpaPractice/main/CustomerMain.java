package com.JpaPractice.main;

import java.time.LocalDate;

import com.JpaPractice.entities.Address;
import com.JpaPractice.entities.Customer;
import com.JpaPractice.service.CustomerService;
import com.JpaPractice.service.CustomerServiceImpl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CustomerMain {
	public static void main(String[] args) {
		
		CustomerService customerService=new CustomerServiceImpl();
		
		
		Address address1 = new Address();
		
		address1.setCity("Fatorda");
		address1.setCountry("India");
		address1.setStreet("Dongorwado");
		address1.setPincode(403602);
		
		Customer customer1 = new Customer();
		customer1.setAddress(address1);
		customer1.setName("Xavier DAVID");
		customer1.setDateOfBirth(LocalDate.of(2000,10,16));
        
		//customerService.createCustomer(customer1);
		
		Customer customer2=new Customer();
		customer2.setAddress(address1);
		customer2.setName("Francis David");
		customer2.setDateOfBirth(LocalDate.of(2002, 03, 03));
		
		//customerService.createCustomer(customer2);
		
		Customer retrieveCustomer = customerService.retrieveCustomer(52);
		System.out.println(retrieveCustomer);

	}
}
