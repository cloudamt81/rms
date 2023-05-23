package com.acme.rms.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acme.rms.models.Employee;
import com.acme.rms.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository empRepo;

	public String addEmployee(Employee emp) {

		empRepo.save(emp);

		return emp.getEmpId();
	}
}
