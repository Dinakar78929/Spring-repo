package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configure.RestaurantConfigure;
import com.xworkz.spring.dto.RestaurantDTO;
import com.xworkz.spring.service.RestaurantService;

public class RestaurantDTORunner {
	public static void main(String[] args) {
		ApplicationContext spring= new AnnotationConfigApplicationContext(RestaurantConfigure.class);
		RestaurantService ref=spring.getBean(RestaurantService.class);
		
		RestaurantDTO dto1=new RestaurantDTO("Five Star", 7892966782L, 10, false);
		boolean save1=ref.validateAndSave(dto1);
		System.out.println("Saved:"+save1);
	}

}
