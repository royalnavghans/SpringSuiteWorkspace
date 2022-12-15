package com.SpringBoot.Query.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.SpringBoot.Query.bean.Product;

public interface ProductJpa extends JpaRepository<Product, Integer> {

	
	public List<Product>findByNameOrDescription(String name,String desc);
	
	public List<Product>findByNameAndDescription(String name,String desc);
	public List<Product>findByPriceGreaterThan(int price);
	public List<Product>findByNameContaining(String name);
	public List<Product>findByNameLike(String name);
	public List<Product>findByPriceBetween(int min,int max);
	public List<Product>findByName(String name);
	public List<Product>findById(int id);
	
	@Query("select min(price),max(price) from Product")
	public Object findMinAndMax();
	
	
	
}
