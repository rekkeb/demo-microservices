package com.rekkeb.microservices.hello;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author BBVA OpenPlatform Developer Team
 */

@SpringBootApplication
//@EnableEurekaClient
@EnableHystrixDashboard
public class DashboardApplication {

    public static void main(String args[]){

        new SpringApplicationBuilder(DashboardApplication.class).run(args);
    }
}
