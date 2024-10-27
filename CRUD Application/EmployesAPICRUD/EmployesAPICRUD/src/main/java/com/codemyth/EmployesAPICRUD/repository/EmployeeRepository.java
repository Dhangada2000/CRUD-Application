package com.codemyth.EmployesAPICRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codemyth.EmployesAPICRUD.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
}
