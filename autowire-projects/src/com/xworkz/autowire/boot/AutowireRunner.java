package com.xworkz.autowire.boot;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.autowire.configure.SpringConfigure;
import com.xworkz.autowire.thing.Camera;
import com.xworkz.autowire.thing.EntryFee;
//import com.xworkz.autowire.thing.Camera;
//import com.xworkz.autowire.thing.EntryFee;
import com.xworkz.autowire.thing.Guide;
import com.xworkz.autowire.thing.Musuem;
import com.xworkz.autowire.thing.Security;
//import com.xworkz.autowire.thing.SensoredDoor;
import com.xworkz.autowire.thing.Thing;

public class AutowireRunner {
	public static void main(String[] args) {
		System.out.println("--------------");
		ApplicationContext spring=new AnnotationConfigApplicationContext(SpringConfigure.class);
		System.out.println(spring.getBeanDefinitionCount()); 
		Stream.of(spring.getBeanDefinitionNames()).forEach(System.out::println);
		
//		Thing ref=spring.getBean(Thing.class);
//		System.out.println(ref);
		
//		Security ref1=spring.getBean(Security .class);
//		System.out.println(ref1);
////		
//		Guide ref2=spring.getBean(Guide .class);
//		System.out.println(ref2);
		
		Camera ref1=spring.getBean(Camera.class);
		System.out.println(ref1);
		
//		SensoredDoor ref1=spring.getBean(SensoredDoor.class);
//		System.out.println(ref1);
		
//		EntryFee ref1=spring.getBean(EntryFee.class);
//		System.out.println(ref1);
		
//		Musuem ref1=spring.getBean(Musuem.class);
//		System.out.println(ref1);
		
		
	}
}
