package rajesh.kumar.HBP.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import rajesh.kumar.HBP.entity.Student;


@RestController

public class HostelController {
	
	
@Bean
	
public RestTemplate getRestTemplate() {
		
return new RestTemplate();
	
}
	
	
@Autowired
	
private RestTemplate restTemplate;
	
	
static final String STUDENT_URL_MS = "http://localhost:8080/";
	
	@GetMapping("/find/{roll}")
	
public String fetchStudent(@PathVariable int roll) {
		Student student = restTemplate.exchange(STUDENT_URL_MS+"hi/"+roll, HttpMethod.GET,null,Student.class).getBody();
		System.out.println("Student from Student Report Project :"+student);
		
//return restTemplate.exchange(STUDENT_URL_MS+"all/"+roll, HttpMethod.GET,null,String.class).getBody();
		
return restTemplate.getForObject(STUDENT_URL_MS+"all/"+roll, String.class);
		
	
}
	
	
@GetMapping("/find")
	
public String fetchStudents() {
		
return restTemplate.exchange(STUDENT_URL_MS+"hi", HttpMethod.GET, null, String.class).getBody();

}
	
	
//http://localhost:8081/all/110
	
	
@PostMapping("/addStudent")
	
public String addStudent(@RequestBody Student student) {
		return restTemplate.postForObject(STUDENT_URL_MS+"add", student, String.class);
	
}
	


}
