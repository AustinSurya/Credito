package com.Austin.credito.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Austin.credito.model.Customer;
import com.Austin.credito.repo.CustomerRepo;

@Service
public class CustomerServiceImplementation implements CustomerService {
	
	@Autowired
	CustomerRepo CustomerRepo;

	@Override
	public Customer createcustomer(Customer c) {
		return CustomerRepo.save(c);
	}

	@Override
	public Customer getcustomer(Integer id) {
		return CustomerRepo.findById(id).orElseThrow();
	}

	@Override
	public List<Customer> getallcustomer() {
		// TODO Auto-generated method stub
		return CustomerRepo.findAll();
	}

	@Override
	public Customer updateCustomer(Customer c) {
		
		return CustomerRepo.save(c);
	}

	@Override
	public void deleteCustomer(Integer id) {
		CustomerRepo.deleteById(id);		
	}
	
	

}
