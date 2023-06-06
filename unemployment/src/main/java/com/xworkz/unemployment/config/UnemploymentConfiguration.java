package com.xworkz.unemployment.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
@EnableWebMvc
@ComponentScan("")
public class UnemploymentConfiguration implements WebMvcConfigurer{
	public UnemploymentConfiguration() {
		System.out.println("no args UnemploymentConfiguration const");
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		System.out.println("running add view controller method");
		registry.addViewController("/").setViewName("/Welcome.jsp");
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	configurer.enable();
	}
}
