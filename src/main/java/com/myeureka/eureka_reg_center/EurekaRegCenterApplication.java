package com.myeureka.eureka_reg_center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaRegCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaRegCenterApplication.class, args);
    }
}
