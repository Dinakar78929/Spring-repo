package com.xworkz.contacts.config;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.beans.propertyeditors.ClassArrayEditor;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.contacts.constant.ContactConstant;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class ContactWebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		log.info("Running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		log.info("Running getServletConfigClasses");
		return new Class[] { ContactConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		log.info("Running getServletMappings");
		return new String[] { "/" };
	}

	@Override
	protected void customizeRegistration(Dynamic registration) {
		MultipartConfigElement configElement = new MultipartConfigElement(ContactConstant.TEMP_FILE_PATH,
				ContactConstant.MAX_SIZE, ContactConstant.MAX_SIZE * 2, ContactConstant.MAX_SIZE / 2);
		registration.setMultipartConfig(configElement);
	}
}
