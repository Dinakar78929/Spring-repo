package com.xworkz.spring.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;
@Component
@ToString
public class Barber {
	private String name;
	private int experiance;
	private double salary;
	private int age;
	private long contactNo;
	private String gender;
	
	
	public Barber(@Value("Prasad") String name,@Value("15") int experiance,@Value("20000") double salary,@Value("50") int age,@Value("2345678901") long contactNo,@Value("Male") String gender) {
		this.name = name;
		this.experiance = experiance;
		this.salary = salary;
		this.age = age;
		this.contactNo = contactNo;
		this.gender = gender;
	}
	
	
}
