package com.jsp.SpringCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.SpringCrud.dto.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
