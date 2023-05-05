package com.xworkz.spring.boot;

import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configure.CollectionConfigure;

public class CollectionRunner {
	
	public static void main(String[] args) {
		

		ApplicationContext applicationContext =new AnnotationConfigApplicationContext(CollectionConfigure.class);
		
		Stream.of(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println(applicationContext.getBeanDefinitionCount());
		System.err.println("----------------List-------------------------------------");
		System.out.println(applicationContext.getBean("name",List.class));
		System.out.println(applicationContext.getBean("rollNo",List.class));
		System.out.println(applicationContext.getBean("number",List.class));
		System.out.println(applicationContext.getBean("character",List.class));
		
		System.err.println("-----------------Queue-----------------------------------------------");
		System.out.println(applicationContext.getBean("address",Queue.class));
		System.out.println(applicationContext.getBean("id",Queue.class));
		
		System.err.println("-----------------Set------------------------------------------------------");
		System.out.println(applicationContext.getBean("vehicleType",Set.class));
		System.out.println(applicationContext.getBean("vehicleNumber",Set.class));
		System.out.println(applicationContext.getBean("floatNumber",Set.class));
		
	}
		
	}


