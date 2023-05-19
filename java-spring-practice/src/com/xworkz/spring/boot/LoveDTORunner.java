package com.xworkz.spring.boot;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configure.LoveConfigure;
import com.xworkz.spring.dto.LoveDTO;
import com.xworkz.spring.service.LoveService;

public class LoveDTORunner {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(LoveConfigure.class);

		LoveService service = spring.getBean(LoveService.class);

		LoveDTO dto1 = new LoveDTO("Jhon", "Mery", LocalDate.of(2018, 1, 27), 20, 20, true, LocalDate.of(2023, 10, 10));
		boolean save1 = service.validateAndSave(dto1);
		System.out.println("DTO Saved:" + save1);
	}

}
