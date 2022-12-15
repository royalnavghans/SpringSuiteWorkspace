package com.SpringBoot.mongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.mongo.bean.NexwaveEmployee;
import com.SpringBoot.mongo.jpa.NexwaveRepo;

@Service
public class NexwaveService {
@Autowired
	NexwaveRepo repo;
	
	
public List<NexwaveEmployee>getAllInfo(){
	return repo.findAll();
}

public void addInfo(NexwaveEmployee nex) {
	repo.save(nex);
}

public NexwaveEmployee update(NexwaveEmployee nex) {
	return repo.save(nex);
}

public void delete (int id) {
	repo.deleteById(id);
}
}
