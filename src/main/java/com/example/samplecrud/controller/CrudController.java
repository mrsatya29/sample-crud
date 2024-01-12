package com.example.samplecrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.samplecrud.model.Employee;
import com.example.samplecrud.service.EmployeeService;

@RestController
@RequestMapping("/api/v1/employee")
public class CrudController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee Employee) {
        return service.saveEmployee(Employee);
    }

    @GetMapping
    public List<Employee> findAllEmployees() {
        return service.getEmployees();
    }

    @GetMapping("{id}")
    public Employee findEmployeeById(@PathVariable int id) {
        return service.getEmployeeById(id);
    }

    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee Employee) {
        return service.updateEmployee(Employee);
    }

    @DeleteMapping("{id}")
    public String deleteEmployee(@PathVariable int id) {
        return service.deleteEmployee(id);
    }
}
