package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.dto.PolishDTO;
import com.xworkz.spring.service.PolishService;
import com.xworkz.spring.springConfigure.PolishConfigure;

public class PolishRunner {
	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(PolishConfigure.class);

		PolishService ref = spring.getBean(PolishService.class);

		PolishDTO dto1 = new PolishDTO("Jhon", "Black", 150, 5);

		boolean save1 = ref.validateAndSave(dto1);
		System.out.println("DTO Saved:" + save1);
	}

}
