package com.shruthi.bootstarter.rest.resources;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.springframework.stereotype.Component;

@Component
@Path("/hello")
public class HelloWorldResource {

	@GET
	@Path("/")
	@Produces("application/json")
	public String sayHello() {
		return "Hello World!!";

	}

	@GET
	@Path("/user")
	@Produces("application/json")
	public String sayHelloUser(@DefaultValue(value="User") @QueryParam("username") String username) {
		return "Hello " + username;

	}
}
