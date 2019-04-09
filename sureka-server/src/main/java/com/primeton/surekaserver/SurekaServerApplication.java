package com.primeton.surekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SurekaServerApplication.class, args);
    }
}
