package com.jsp.SpringCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.SpringCrud.dao.EmployeeDao;
import com.jsp.SpringCrud.dto.Employee;

@Service
public class EmployeeService {
@Autowired
EmployeeDao dao;
public Employee saveService(Employee employee) {
	return dao.saveDao(employee);
}
public List<Employee> getAllService(){
	return dao.getAll();
}
public Employee updateService(Employee employee) {
	// TODO Auto-generated method stub
	return dao.updateDao(employee);
}
public Employee deleteService(int id) {
	return dao.delete(id);
}
public Employee getByIdService(int id) {
	return dao.getById(id);
}

}
