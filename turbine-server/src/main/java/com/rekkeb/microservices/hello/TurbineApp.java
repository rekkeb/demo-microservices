package com.rekkeb.microservices.hello;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author BBVA OpenPlatform Developer Team
 */

@SpringBootApplication
@EnableEurekaClient
@EnableTurbine
public class TurbineApp {

    public static void main(String args[]){

        new SpringApplicationBuilder(TurbineApp.class).run(args);
    }
}
