package com.rekkeb.microservices.hello;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.amqp.EnableTurbineAmqp;

/**
 * @author BBVA OpenPlatform Developer Team
 */

@SpringBootApplication
@EnableEurekaClient
@EnableTurbineAmqp
public class TurbineAmqpApp {

    public static void main(String args[]){

        new SpringApplicationBuilder(TurbineAmqpApp.class).run(args);
    }
}
