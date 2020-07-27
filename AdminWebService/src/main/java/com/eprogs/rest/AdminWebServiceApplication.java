package com.eprogs.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.eprogs"})
@EntityScan("com.eprogs.spring.dal.entity")

public class AdminWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminWebServiceApplication.class, args);
	}

}
