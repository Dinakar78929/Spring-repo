package com.xworkz.spring.configure;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spring")
public class LoveConfigure {
	public LoveConfigure() {
		System.out.println("no args LoveConfigure args");
	}

	@Bean
	public Validator validator() {
		System.out.println("Registered validator");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		return validator;
	}
}
