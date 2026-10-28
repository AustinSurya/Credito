package com.Austin.credito.service;

import java.util.List;

import com.Austin.credito.model.Customer;

public interface CustomerService {

	Customer createcustomer(Customer c);
	
	Customer getcustomer(Integer id);
	
	List<Customer> getallcustomer();
	
	Customer updateCustomer(Customer c);
	
	void deleteCustomer(Integer id);
	
}
