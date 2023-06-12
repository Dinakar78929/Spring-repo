package com.xworkz.satellite.config;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SatelliteWebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses");
		return new Class[] { SatelliteConfigure.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings");
		return new String[] { "/" };
	}

	@Override
	protected void customizeRegistration(Dynamic registration) {
		System.out.println("Running customizeRegistration");
		int max = 8000000;
		MultipartConfigElement configElement = new MultipartConfigElement("C:/Users/India/Desktop/Shambu", max, max * 2,
				max / 2);
		registration.setMultipartConfig(configElement);
	}

}
