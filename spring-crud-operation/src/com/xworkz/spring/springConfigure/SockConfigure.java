package com.xworkz.spring.springConfigure;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Configuration
@ComponentScan("com.xworkz.spring")
public class SockConfigure {
	public SockConfigure() {
		System.out.println("no args sockConfigure");
	}
	
	@Bean
	public Validator validator() {
		System.out.println("Registered validator ");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		return validator;

	}

}
