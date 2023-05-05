package com.xworkz.spring.thing2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;
@Component
@ToString
@Setter
public class Employee {
	private int id;
	private String name;
	private String department;
	private String jobTitle;
	private double salary;
	private String email;
	private String phone;
	private String address;
	private String city;
	private String country;

	public Employee(@Value("111") int id,@Value("Shivu") String name,@Value("Education") String department,@Value("Lecture") String jobTitle,@Value("150000.0") double salary,@Value("shivu@gmail.com") String email,
			@Value("7892966782") String phone,@Value("rajajinagar") String address,@Value("Bengaluru") String city,@Value("India") String country) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.jobTitle = jobTitle;
		this.salary = salary;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.city = city;
		this.country = country;
	}
	
	public int findId() {
		System.out.println("Running find id method");
		return this.id;
	}

}
