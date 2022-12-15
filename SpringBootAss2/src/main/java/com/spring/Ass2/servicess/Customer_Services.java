package com.spring.Ass2.servicess;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Ass2.bean.Customer;
import com.spring.Ass2.repo.Customer_Repo;
@Service
public class Customer_Services {
	@Autowired
	Customer_Repo cust;

	public void Add(Customer custs) {
		 cust.save(custs);
	}

	public List<Customer> getAll() {
		return cust.findAll();
	}

	public Customer getOne(int id) {
		return cust.findById(id).get();
	}

	public Customer update(Customer custs) {
		return cust.save(custs);
	}

	public void delete(int id) {
		cust.deleteById(id);
	}
}
