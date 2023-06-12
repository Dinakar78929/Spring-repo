package com.xworkz.blood.config;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class BloodWebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses");
		return new Class[] { BloodConfiguration.class };
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
		MultipartConfigElement multipartConfigElement = new MultipartConfigElement(
				"C:\\Users\\India\\Desktop\\Server\\", max, max * 2, max / 2);
		registration.setMultipartConfig(multipartConfigElement);
	}

}
