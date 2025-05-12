package com.example.BeanExample.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.lang.module.Configuration;

@SpringBootApplication
public class BeanExample2Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext context= SpringApplication.run(BeanExample2Application.class, args);
	}

}
