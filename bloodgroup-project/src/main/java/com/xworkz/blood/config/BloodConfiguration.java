package com.xworkz.blood.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan("com.xworkz.blood")
public class BloodConfiguration implements WebMvcConfigurer {
	public BloodConfiguration() {
		System.out.println("No args BloodConfiguration const");
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		System.out.println("Running add viewController method");
		registry.addViewController("/").setViewName("start");
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	@Bean
	public MultipartResolver multipartResolve() {
		System.out.println("Registered multipartResolve");
		return new StandardServletMultipartResolver();

	}
}
