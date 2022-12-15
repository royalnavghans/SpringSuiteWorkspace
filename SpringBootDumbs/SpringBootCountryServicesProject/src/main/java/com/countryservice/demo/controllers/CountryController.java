package com.countryservice.demo.controllers;

import java.util.List;  

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.countryservice.demo.beans.Country;
import com.countryservice.demo.services.CountryService;


@RestController
public class CountryController {
	
	//@Autowired(required=true)
	CountryService countryService= new CountryService();
	
	@GetMapping("/getCountries")
	public List getCountries()
	{
		return countryService.getAllCountries();
	}
	
	@GetMapping("/getCountries/{id}")
	public Country getCountryById(@PathVariable(value="id") int id)
	{
		return countryService.getCountrybyID(id);
	}
	
	@GetMapping("/getCountries/countryname")
	public Country getCountryByName(@RequestParam(value="name") String countryName)
	{
		return countryService.getCountrybyName(countryName);
	}
	
	@PostMapping("/addCountry")
	public Country addCountry(@RequestBody Country country)
	{
		return countryService.addCountry(country);
	}
	
	@PutMapping("/updateCountry")
	public Country updateCountry(@RequestBody Country country)
	{
		return countryService.updateCountry(country);
	}
	
	@DeleteMapping("/deleteCountry/{id}")
	public AddResponse deleteCountry(@PathVariable(value="id") int id)
	{
		return countryService.deleteCountry(id);
	}
}
