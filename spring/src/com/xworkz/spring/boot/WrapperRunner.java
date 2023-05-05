package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configure.WrapperConfigure;

public class WrapperRunner {
	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(WrapperConfigure.class);

		System.out.println("Total Beans count : " + spring.getBeanDefinitionCount());
		System.out.println("-----------Integer Type----------------------------------------------------");
		System.out.println(spring.getBean("id", Integer.class));
		System.out.println(spring.getBean("number", Integer.class));
		System.out.println(spring.getBean("bikeNumber", Integer.class));
		System.out.println(spring.getBean("houseNumber", Integer.class));
		System.out.println(spring.getBean("roomNumber", Integer.class));
		System.out.println(spring.getBean("pinCodeNumber", Integer.class));
		System.out.println(spring.getBean("busNumber", Integer.class));
		System.out.println(spring.getBean("trainNumber", Integer.class));
		System.out.println(spring.getBean("tokenNumber", Integer.class));

		System.out.println("-----------Character Type-----------------------------------------------------");
		System.out.println(spring.getBean("apple", Character.class));
		System.out.println(spring.getBean("ball", Character.class));
		System.out.println(spring.getBean("cream", Character.class));
		System.out.println(spring.getBean("dog", Character.class));
		System.out.println(spring.getBean("eye", Character.class));
		System.out.println(spring.getBean("four", Character.class));
		System.out.println(spring.getBean("gun", Character.class));
		System.out.println(spring.getBean("house", Character.class));
		System.out.println(spring.getBean("ice", Character.class));

		System.out.println("-----------Long Type-----------------------------------------------------");
		System.out.println(spring.getBean("mobNumber", Long.class));
		System.out.println(spring.getBean("gstNumber", Long.class));
		System.out.println(spring.getBean("invoiceNumber", Long.class));
		System.out.println(spring.getBean("registrationNumber", Long.class));
		System.out.println(spring.getBean("accountNumber", Long.class));
		System.out.println(spring.getBean("uniqueNumber", Long.class));
		System.out.println(spring.getBean("chesisNumber", Long.class));
		System.out.println(spring.getBean("engineNumber", Long.class));
		System.out.println(spring.getBean("otherNumber", Long.class));

		System.out.println("-----------Float Type-----------------------------------------------------");
		System.out.println(spring.getBean("length", Float.class));
		System.out.println(spring.getBean("height", Float.class));
		System.out.println(spring.getBean("width", Float.class));
		System.out.println(spring.getBean("weight", Float.class));
		System.out.println(spring.getBean("distance", Float.class));
		System.out.println(spring.getBean("unique", Float.class));
		System.out.println(spring.getBean("destination", Float.class));
		System.out.println(spring.getBean("water", Float.class));
		System.out.println(spring.getBean("balance", Float.class));

		System.out.println("-----------Double Type-----------------------------------------------------");
		System.out.println(spring.getBean("len", Double.class));
		System.out.println(spring.getBean("hei", Double.class));
		System.out.println(spring.getBean("wid", Double.class));
		System.out.println(spring.getBean("wei", Double.class));
		System.out.println(spring.getBean("dis", Double.class));
		System.out.println(spring.getBean("uni", Double.class));
		System.out.println(spring.getBean("des", Double.class));
		System.out.println(spring.getBean("wt", Double.class));
		System.out.println(spring.getBean("ac", Double.class));

		System.out.println("-----------Byte Type-----------------------------------------------------");
		System.out.println(spring.getBean("speed1", Byte.class));
		System.out.println(spring.getBean("speed2", Byte.class));
		System.out.println(spring.getBean("speed3", Byte.class));
		System.out.println(spring.getBean("speed4", Byte.class));
		System.out.println(spring.getBean("speed5", Byte.class));
		System.out.println(spring.getBean("speed6", Byte.class));
		System.out.println(spring.getBean("speed7", Byte.class));
		System.out.println(spring.getBean("speed8", Byte.class));
		System.out.println(spring.getBean("speed9", Byte.class));

		System.out.println("-----------Short Type-----------------------------------------------------");
		System.out.println(spring.getBean("length1", Short.class));
		System.out.println(spring.getBean("length2", Short.class));
		System.out.println(spring.getBean("length3", Short.class));
		System.out.println(spring.getBean("length4", Short.class));
		System.out.println(spring.getBean("length5", Short.class));
		System.out.println(spring.getBean("length6", Short.class));
		System.out.println(spring.getBean("length7", Short.class));
		System.out.println(spring.getBean("length8", Short.class));
		System.out.println(spring.getBean("length9", Short.class));

		System.out.println("-----------Boolean Type-----------------------------------------------------");
		System.out.println(spring.getBean("condition1", Boolean.class));
		System.out.println(spring.getBean("condition2", Boolean.class));
		System.out.println(spring.getBean("condition3", Boolean.class));
		System.out.println(spring.getBean("condition4", Boolean.class));
		System.out.println(spring.getBean("condition5", Boolean.class));
		System.out.println(spring.getBean("condition6", Boolean.class));
		System.out.println(spring.getBean("condition7", Boolean.class));
		System.out.println(spring.getBean("condition8", Boolean.class));
		System.out.println(spring.getBean("condition9", Boolean.class));
	}
}
