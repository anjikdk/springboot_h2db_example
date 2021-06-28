package com.example.springboot.service;

import java.util.List;

import com.example.springboot.resource.EmployeeResource;

public interface EmployeeService {

	public EmployeeResource saveEmp(EmployeeResource employeeResource);

	public EmployeeResource getEmployeeDetailsById(Integer empId);

	public List<EmployeeResource> getEmployeeDetailsByFnameOrLname(String name);

	public void deleteEmp(Integer empId);

	public List<EmployeeResource> getEmployeeDetailsByFname(String fname);

	public List<EmployeeResource> getEmployeeDetailsByLname(String lname);
}
