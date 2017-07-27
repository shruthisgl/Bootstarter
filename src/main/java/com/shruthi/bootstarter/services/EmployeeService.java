
package com.shruthi.bootstarter.services;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shruthi.bootstarter.dao.EmployeeRepository;
import com.shruthi.bootstarter.domain.Employee;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public Employee create(Employee e) {
		// TODO Auto-generated method stub
		return this.empRepo.save(e);
	}

	@Override
	public Employee retrieve(Integer id) {
		// TODO Auto-generated method stub
		return this.empRepo.findOne(id);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.empRepo.delete(id);
	}

	@Override
	public List<Employee> retrieve() {
		// TODO Auto-generated method stub
		return (List<Employee>) this.empRepo.findAll();
	}

	@Override
	public Employee update(Integer id, Employee emp1) {
		// TODO Auto-generated method stub
		Employee emp = this.retrieve(id);
		if (emp == null) {
			throw new RuntimeErrorException(null, "Employee doesnt exist: " + id);

		}
		emp.setId(emp1.getId());
		emp.setName(emp1.getName());
		emp.setDesignation(emp1.getDesignation());
		emp.setSalary(emp1.getSalary());
		emp.setAddress(emp1.getAddress());

		return emp;
	}

}
