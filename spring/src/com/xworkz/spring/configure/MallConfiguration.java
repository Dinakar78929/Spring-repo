package com.xworkz.spring.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.xworkz.spring.thing2.Mouse;

@ComponentScan("com.xworkz.spring.configure.MallConfiguration")
@Configuration
public class MallConfiguration {

	@Bean
	public String MallName() {
		System.out.println("Running mallName method");
		return Mouse.name();
	}

	@Bean
	public String mallOwner() {
		System.out.println("Running mallOwner method");
		return "JHON";
	}

	@Bean
	public String mallLocation() {
		System.out.println("Running mallLocation method");
		return "Bengaluru";
	}
	
	@Bean
	public String mallFloor() {
		System.out.println("Running mallFloor method");
		return "5";
	}
	
	@Bean
	public String mallEngineer() {
		System.out.println("Running mallEngineer method");
		return "Tailor";
	}
	
	@Bean
	public String mallColor() {
		System.out.println("Running mallColor method");
		return "white";
	}
	
	@Bean
	public String mallInfrastructure() {
		System.out.println("Running mallInfrastructure method");
		return "Owsome";
	}
	@Bean
	public String mallGameCenter() {
		System.out.println("Running mallGameCenter method");
		return "Funtora";
	}
	
	@Bean
	public String mallFoodCenter() {
		System.out.println("Running mallFoodCenter method");
		return "KFC";
	}
	
	@Bean
	public String mallHyperMarket() {
		System.out.println("Running mallHyperMarket method");
		return "Saro";
	}
}
