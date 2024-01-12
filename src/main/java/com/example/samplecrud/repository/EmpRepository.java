package com.example.samplecrud.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.example.samplecrud.model.Employee;

@Repository
public class EmpRepository {

	private List<Employee> empList = new ArrayList<>();

	public void createEmployees() {
		empList = List.of(new Employee(1234, "Emp01", "Engineering", "03-01-1999"),
				new Employee(1235, "Emp05", "Mechenichal", "13-09-2022"),
				new Employee(1236, "Emp06", "Engineering", "09-04-2012"),
				new Employee(1237, "Emp07", "Engineering", "01-01-2024")

		);
	}

	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return empList;
	}

	public Employee findById(int id) {
		for (int i = 0; i < empList.size(); i++) {
			if (empList.get(i).getEmpId() == (id)) {
				return empList.get(i);
			}
		}
		return null;
	}

	public List<Employee> search(String name) {
		return empList.stream().filter(x -> x.getEmpName().startsWith(name)).collect(Collectors.toList());
	}

	public Employee save(Employee p) {
		Employee Employee = new Employee();
		Employee.setEmpId(p.getEmpId());
		Employee.setEmpName(p.getEmpName());
		Employee.setEmpOrg(p.getEmpOrg());
		Employee.setDateOfJoining(p.getDateOfJoining());
		empList.add(Employee);
		return Employee;
	}

	public String delete(Integer id) {
		empList.removeIf(x -> x.getEmpId() == (id));
		return null;
	}

	public Employee update(Employee Employee) {
		System.out.println("updating Employee Details...");
		int idx = 0;
		int id = 0;
		for (int i = 0; i < empList.size(); i++) {
			
			if (empList.get(i).getEmpId() == (Employee.getEmpId())) {
				id = Employee.getEmpId();
				idx = i;
				break;
			}
		}
		System.out.println("found employee ..."+id);
		Employee Employee1 = new Employee();
		Employee1.setEmpId(Employee.getEmpId());
		Employee1.setEmpName(Employee.getEmpName());
		Employee1.setEmpOrg(Employee.getEmpOrg());
		Employee1.setDateOfJoining(Employee.getDateOfJoining());
		empList.set(idx, Employee1);
		return Employee1;
	}
}
