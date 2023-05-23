package com.acme.rms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acme.rms.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	String findByEmpId(String empId);

}
