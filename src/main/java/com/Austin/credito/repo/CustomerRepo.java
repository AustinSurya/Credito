package com.Austin.credito.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Austin.credito.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
