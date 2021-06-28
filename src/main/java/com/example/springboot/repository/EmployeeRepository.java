package com.example.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.entity.EmployeeEntity;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Integer> {

	// By using customized JPA method way
	public List<EmployeeEntity> findByFnameOrLname(String fname, String lname);
	
	// SQL native query
	@Query(value = "select * from emp where fname = :fname", nativeQuery = true)
	public List<EmployeeEntity> findEmpDetailsByFname(String fname);
	
	// JPQL
	@Query(value = "select e from EmployeeEntity e where lname = :lname")
	public List<EmployeeEntity> findEmpDetailsByLname(String lname);
}
