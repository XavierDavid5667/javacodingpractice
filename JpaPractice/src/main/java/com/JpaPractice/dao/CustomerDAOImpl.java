package com.JpaPractice.dao;

import java.util.List;

import com.JpaPractice.entities.Customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CustomerDAOImpl implements CustomerDAO{

	@Override
	public Customer createCustomer(Customer customer) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("javapersistance");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(customer);
		em.getTransaction().commit();
		emf.close();  
	    em.close();
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("javapersistance");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Customer cust = em.merge(customer);
		System.out.println(cust);
		em.getTransaction().commit();
		emf.close();  
	    em.close();
		return customer;
	}

	@Override
	public Customer retrieveCustomer(Integer customerId) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("javapersistance");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Customer customer = em.find(Customer.class, customerId);
		em.getTransaction().commit();
		emf.close();  
	    em.close();
		return customer;
	}

	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> customers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerbyId(Integer customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getCustomersCountryWise(String country) {
		// TODO Auto-generated method stub
		return null;
	}

}
