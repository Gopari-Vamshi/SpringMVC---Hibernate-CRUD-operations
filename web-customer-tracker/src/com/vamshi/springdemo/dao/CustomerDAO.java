package com.vamshi.springdemo.dao;

import java.util.List;

import javax.validation.Valid;

import com.vamshi.springdemo.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);

	public List<Customer> searchCustomers(String theSearchName);

	public void updateCustomer(@Valid Customer theCustomer);

}
