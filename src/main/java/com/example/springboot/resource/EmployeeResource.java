package com.example.springboot.resource;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeResource {

	private Integer empId;
	private String fname;
	private String lname;
	private String address;
	private Double salary;
	private Date joiningDate;
}
