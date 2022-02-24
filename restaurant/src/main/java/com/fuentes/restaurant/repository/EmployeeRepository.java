package com.fuentes.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fuentes.restaurant.VO.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
}
