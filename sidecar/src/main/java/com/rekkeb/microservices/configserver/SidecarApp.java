package com.rekkeb.microservices.configserver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

/**
 * @author BBVA OpenPlatform Developer Team
 */
@SpringBootApplication
@EnableSidecar
public class SidecarApp {

    public static void main(String args[]) {

        new SpringApplicationBuilder(SidecarApp.class).web(true).run(args);
    }

}

