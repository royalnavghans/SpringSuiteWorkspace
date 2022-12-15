package com.example.demoSpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoSpringBoot.Jpa.TutorialJPA;
import com.example.demoSpringBoot.bean.Tutorial;

@Service
public class TutorialServices {

	@Autowired
	TutorialJPA tuto;
	
	
	
	public List<Tutorial> get(){return tuto.findAll();}
	public Tutorial getById(int id) {return tuto.findById(id).get();}
	public Tutorial update(Tutorial tut) { return tuto.save(tut);}
    public Tutorial add(Tutorial tut) { return tuto.save(tut);}
    public void delete(int id) {tuto.deleteById(id);}
}
