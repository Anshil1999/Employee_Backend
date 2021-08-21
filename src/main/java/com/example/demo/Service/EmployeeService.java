package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Employee;
import com.example.demo.Repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repo;

	public EmployeeService() {}
	
	public EmployeeService(EmployeeRepository repo) {
		this.repo = repo;
	}
	
	public void saveMyEmployee(Employee employee) {
		repo.save(employee);
	}
	
	public Iterable<Employee> getAllEmployees(){
		return repo.findAll();
	}
	
	public Iterable<Employee> deleteEmployeeByEmpid(int empid){
		repo.deleteByEmpid(empid);
		return repo.findAll();
	}
	
	public Employee findByEmpid(int empid) {
		return repo.findByEmpid(empid);
	}	
}
