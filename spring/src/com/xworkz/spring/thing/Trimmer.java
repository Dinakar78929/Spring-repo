package com.xworkz.spring.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Trimmer {
	@Value("Philipse")
	private String brand;
	@Value("Balck")
	private String color;
	private double price;
	@Value("10")
	private double height;
	
	
	public Trimmer(@Value("600") double price) {
		this.price = price;
	}
	
	

}
