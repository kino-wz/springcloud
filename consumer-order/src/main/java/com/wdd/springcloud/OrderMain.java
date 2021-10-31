package com.wdd.springcloud;

import com.wdd.springcloud.config.ApplicationContextConfig;
import com.wdd.springcloud.entites.Payment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.client.RestTemplate;

import java.lang.annotation.Annotation;

/**
 * @author: wz
 * @date: 2021/9/30
 * @description:
 */
@EnableEurekaClient
@SpringBootApplication
public class OrderMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(OrderMain.class, args);
//        String[] applicationName = run.getBeanDefinitionNames();
////        for (String a : applicationName) {
////            System.out.println(a);
////        }
//        RestTemplate template = run.getBean(RestTemplate.class);
//        System.out.println(template);
//
//        Object getRestTemplate = run.getBean("payment");
////        System.out.println(getRestTemplate == template);
//
//        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
//        Object template = applicationContext.getBean("payment");
//
//
//        Payment bean = applicationContext.getBean(Payment.class);
//        System.out.println(bean);
//        System.out.println(getRestTemplate);
//        System.out.println(template);
//        System.out.println(getRestTemplate == template);

    }
}
