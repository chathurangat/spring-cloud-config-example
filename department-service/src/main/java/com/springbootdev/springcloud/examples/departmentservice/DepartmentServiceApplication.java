package com.springbootdev.springcloud.examples.departmentservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DepartmentServiceApplication {

    @Value("${app.service-name}")
    private String welcomeMessage;

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}
}
