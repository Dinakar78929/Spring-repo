package com.xworkz.spring.boot;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configure.MobileConfigure;
import com.xworkz.spring.dto.MobileDTO;
import com.xworkz.spring.service.MobileService;

public class MobileRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(MobileConfigure.class);
		MobileService service = context.getBean(MobileService.class);

		MobileDTO dto1 = new MobileDTO("VIVO", 10000, "Blue", 4000);

		boolean save1 = service.validateAndSave(dto1);
		if (save1 == true) {
			System.out.println("Saved:" + save1);
		} else {
			System.err.println("Saved:" + save1);
		}

	}

}
