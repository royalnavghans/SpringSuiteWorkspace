package com.spring.Profiles.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Profiles.beans.Country;
import com.spring.Profiles.services.CountryServices;

@RestController
public class CountryController {
	@Autowired
	CountryServices cons;

	@GetMapping("/getList")
	public List<Country> get() {
		return cons.getAll();
	}

	@GetMapping("/getListbyId")
	public Country getByid(@RequestBody int id) {
		return cons.getById(id);
	}

	@PostMapping("/addList")
	public Country add(Country con) {
		return cons.add(con);
	}

	@PostMapping("/addLists")
	public String addAll(List<Country> con) {
		return cons.addAll(con);
	}

	@PutMapping("/updateList")
	public Country update(Country con) {
		return cons.update(con);
	}

	@DeleteMapping("deleteList")
	public void delete(@RequestBody int id) {
		cons.delete(id);
	}
}
