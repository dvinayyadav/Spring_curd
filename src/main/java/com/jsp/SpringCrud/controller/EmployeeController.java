package com.jsp.SpringCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.SpringCrud.dto.Employee;
import com.jsp.SpringCrud.service.EmployeeService;

@RestController
public class EmployeeController {
@Autowired
EmployeeService es;
@PostMapping("/employees")
	public Employee saveController(@RequestBody Employee employee) {
		return es.saveService(employee);
	}
@GetMapping("/employees")
public List<Employee> getAllController(){
	return es.getAllService();
}
@GetMapping("/employees/{id}")
public Employee getById(@PathVariable int id) {
	return es.getByIdService(id);
}
@PutMapping("/employees")
public Employee updateEmployee(@RequestBody Employee employee) {
	return es.updateService(employee);
}
@DeleteMapping("/employees/{id}")
public Employee deleteEmployee(@PathVariable int id) {
	return es.deleteService(id);
}
	
}
