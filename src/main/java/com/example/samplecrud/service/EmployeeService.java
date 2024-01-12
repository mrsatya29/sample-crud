package com.example.samplecrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.samplecrud.model.Employee;
import com.example.samplecrud.repository.EmpRepository;

@Service
public class EmployeeService {
	
	
	@Autowired
	 private EmpRepository repository;

	    public Employee saveEmployee(Employee Employee) {
	        return repository.save(Employee);
	    }

	    public List<Employee> getEmployees() {
	        return repository.getAllEmployee();
	    }

	    public Employee getEmployeeById(int id) {
	        return repository.findById(id);
	    }

	    public String deleteEmployee(int id) {
	        repository.delete(id);
	        return "Employee removed !! " + id;
	    }

	    public Employee updateEmployee(Employee Employee) {
	       return repository.update(Employee);
	    }

}
