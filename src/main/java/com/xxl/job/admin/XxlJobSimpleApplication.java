package com.xxl.job.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class XxlJobSimpleApplication {

    public static void main(String[] args) {
        SpringApplication.run(XxlJobSimpleApplication.class, args);
    }

}
