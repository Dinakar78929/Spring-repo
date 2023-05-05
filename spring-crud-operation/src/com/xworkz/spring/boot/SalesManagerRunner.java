package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.dto.SalesManagerDTO;
import com.xworkz.spring.service.SalesManagerService;
import com.xworkz.spring.service.SalesManagerServiceImpl;
import com.xworkz.spring.springConfigure.SalesManagerConfigure;

public class SalesManagerRunner {
	public static void main(String[] args) {
		ApplicationContext spring=new AnnotationConfigApplicationContext(SalesManagerConfigure.class);
		SalesManagerService managerBeans=spring.getBean(SalesManagerService.class);
		
		SalesManagerDTO salesDto=new SalesManagerDTO(123, "Kishan", "Male", 5000);
		
		boolean save1=managerBeans.validationAndSave(salesDto);
		System.out.println("Saved:"+save1);
	}
	
}
