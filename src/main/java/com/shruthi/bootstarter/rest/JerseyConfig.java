package com.shruthi.bootstarter.rest;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.logging.LoggingFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;


@Component
@ApplicationPath("/rest")
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		packages("com.shruthi.bootstarter.rest.resources");
		register(LoggingFeature.class);
	}

}
