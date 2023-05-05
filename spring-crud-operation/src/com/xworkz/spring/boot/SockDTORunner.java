package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.dto.PolishDTO;
import com.xworkz.spring.dto.SockDTO;
import com.xworkz.spring.service.PolishService;
import com.xworkz.spring.service.SockService;
import com.xworkz.spring.springConfigure.PolishConfigure;
import com.xworkz.spring.springConfigure.SockConfigure;

public class SockDTORunner {
	
	public static void main(String[] args) {
		ApplicationContext spring=new AnnotationConfigApplicationContext(SockConfigure.class);
		
		SockService ref=spring.getBean(SockService.class);
		
		SockDTO dto1=new SockDTO("Add", 7, "White", 120);
		
		boolean save1=ref.validationAndSave(dto1);
		System.out.println("DTO Saved:"+save1);
	}
	
}

