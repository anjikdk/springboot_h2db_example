package com.example.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.resource.EmployeeResource;
import com.example.springboot.resource.SucessMessageResource;
import com.example.springboot.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/emp")
	public ResponseEntity<EmployeeResource> saveEmp(@RequestBody EmployeeResource employeeResource)
	{
		employeeResource = employeeService.saveEmp(employeeResource);
		
		return new ResponseEntity<>(employeeResource, HttpStatus.CREATED);
	}
	
	@GetMapping("/emp/{empId}")
	public ResponseEntity<EmployeeResource> getEmployeeDetailsById(@PathVariable("empId") Integer empId)
	{
		EmployeeResource employeeResource = employeeService.getEmployeeDetailsById(empId);
		
		return new ResponseEntity<>(employeeResource, HttpStatus.OK);
	}
	
	@GetMapping("/emp")
	public ResponseEntity<List<EmployeeResource>> getEmployeeDetailsByFnameOrLname(@RequestParam("name") String name)
	{
		List<EmployeeResource> empListResources = employeeService.getEmployeeDetailsByFnameOrLname(name);
		
		return new ResponseEntity<>(empListResources, HttpStatus.OK);
	}
	
	@PutMapping("/emp")
	public ResponseEntity<EmployeeResource> updateEmp(@RequestBody EmployeeResource employeeResource)
	{
		// Here save method will work as update because of record already exist in DB
		employeeResource = employeeService.saveEmp(employeeResource);
		
		return new ResponseEntity<>(employeeResource, HttpStatus.OK);
	}
	
	@DeleteMapping("/emp/{empId}")
	public ResponseEntity<SucessMessageResource> deleteEmp(@PathVariable("empId") Integer empId)
	{
		employeeService.deleteEmp(empId);
		SucessMessageResource sucessMessageResource = new SucessMessageResource();
		sucessMessageResource.setMessage("Employee Record deleted Successfully");
		sucessMessageResource.setStatus("200");
		
		return new ResponseEntity<>(sucessMessageResource, HttpStatus.OK);
	}
}
