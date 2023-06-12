package com.xworkz.satellite.config;

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
@ComponentScan("com.xworkz.satellite")
public class SatelliteConfigure implements WebMvcConfigurer {

	public SatelliteConfigure() {
		System.out.println("no args SatelliteConfigure");
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		System.out.println("Running addViewControllers method");
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
