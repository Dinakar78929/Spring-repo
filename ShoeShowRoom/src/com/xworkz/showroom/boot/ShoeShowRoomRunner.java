package com.xworkz.showroom.boot;

import javax.swing.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.showroom.configure.ShoeConfigure;
import com.xworkz.showroom.dto.ShoeShowRoomDTO;
import com.xworkz.showroom.service.ShoeShowRoomService;

public class ShoeShowRoomRunner {
	
	public static void main(String[] args) {
		ApplicationContext spring=new AnnotationConfigApplicationContext(ShoeConfigure.class);
		ShoeShowRoomService ref=spring.getBean(ShoeShowRoomService.class);
		
		ShoeShowRoomDTO dto1=new ShoeShowRoomDTO(199, "Jhhhh","Rajajinagar", "gst 1234");
		System.out.println(dto1);
		boolean save1=ref.ValidateAndSave(dto1);
		System.out.println("Saved:"+save1);
	}
	
	

}
