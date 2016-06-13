package com.uacity.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Ted on 16/4/21.
 */

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main( String[] args ) {
        SpringApplication.run(Application.class, args);
    }
}
