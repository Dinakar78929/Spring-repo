package com.xworkz.parking.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan("com.xworkz.parking")
public class ParkingConfiguration implements WebMvcConfigurer {
	public ParkingConfiguration() {
		System.out.println("no args ParkingConfiguration const");
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		System.out.println("Running addViewControllers method");
		registry.addViewController("/").setViewName("Home.jsp");
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
}
