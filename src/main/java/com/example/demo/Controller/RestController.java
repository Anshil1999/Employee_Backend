package com.example.demo.Controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Model.Employee;
import com.example.demo.Service.EmployeeService;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/save-employee")
	@Transactional
	public String registerEmployee(@RequestBody Employee employee) {
		employeeService.saveMyEmployee(employee);
		return employee.getfirstname() + " is successfully registered";
	}
	
	@GetMapping("/getAllEmployees")
	public Iterable<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/delete/{empid}")
	@Transactional
	public Iterable<Employee> deleteEmployee(@PathVariable int empid){
		return employeeService.deleteEmployeeByEmpid(empid);
	}
	
	@GetMapping("/search/{empid}")
	public Employee searchEmployee(@PathVariable int empid) {
		return employeeService.findByEmpid(empid);
	}

}
