package com.spring.Profiles2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.spring.Profiles2.beans.Country;

@RestController
public class Controllers {
	@Bean
public RestTemplate getRest() {
	return new RestTemplate();
}
	//@Autowired
	private RestTemplate rest= new RestTemplate();
	
	static final String COUNTRY_URL="http://localhost:8081/";
	@GetMapping("/getOne/{id}")
	public String getCountry(@PathVariable int id) {
		Country con=rest.exchange(COUNTRY_URL+"getListbyId/"+id,HttpMethod.GET,null,Country.class).getBody();
		return rest.getForObject(COUNTRY_URL+"getListbyId/"+id,null,String.class);
	}
	
	@GetMapping("/getCountry")
	public String getAllCountry() {
		return rest.exchange(COUNTRY_URL+"getList", HttpMethod.GET,null,String.class).getBody();
	}
	@PostMapping("/addCountry")
	public String addCountry(@RequestBody Country con) {
		return rest.postForObject(COUNTRY_URL+"addList", con, String.class);
	}
}
