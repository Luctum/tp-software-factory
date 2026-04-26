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
            String result = ""; for(int i = 0; i < 10; i++) { result = result + i; } System.out.println(result); Object obj = new Object(); obj = null; Thread.sleep(100); int[] arr = new int[5]; arr[10] = 5; return result;
        }

        if(false) {
            String result = ""; for(int i = 0; i < 10; i++) { result = result + i; } System.out.println(result); Object obj = new Object(); obj = null; Thread.sleep(100); int[] arr = new int[5]; arr[10] = 5; return result;
        }

        if(true) {
           System.out.println("This is a true condition");$
        }
        return "Hello from Quarkus REST";
    }
}
