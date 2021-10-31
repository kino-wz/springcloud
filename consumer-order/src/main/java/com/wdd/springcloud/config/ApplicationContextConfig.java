package com.wdd.springcloud.config;

import com.wdd.springcloud.entites.Payment;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: wz
 * @date: 2021/9/30
 * @description:
 */
@Configuration

public class ApplicationContextConfig {

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
