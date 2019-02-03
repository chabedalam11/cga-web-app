package com.mpc.cga.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.mpc.cga.api"})
public class CgaApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(CgaApiApplication.class, args);
		System.out.println("\n\n ============== CGA api started ============== \n\n");
	}
}
