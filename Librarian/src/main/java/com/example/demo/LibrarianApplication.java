package com.example.demo;

import org.springframework.boot.SpringApplication;



import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import springfox.documentation.swagger2.annotations.EnableSwagger2;






//@EnableDiscoveryClient
@SpringBootApplication
@EnableAutoConfiguration
@EnableEurekaClient

public class LibrarianApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibrarianApplication.class, args);
	}
	 
}
