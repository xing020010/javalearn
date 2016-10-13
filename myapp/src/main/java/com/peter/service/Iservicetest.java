package com.peter.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public interface Iservicetest {

	@GET
    @Path("/products")
    @Produces(MediaType.TEXT_PLAIN)
    String test1();
}
