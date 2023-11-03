package com.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.beans.Employee;
import com.emp.service.EmployeeService;


@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@PostMapping(path="/save",consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> saveEmployee(@RequestBody Employee employee){
		Employee emp = service.saveEmployee(employee);
		return ResponseEntity.status(200).body(emp);
	}
	
	@GetMapping(path = "/employee/{id}")
	public ResponseEntity<Object> getEmployeeById(@PathVariable int id) {
	    Employee employee = service.findByEmp_id(id);

	    if (employee != null) {
	        return ResponseEntity.status(200).body(employee);
	    } else {
	        return ResponseEntity.status(404).body("Employee not found");
	    }
	}

	
	
	
}

