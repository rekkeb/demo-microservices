package com.rekkeb.microservices.hello.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


/**
 * @author BBVA OpenPlatform Developer Team
 */
@RestController
@RefreshScope
public class HelloController {

    Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Value("${hello.to}")
    private String helloTo;

    private int random = new Random().nextInt();

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public ResponseEntity<Map<String, String>> hello(){

        logger.info("Saying hello to: {}", helloTo);

        Map<String, String> data = new HashMap<>();
        data.put("hello", helloTo);
        data.put("source", Integer.toString(random));

        return ResponseEntity.status(HttpStatus.OK).body(data);
    }

}
