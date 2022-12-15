package com.spring.Query.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.Query.bean.Supplier;

public interface Supplier_Jpa extends JpaRepository<Supplier, Integer> {

	
	@Query("from Supplier where supp_Id=?1 and suppname=?2")
	public Supplier findBySuppIdandName(int id,String name);
	
	
	@Query("from Supplier where supp_Id= ?1 or suppname= ?2")
	public Supplier findBySuppIdorName(int id,String name);
	
	
	@Query(value = "select * from supplier_table where location =?1",nativeQuery = true)
	public List<Supplier> findsupplocation(String loc);
	
	
	@Query("SELECT max(supp_cost),min(supp_cost),avg(supp_cost),count(*),sum(supp_cost) from Supplier")
	public Object fetchAggregateData();
	
	
	
}
