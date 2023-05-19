package com.xworkz.spring.configure;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import io.quarkus.hibernate.validator.runtime.jaxrs.QuarkusRestViolationExceptionMapper.ViolationReport.Violation;
@Configuration
@ComponentScan("com.xworkz.spring")
public class MobileConfigure {
	
	public MobileConfigure() {
		System.out.println("No args MobileConfigure const");
	}
	@Bean
	public Validator validator() {
		System.out.println("Registered validator");
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		return validator;
	}
}
