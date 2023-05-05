package com.xworkz.spring.springConfigure;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import io.quarkus.hibernate.validator.runtime.jaxrs.QuarkusRestViolationExceptionMapper.ViolationReport.Violation;

@ComponentScan("com.xworkz.spring")
@Configuration
public class PolishConfigure {

	public PolishConfigure() {
		System.out.println("No args cons of configure");
	}
	@Bean
	public Validator validator() {
		System.out.println("Registered validator ");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		return validator;

	}

}
