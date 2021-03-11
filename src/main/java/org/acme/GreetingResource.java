package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello-resteasy")
public class GreetingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Greet hello() {
        final Greet greet = new Greet();
        greet.setGreetingText("Hello");
        return greet;
    }
}