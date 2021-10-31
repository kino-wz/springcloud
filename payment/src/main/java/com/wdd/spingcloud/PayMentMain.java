package com.wdd.spingcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: wz
 * @date: 2021/9/29
 * @description:
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableEurekaClient
public class PayMentMain {
    public static void main(String[] args) {
        SpringApplication.run(PayMentMain.class, args);

    }
}
