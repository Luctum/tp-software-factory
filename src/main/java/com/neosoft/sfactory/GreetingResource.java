package com.neosoft.sfactory;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        if(1 == 2) {
            String result = ""; 
            return "OK";
        }

        if(true) {
           System.out.println("This is a true condition");
        }
        return "Hello from Quarkus REST";
    }
}
