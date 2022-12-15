package com.SpringBoot.mongo.jpa;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.SpringBoot.mongo.bean.NexwaveEmployee;

public interface NexwaveRepo extends MongoRepository<NexwaveEmployee, Integer> {

}
