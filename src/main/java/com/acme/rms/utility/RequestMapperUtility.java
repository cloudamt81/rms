package com.acme.rms.utility;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import com.acme.rms.models.Employee;
import com.acme.rms.payload.request.EmployeeRequest;


@Component
@Mapper(componentModel = "spring")
public interface RequestMapperUtility {

	@Mapping(source = "employeeRequest.empId", target = "empId")
	@Mapping(source = "employeeRequest.name", target = "name")
	@Mapping(source = "employeeRequest.manangerId", target = "manangerId")
	@Mapping(source = "employeeRequest.managerName", target = "managerName")
	@Mapping(source = "employeeRequest.password", target = "password")

	Employee mapEmployeeRequestToEmployee(EmployeeRequest employeeRequest, Employee employee);

}
