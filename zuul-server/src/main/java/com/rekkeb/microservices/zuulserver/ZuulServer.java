package com.rekkeb.microservices.zuulserver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author BBVA OpenPlatform Developer Team
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulServer {

    public static void main(String args[]){

        new SpringApplicationBuilder((ZuulServer.class)).web(true).run(args);
    }
}
