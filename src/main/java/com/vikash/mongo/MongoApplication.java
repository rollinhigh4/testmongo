package com.vikash.mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MongoApplication  {

	public static void main(String[] args) {
		SpringApplication.run(MongoApplication.class, args);
	}

}
