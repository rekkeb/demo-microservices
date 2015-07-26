package com.rekkeb.microservices.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author BBVA OpenPlatform Developer Team
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {

    public static void main(String args[]){

        new SpringApplicationBuilder((EurekaServer.class)).web(true).run(args);
    }
}


