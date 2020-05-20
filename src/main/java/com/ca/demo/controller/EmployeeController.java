package com.ca.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ca.demo.model.Employee;
import com.ca.demo.repo.EmployeeRepo;

@RestController
@RequestMapping("/practice")
public class EmployeeController {
	@Autowired
	private EmployeeRepo repo;
	
	@PostMapping(value = "/save")
	public ResponseEntity<String> saveEmployee(@RequestBody Employee emp) {
		 repo.save(emp);
		//return ResponseEntity.ok("employee saved");
		 return new ResponseEntity<String>("employee saved", HttpStatus.OK);
	}
	@GetMapping(value = "/getAllEmp")
	public List<Employee> getAllEmployee(){
		return repo.findAll();
	}
	@GetMapping("/bydept")
	  public List<Employee> getEmployeeByDept(@PathVariable String dept){ return
	  repo.findByDept(dept); }
	 
	

}
