package com.example.demoSpringBoot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoSpringBoot.Bean.Passport;
import com.example.demoSpringBoot.JPA.Passport_JPA;

@Service
public class Passport_Service {
    @Autowired
	Passport_JPA jpa;
	
	public List<Passport> getList(){
		return jpa.findAll();
	}
	public Passport getById(int id) {
		return jpa.findById(id).get();
	}
	
	public Passport getByName(String Name) {
		List<Passport> lis=jpa.findAll();
		Passport lis1=null;
		for(Passport pass:lis) {
			if(pass.getSTD_NAME().equalsIgnoreCase(Name)) 
				
			lis1=pass;
		}
		return lis1;
	}
	
	public Passport addList(Passport pass) {
		return jpa.save(pass);
	}
	
	public Passport update(Passport pass) {
		return jpa.save(pass);
	}
	
	public void delete(int id) {
		jpa.deleteById(id);
	}
}
