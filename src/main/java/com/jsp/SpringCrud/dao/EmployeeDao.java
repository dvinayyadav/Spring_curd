package com.jsp.SpringCrud.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.SpringCrud.dto.Employee;
import com.jsp.SpringCrud.repository.EmployeeRepository;

@Repository
public class EmployeeDao {
@Autowired
EmployeeRepository eR;

public Employee saveDao(Employee employee) {
	return eR.save(employee);
}
public List<Employee> getAll(){
	return eR.findAll();
}
public Employee getById(int id) {
	Optional<Employee> optional=eR.findById(id);
	return optional.get();
}
public Employee updateDao(Employee employee) {
	Optional<Employee> optional=eR.findById(employee.getId());
	if(optional!=null) {
		return eR.save(employee);
	}
	return optional.get();
}
public Employee delete(int id) {
	Optional<Employee> optional=eR.findById(id);
	if(optional!=null) {
		eR.delete(optional.get());
}
	return optional.get();
	
}
}
