package com.Austin.credito.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Austin.credito.model.Customer;
import com.Austin.credito.service.CustomerService;

@RestController
@RequestMapping("/Customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/CreateCustomer")
	Customer createCustomer(@RequestBody Customer c){
		return customerService.createcustomer(c);
	}
	
	@GetMapping("/GAS")
	List<Customer> getallcustomer() {
		return customerService.getallcustomer();
	}
	
	@GetMapping("getcustomerbyid/{loanid}")
	Customer getcustomerbyid(@PathVariable Integer loanid) {
		return customerService.getcustomer(loanid);
	}
	
	@DeleteMapping("del/{loanid}")
	String deleteCustomer(@PathVariable Integer loanid) {
		customerService.deleteCustomer(loanid);
		return "successfully deleted";
	}
	
	@PutMapping("up/{loanid}")
	Customer updatecust(@PathVariable Integer loanid, @RequestBody Customer c) {
		
		Customer upcustomer = getcustomerbyid(loanid);
		
		upcustomer.setCustomerName(c.getCustomerName());
		upcustomer.setEmail(c.getEmail());
		
		return customerService.updateCustomer(upcustomer);
	}

}
