package com.acme.rms.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acme.rms.models.Employee;
import com.acme.rms.payload.request.EmployeeRequest;
import com.acme.rms.security.services.EmployeeService;
import com.acme.rms.utility.RequestMapperUtility;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	@Autowired
	EmployeeService service;

	Logger logger = LogManager.getLogger(EmployeeController.class);

	@PostMapping
	public void addEmployee(@RequestBody EmployeeRequest empRequest) {

		RequestMapperUtility requestMapperUtility = Mappers.getMapper(RequestMapperUtility.class);
		service.addEmployee(requestMapperUtility.mapEmployeeRequestToEmployee(empRequest, new Employee()));
		//"Employee Id " + empRequest.getEmpId() + " added successfully!";

	}

}
