package com.xworkz.parking.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import lombok.extern.slf4j.Slf4j;

@Configuration
@ComponentScan("com.xworkz")
@EnableWebMvc
@Slf4j
public class ParkingConfiguration implements WebMvcConfigurer {

	public ParkingConfiguration() {
		log.info("no-arg constructor of ParkingConfiguration");
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		log.info("Running addViewControllers");
		registry.addViewController("/").setViewName("Home.jsp");
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	@Bean
	public MultipartResolver multipartResolver() {
		return new StandardServletMultipartResolver();
	}
}
