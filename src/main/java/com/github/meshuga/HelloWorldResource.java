package com.github.meshuga;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.Optional;

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {

    @GET
    public String sayHello(@QueryParam("name") Optional<String> name) throws Exception {
        return "Hello " + name.orElse("unknown");
    }
}