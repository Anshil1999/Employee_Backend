package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
	
	public Iterable<Employee> deleteByEmpid(int empid);
	public Employee findByEmpid(int empid);

}
