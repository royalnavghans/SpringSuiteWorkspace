package com.spring.Ass2.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.spring.Ass2.bean.Customer;

public interface Customer_Repo extends JpaRepository<Customer, Integer> {

}
