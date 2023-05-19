package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configure.RefregiratorConfigure;
import com.xworkz.spring.dto.RefregiratorDTO;
import com.xworkz.spring.service.RefregiratorService;
import com.xworkz.spring.service.RefregiratorServiceImpl;

public class RefregiratorRunner {
	public static void main(String[] args) {
		ApplicationContext spring=new AnnotationConfigApplicationContext(RefregiratorConfigure.class);
		RefregiratorService service=spring.getBean(RefregiratorService.class);
		
		RefregiratorDTO dto1=new RefregiratorDTO("Whirlpool", 100000, "Blue", 5.4, 10);
		
		boolean save1=service.validateAndSave(dto1);
		if(save1!=true) {
		System.err.println("DTO Saved:"+save1);
		}
		else {
			System.out.println("DTO Saved:"+save1);
		}
	}

}
