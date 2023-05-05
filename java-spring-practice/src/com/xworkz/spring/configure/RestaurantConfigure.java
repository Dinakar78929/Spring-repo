package com.xworkz.spring.configure;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.xworkz.spring")
public class RestaurantConfigure {
	public RestaurantConfigure() {
		System.out.println("No args RestaurantConfigure Const");
	}
	@Bean
	public Validator validator() {
		System.out.println("registered validator");
		ValidatorFactory factory =Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		return validator;
	}

}
