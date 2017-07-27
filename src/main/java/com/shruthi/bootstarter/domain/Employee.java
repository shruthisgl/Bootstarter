package com.shruthi.bootstarter.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {

	private Integer id;
	private String name;
	private Double salary;
	private String designation;
	private String address;
	
	public Employee(){
		
	}

	public Employee(Integer id, String name, String designation, Double salary, String address) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.address = address;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
