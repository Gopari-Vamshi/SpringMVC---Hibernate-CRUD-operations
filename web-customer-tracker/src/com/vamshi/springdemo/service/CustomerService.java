package com.vamshi.springdemo.service;

import java.util.List;

import javax.validation.Valid;

import com.vamshi.springdemo.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);

	public List<Customer> searchCustomers(String theSearchName);

	public void updateCustomer(@Valid Customer theCustomer);
}
