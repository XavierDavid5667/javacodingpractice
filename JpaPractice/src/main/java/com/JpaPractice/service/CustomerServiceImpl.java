package com.JpaPractice.service;

import java.util.List;

import com.JpaPractice.dao.CustomerDAO;
import com.JpaPractice.dao.CustomerDAOImpl;
import com.JpaPractice.entities.Customer;

public class CustomerServiceImpl implements CustomerService{

	private CustomerDAO customerDAO = new CustomerDAOImpl();
	
	@Override
	public Customer createCustomer(Customer customer) {
		
		return customerDAO.createCustomer(customer);
	}
	@Override
	public Customer retrieveCustomer(Integer customerId) {
		// TODO Auto-generated method stub
		return customerDAO.retrieveCustomer(customerId);
	}
	@Override
	public void updateCustomer(Customer customer) {
		customerDAO.updateCustomer(customer);
		
	}

	@Override
	public List<Customer> getCustomers() {
		
		return customerDAO.getCustomers();
	}

	@Override
	public List<Customer> customers() {
		return customerDAO.customers();
	}

	@Override
	public Customer getCustomerbyId(Integer customerId) {
		
		return customerDAO.getCustomerbyId(customerId);
	}
	@Override
	public List<Customer> getAllCustomers() {
		return customerDAO.getAllCustomers();
	}

	@Override
	public List<Customer> getCustomersCountryWise(String country) {
		return customerDAO.getCustomersCountryWise(country);
	}
}
