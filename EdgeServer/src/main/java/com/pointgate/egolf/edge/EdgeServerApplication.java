package com.pointgate.egolf.edge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulServer
@EnableAutoConfiguration
public class EdgeServerApplication {

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "edge-server");
		SpringApplication.run(EdgeServerApplication.class, args);
	}
}
