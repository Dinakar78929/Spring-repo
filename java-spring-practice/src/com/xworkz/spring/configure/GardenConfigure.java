package com.xworkz.spring.configure;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.xworkz.spring")
public class GardenConfigure {
	public GardenConfigure() {
		System.out.println("no args GardenConfigure const");
	}
	@Bean
	public Validator validator() {
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		return validator;
	}
}
