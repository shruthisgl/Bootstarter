package com.shruthi.bootstarter.services;

import java.util.List;

import com.shruthi.bootstarter.domain.Employee;

public interface IEmployeeService {

	Employee create(Employee e);

	Employee retrieve(Integer id);

	List<Employee> retrieve();

	Employee update(Integer id ,Employee emp1);

	void delete(Integer id);

}
