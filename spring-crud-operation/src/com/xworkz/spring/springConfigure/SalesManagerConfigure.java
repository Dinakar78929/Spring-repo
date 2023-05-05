package com.xworkz.spring.springConfigure;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@ComponentScan("com.xworkz.spring")
@Configuration
public class SalesManagerConfigure {
	public SalesManagerConfigure() {
		System.out.println("no args congigure cons");
	}
	@Bean
	public Validator validator() {
		System.out.println("Registerd validator");
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		return validator;
	}

}
