package com.shruthi.bootstarter.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shruthi.bootstarter.domain.Employee;

@Repository
public class EmployeeRepository implements CrudRepository<Employee, Integer>{
	
	private List<Employee> employees = new ArrayList<Employee>();
	
	@PostConstruct
	public void initialize() {
		
		this.employees.add(new Employee(1, "Shruthi", "SSE", 250000d, ""));
		this.employees.add(new Employee(2, "Shruthi1", "SSE", 250000d, ""));
		this.employees.add(new Employee(3, "Shruthi2", "SSE", 250000d, ""));
		this.employees.add(new Employee(4, "Shruthi3", "SSE", 250000d, ""));
		this.employees.add(new Employee(5, "Shruthi4", "SSE", 250000d, ""));
		this.employees.add(new Employee(6, "Shruthi5", "SSE", 250000d, ""));
		
	}
	
	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Integer arg0) {
		// TODO Auto-generated method stub
		this.employees.remove(arg0.intValue()-1);
	}

	@Override
	public void delete(Employee arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Employee> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(Integer arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Employee> findAll() {
		// TODO Auto-generated method stub
		return this.employees;
	}

	@Override
	public Iterable<Employee> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findOne(Integer arg0) {
		// TODO Auto-generated method stub
		return this.employees.get(arg0);
	}

	@Override
	public <S extends Employee> S save(S arg0) {
		// TODO Auto-generated method stub
		 this.employees.add(arg0);
		 return arg0;
		 
	}

	@Override
	public <S extends Employee> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
