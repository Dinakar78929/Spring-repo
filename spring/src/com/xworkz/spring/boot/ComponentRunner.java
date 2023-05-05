package com.xworkz.spring.boot;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configure2.SpringConfigure2;
import com.xworkz.spring.thing2.Bag;
import com.xworkz.spring.thing2.Bottel;
import com.xworkz.spring.thing2.Cable;
import com.xworkz.spring.thing2.Charger;
import com.xworkz.spring.thing2.CoolingPad;
import com.xworkz.spring.thing2.EarPhone;
import com.xworkz.spring.thing2.Employee;
import com.xworkz.spring.thing2.Institute;
import com.xworkz.spring.thing2.Mobile;
import com.xworkz.spring.thing2.Mouse;

public class ComponentRunner {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfigure2.class);
		
		System.out.println("No of bean :" + spring.getBeanDefinitionCount());
		
		System.out.println("--Beans Names are----");
		Stream.of(spring.getBeanDefinitionNames()).forEach(System.out::println);
		
		
		System.out.println("----------Running Mouse Component Class------------");
//		System.out.println(spring.getBean(Mouse.class));
		Mouse ref = spring.getBean(Mouse.class);
		System.out.println(ref);
//		ref.name();

		//ref.setName("Dell");
//		System.out.println(ref);
		System.out.println(ref.name());

		System.out.println("------------Running Mobile Component Class----------------");
		Mobile mobile = spring.getBean(Mobile.class);
		System.out.println(mobile);

		System.out.println(mobile.price());
		;

		System.out.println("------------Running Cable Component Class----------------");
		Cable cable = spring.getBean(Cable.class);
		System.out.println(cable);
		System.out.println(cable.isGood());
		
		System.out.println("------------Running EarPhone Component Class----------------");
		EarPhone earPhone=spring.getBean(EarPhone.class);
		System.out.println(earPhone);
		System.out.println(earPhone.count());
		
		System.out.println("------------Running Bottel Component Class----------------");
		Bottel bottel=spring.getBean(Bottel.class);
		System.out.println(bottel);
		System.out.println(bottel.brand());
		
		System.out.println("------------Running Bag Component Class----------------");
		Bag bag=spring.getBean(Bag.class);
		System.out.println(bag);
		System.out.println(bag.length());
		
		System.out.println("------------Running CoolingPad Component Class----------------");
		CoolingPad coolingPad=spring.getBean(CoolingPad.class);
		System.out.println(coolingPad);
		System.out.println(coolingPad.isRun());
		
		System.out.println("------------Running Charger Component Class----------------");
		Charger charger=spring.getBean(Charger.class);
		System.out.println(charger);
		System.out.println(charger.type());
		
		System.out.println("------------Running Employee Component Class----------------");
		Employee employee=spring.getBean(Employee.class);
		System.out.println(employee);
		System.out.println(employee.findId());
		
		System.out.println("------------Running Institute Component Class----------------");
		Institute institute=spring.getBean(Institute.class);
		System.out.println(institute);
		System.out.println(institute.findContactPersonName());

	}

}
