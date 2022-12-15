package com.SpringBoot.Query.Jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.SpringBoot.Query.bean.Laptops;

public interface LaptopJpa extends JpaRepository<Laptops, Integer> {
	
	@Query("from Laptops where price>=?1 and price<=?2")
	public List<Laptops>FetchlaptopByPriceRange(int min,int max);
	@Query("from Laptops where name=?1")
	public List<Laptops>FetchlaptopByName(String name);
	@Query("select name from Laptops where brand=?1" )
	public List<Laptops>FetchNameByBrand(String name);
	@Query("select price from Laptops where brand=?1" )
	public String FetchPriceByBrand(String name);
	@Query("select description from Laptops where price=?1 and brand=?2" )
	public String FetchDescriptionbyPriceandBrand(double price,String brand);
	@Query("select brand from Laptops where name=?1" )
	public String SearchBrandbyName(String name);
	@Query("select max(price) from Laptops" )
	public double FetchMaxPrice();
	@Query("select min(price) from Laptops" )
	public double FetchMinPrice();
	@Query("select avg(price) from Laptops" )
	public double FetchAvgPrice();
	@Query("select sum(price) from Laptops" )
	public double FetchTotalPrice();
	@Query("select count(*) from Laptops" )
	public int FetchCount();
	
	@Query("SELECT max(price),min(price),avg(price),count(*),sum(price) from Laptops")
	public Object fetchAggregateData();
}
