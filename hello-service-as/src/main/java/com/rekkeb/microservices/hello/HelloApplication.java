package com.rekkeb.microservices.hello;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author BBVA OpenPlatform Developer Team
 */

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class HelloApplication {

    public static void main(String args[]){

        new SpringApplicationBuilder(HelloApplication.class).run(args);
    }
}
