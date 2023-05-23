package com.acme.rms.payload.request;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Data
@EqualsAndHashCode
@ToString
public class EmployeeRequest {

	String empId;
	String name;
	String manangerId;
	String managerName;
	String password;

}
