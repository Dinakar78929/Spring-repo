package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configure.GardenConfigure;
import com.xworkz.spring.dto.GardenDTO;
import com.xworkz.spring.service.GardenService;

public class GardenDTORunner {
	public static void main(String[] args) {
		ApplicationContext spring= new AnnotationConfigApplicationContext(GardenConfigure.class);
		
		GardenService ref=spring.getBean(GardenService.class);
		
		GardenDTO dto1= new GardenDTO("Pavan", 10, 2, 2.5D, 2);
		
		boolean save1=ref.validateAndSave(dto1);
		System.out.println("Saved:"+save1);
	}

}
