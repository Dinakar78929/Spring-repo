package com.xworkz.registration.config;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;
import javax.servlet.annotation.MultipartConfig;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
@MultipartConfig
public class RegistrationWebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses");
		return new Class[] { RegistrationConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings");
		return new String[] { "/" };
	}

	@Override
	protected void customizeRegistration(Dynamic registration) {
		int size = 10000000;
		MultipartConfigElement configElement = new MultipartConfigElement("C:\\Users\\India\\Desktop\\Server\\temp\\",
				size, size * 2, size / 2);
		registration.setMultipartConfig(configElement);
	}

}
