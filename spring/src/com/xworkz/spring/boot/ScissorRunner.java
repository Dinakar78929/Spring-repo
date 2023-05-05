package com.xworkz.spring.boot;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configure.SpringConfigure;
import com.xworkz.spring.thing.Barber;
import com.xworkz.spring.thing.Chair;
import com.xworkz.spring.thing.Saloon;
import com.xworkz.spring.thing.Scissor;
import com.xworkz.spring.thing.Trimmer;

public class ScissorRunner {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfigure.class);
		int beanDefinitionCount = spring.getBeanDefinitionCount();
		System.out.println(beanDefinitionCount);

		Stream.of(spring.getBeanDefinitionNames()).forEach(System.out::println);

		System.out.println(spring.getBean(Scissor.class));
		
		System.out.println(spring.getBean(Saloon.class));
		
		System.out.println(spring.getBean(Chair.class));
		
		System.out.println(spring.getBean(Barber.class));
		
		System.out.println(spring.getBean(Trimmer.class));
	}

}
