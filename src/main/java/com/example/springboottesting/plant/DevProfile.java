package com.example.springboottesting.plant;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;


//import org.example.ws.model.Greeting;
//import org.example.ws.service.GreetingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Profile("dev")
@Component
@Configuration
public class DevProfile {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostConstruct
    public void logging1() {

        int x = 0;
        while(x < 100) {
            System.out.println(">>> Loaded dev profile");
            x++;
        }

        logger.info(">>>> First logger");
        System.out.println(">>> main Sout functions ");
        logger.info("<<<< Second logger ");
    }

    @PostConstruct
    public void logging2() {

        logger.info(">>> beginning logger");

        System.out.println(">>> some more Sout here"); 
        long pause = 1000;
        long start = System.currentTimeMillis();
        System.out.println(">>> processing time ");
        logger.info("Processing time was {} seconds.", (start + pause) / 1000);
    }
}
