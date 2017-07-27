package com.shruthi.bootstarter.rest.resources;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shruthi.bootstarter.domain.Employee;
import com.shruthi.bootstarter.services.EmployeeService;

@Path("/employee")
@Component
public class EmployeeResource {

	@Autowired
	private EmployeeService empService;

	@GET
	@Path("/all")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML + ";qs=0.9" })
	public List<Employee> getAll() {

		List<Employee> emps = this.empService.retrieve();
		System.out.println(Arrays.toString(emps.toArray()));
		return this.empService.retrieve();

	}

	@GET
	@Path("/{id}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML + ";qs=0.9" })
	public Employee get(@PathParam("id") Integer empId) {
		return this.empService.retrieve(empId);
	}

	@DELETE
	@Path("/{id}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML + ";qs=0.9" })
	public void delete(@PathParam("id") Integer empId) {
		this.empService.delete(empId);
	}

	@POST
	@Path("/")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML + ";qs=0.9" })
	public Employee create(@DefaultValue("2") @FormParam("id") Integer id,
			@DefaultValue("dummy") @FormParam("name") String name,
			@DefaultValue("dummy") @FormParam("designation") String designation,
			@DefaultValue("0d") @FormParam("salary") Double salary,
			@DefaultValue("dummy") @FormParam("address") String address) {
		return this.empService.create(new Employee(id, name, designation, salary, address));
	}

	@PUT
	@Path("/{id}")
	@Consumes({ MediaType.APPLICATION_FORM_URLENCODED, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML + ";qs=0.9" })
	public Employee update(@PathParam("id") Integer empId, Employee emp) {
		return this.empService.update(empId, emp);
	}
}
