package com.madushan.allocationtwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AllocationtwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AllocationtwoApplication.class, args);
    }

}
