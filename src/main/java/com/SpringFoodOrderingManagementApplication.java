package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com" })
public class SpringFoodOrderingManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFoodOrderingManagementApplication.class, args);
	}

}
